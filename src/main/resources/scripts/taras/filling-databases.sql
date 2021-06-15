INSERT INTO testingSystem.role (role)
VALUES ('ROLE_USER'), ('ROLE_ADMIN'), ('ROLE_TUTOR');

INSERT INTO testingSystem.user (firstName, lastName, login, password, role_roleId)
VALUES ('Admin', 'Admin', 'admin', '$2a$10$HZXXsAVQ/yi3iMYq3IY.H.09IPcGyadMJWUy0hqJia.G.FcJ/0d42', 2),
       ('Tutor', 'Tutor', 'tutor', '$2a$10$f3VLhjpMJg/Mxs/s/9/LluytvkE9TrvzAPMwhAJxt.8yvWq9XqUme', 3),
       ('Phoenix','Beasley','User1','$2a$10$Qvaep6Dyi4hQ9M622CznbeE0/7aRu4zEAqN3zE/2CFmHOBVtZs1oq',1),
       ('Anya','Meyers','User2','$2a$10$ccXWz8X6COrh68bDl9h4feB5JatQ7cuPIaHbQ3XCcNwkUMlMqtIVe',1),
       ('Will','Armstrong','User3','$2a$10$Bk3Jel7B2UCU9TAb8EMHKOBdNl2RBULNbsWzIWt5f/Vxyoqu6VVj.',1);



##add some users

INSERT INTO testingSystem.topic (description, name)
VALUES ('Articles are words that define a noun as specific or unspecific.', 'Articles'),
       ('The simple past is a verb tense that is used to talk about things that happened or existed before now.',
        'Past Simple'),
       ('We use the present simple tense to express the following ideas: To state facts or general truths, To express habits or customs.',
        'Present Simple'),
       ('The simple future is a verb tense that’s used to talk about things that haven’t happened yet.',
        'Future Simple');

INSERT INTO testingSystem.test (description, name, topicId)
VALUES ('It is necessary to arrange the articles correctly', 'Сorrect arrangement of articles 1', 1),
       ('It is necessary to arrange the articles correctly', 'Сorrect arrangement of articles 2', 1),
       ('Filling in the gaps', 'Past Simple Test 1', 2),
       ('Filling in the gaps', 'Present Simple Test 1', 3),
       ('Filling in the gaps', 'Future Simple Test 1', 4);

INSERT INTO testingSystem.link (link)
VALUES ('https://www.grammarly.com/blog/articles/'),
       ('https://www.grammarly.com/blog/simple-past/'),
       ('https://www.grammarly.com/blog/simple-present/'),
       ('https://www.grammarly.com/blog/simple-future/');

INSERT INTO testingSystem.literature (description, link_linkId)
VALUES ('Read article about articles.', 1),
       ('Read article about Past Simple Tense.', 2),
       ('Read article about Present Simple Tense.', 3),
       ('Read article about Future Simple Tense.', 4);

INSERT INTO testingSystem.question (description, literature_literatureId, testId)
VALUES ('This is ... book. ', 1, 1),
       ('I have ... dog.', 1, 1),
       ('Open ... door, please. ', 1, 1),
       ('I have ... idea!', 1, 1),
       ('Where is ... key?', 1, 1),
       ('It was warm, so I ... off my coat. (take)', 2, 2),
       (' I was very tired, so I ... to bed early. (go)', 2, 2),
       ('I was in a hurry, so I ... time to phone you. (have)', 2, 2),
       ('My sister … very clever.', 3, 3),
       ('What … she do?', 3, 3),
       ('Yes, I ... visit my grandparents.', 4, 4),
       (' Why is she learning Spanish? - She travel to Spain.', 4, 4);

INSERT INTO testingSystem.answer (correct, description, questionId)
VALUES (true, 'a', 1),
       (false, 'an', 1),
       (true, 'a', 2),
       (false, 'an', 2),
       (true, 'a', 3),
       (false, 'an', 3),
       (false, 'a', 4),
       (true, 'an', 4),
       (true, 'a', 5),
       (false, 'an', 5),
       (false, 'take', 6),
       (true, 'took', 6),
       (false, 'taken', 6),
       (false, 'go', 7),
       (true, 'went', 7),
       (false, 'gone', 7),
       (false, 'has', 8),
       (true, 'have', 8),
       (false, 'had', 8),
       (false, 'does', 9),
       (true, 'is', 9),
       (false, 'has', 9),
       (false, 'do', 10),
       (true, 'does', 10),
       (false, 'will', 11),
       (true, 'am going', 11),
       (true, 'will', 12),
       (false, 'am going', 12);

INSERT INTO testingSystem.statistic (correct, date, question_questionId, user_userId)
VALUES (true, '2021-06-13', 1, 3),
        (true, '2021-06-13', 2, 3),
       (true, '2021-06-13', 3, 3),
        (false, '2021-06-13', 4, 3),
       (false, '2021-06-13', 5, 3),
       (false, '2021-06-13', 1, 4),
       ( false, '2021-06-13', 2, 4),
       (false, '2021-06-13', 3, 4),
       (true, '2021-06-13', 4, 4),
       (true, '2021-06-13', 5, 4),
       (false, '2021-06-13', 1, 5),
       (true, '2021-06-13', 2, 5),
       (false, '2021-06-13', 3, 5),
       (true, '2021-06-13', 4, 5),
       (false, '2021-06-13', 5, 5),
       (true, '2021-06-13', 6, 3),
       (true, '2021-06-13', 7, 3),
       (true, '2021-06-13', 8, 3),
       (false, '2021-06-13', 6, 4),
       (false, '2021-06-13', 7, 4),
       (false, '2021-06-13', 8, 4),
       (true, '2021-06-13', 6, 5),
       (true, '2021-06-13', 7, 5),
       (true, '2021-06-13', 8, 5),
       (true, '2021-06-13', 9, 3),
       (true, '2021-06-13', 10, 3),
       (true, '2021-06-13', 9, 4),
       (false, '2021-06-13', 10, 4),
       (false, '2021-06-13', 9, 5),
       (false, '2021-06-13', 10, 5),
       (true, '2021-06-13', 11, 3),
       (true, '2021-06-13', 12, 3),
       (true, '2021-06-13', 11, 4),
       (true, '2021-06-13', 12, 4),
       (true, '2021-06-13', 11, 5),
       (false, '2021-06-13', 12, 5);
