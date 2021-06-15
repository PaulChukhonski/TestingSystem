# question statistic
CREATE VIEW question_description$count_passed_question AS select q.description, count(q.questionId) as count_passed_question from question q inner join statistic s on q.questionId = s.question_questionId group by q.description;
CREATE VIEW question_description$count_corrected_answered AS select q.description, count(q.questionId) as count_correct_answered from question q inner join statistic s on q.questionId = s.question_questionId where s.correct=true group by q.description;
create view question_description$count_passed_question$corrected_answered as select q1.description,q1.count_passed_question,q2.count_correct_answered from question_description$count_passed_question q1 inner join question_description$count_corrected_answered q2 on q1.description=q2.description group by q1.description;
create view question_statistic as select description, count_passed_question, (count_correct_answered/count_passed_question) from question_description$count_passed_question$corrected_answered;
select * from question_statistic;

# test statistic
CREATE VIEW test_description$count_correct_answers AS select distinct t.name, count( s.statisticId) from test t inner join question q on t.testId = q.testId inner join statistic s on q.questionId = s.question_questionId where s.correct=true group by t.name;
CREATE VIEW test_description$all_attempt_to_answer AS select t.name, count(t.testId) as count_attemts from test t inner join question q on t.testId = q.testId inner join statistic s on q.questionId = s.question_questionId group by t.testId;
CREATE VIEW test_description$count_question_in_each_test AS select distinct t.name, count(q.testId) from test t inner join question q on t.testId = q.testId group by t.name;
create view statistic_test as select t.name, t3.count_attemts/t.count_question_in_each_test as passed_in_total, t2.count_correct_answers/t3.count_attemts as percentage_of_correct_answers  from test_description$count_question_in_each_test t inner join test_description$count_correct_answers t2 on t.name=t2.name inner join test_description$all_attempt_to_answer t3 on t2.name=t3.name;
select * from statistic_test;

# user statistic
create view user_statistic$all_answer as select u.firstName, u.lastName, t.name, q.testId, count(*) as count_all_answer from user u inner join statistic s on u.userId = s.user_userId inner join question q on s.question_questionId = q.questionId inner join test t on q.testId = t.testId group by u.firstName, u.lastName, t.name,q.testId;
create view user_statistic$passed as select vtable.firstName, vtable.lastName, vtable.name, vtable.count_all_answer/t.count_question_in_each_test as passed from user_statistic$all_answer vtable inner join test_description$count_question_in_each_test t on vtable.name=t.name;
create view user_statistic$correct_answer as select u.firstName, u.lastName, t.name, count(*) as correct_answer from user u inner join statistic s on u.userId = s.user_userId inner join question q on s.question_questionId = q.questionId inner join test t on q.testId = t.testId where s.correct=true group by u.firstName, u.lastName, t.name;
create view user_statistic as select t1.firstName, t1.lastName, t1.name,t1.passed, (t2.correct_answer/t3.count_all_answer) as persent from user_statistic$passed t1 inner join user_statistic$correct_answer t2 on t1.firstName=t2.firstName and t1.lastName=t2.lastName and t1.name=t2.name inner join user_statistic$all_answer t3 on t2.firstName=t3.firstName and t2.lastName=t3.lastName and t2.name=t3.name;



