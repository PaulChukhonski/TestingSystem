USE testingSystem;

INSERT INTO topic 
VALUES
(1, 'course to test grammar knowledge', 'English grammar'),
(2, 'course to test vocabulary knowledge', 'English vocabulary');

INSERT INTO test 
VALUES
(1, 'Grammar-1', 'tests grammar knowledge (Level-A1)', 1),
(2, 'Grammar-2', 'tests  grammar knowledge (Level-A2)', 1),
(3, 'Vocabulary-1', 'tests vocabulary knowledge', 2);

INSERT INTO question 
VALUES
(1, 'He … a student',  1),
(2, 'There … a table, a chair and a sofa in the room.', 1),
(3, 'There are a lot of red and yellow … on the trees', 3);

INSERT INTO answer 
VALUES
(1, 'am', false, 1),
(2, 'is', true, 1),
(3, 'are', false, 1),

(4, 'were', true, 2),
(5, 'are', false, 2),
(6, 'is', false, 2),

(7, 'leave', false, 3),
(8, 'leafs', true, 3),
(9, 'leaves', false, 3);

INSERT INTO role 
VALUES
(1, 'User'),
(2, 'Admin'),
(3, 'Tutor');

INSERT INTO user 
VALUES
(1, 'User', 'User', 'User', 'User', 1),
(2, 'Admin', 'Admin', 'Admin', 'Admin', 2),
(3, 'Tutor', 'Tutor', 'Tutor', 'Tutor', 3),
(4, 'Test', 'Test', 'Test', 'Test', 1);

INSERT INTO statistic 
VALUES
(1, '2021-04-30', true, 1, 1),
(2, '2021-04-30', true, 2, 1),
(3, '2021-04-30', true, 1, 4),
(4, '2021-04-30', false, 2, 4);

INSERT INTO literature 
VALUES
(1, 'English Grammar part 1',  1),
(2, 'English Grammar part 2',  2),
(3, 'English Vocabulary',  3);

INSERT INTO link 
VALUES
(1, 'https://www.examenglish.com/grammar/a1_grammar.html', 1),
(2, 'https://www.examenglish.com/grammar/a2_grammar.html', 2),
(3, 'https://lingualeo.com/en', 3);