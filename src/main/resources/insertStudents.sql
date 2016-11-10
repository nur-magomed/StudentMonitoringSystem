INSERT INTO students VALUES (1, 'Ivan', 'Ivanov', '1991-12-11', 'male');

INSERT INTO students VALUES (2, 'Petr', 'Ivanov', '1991-11-12', 'male');

INSERT INTO students VALUES (3, 'Anna', 'Petrova', '1995-05-01', 'female');

INSERT INTO lessons VALUES (1, 'Java-Core',  '2016-10-01');

INSERT INTO lessons VALUES (2, 'Java-Spring',  '2016-10-21');

INSERT INTO lessons VALUES (3, 'Spring-Security',  '2016-10-27');

INSERT INTO students_lessons VALUES (1, 1);

INSERT INTO students_lessons VALUES (1, 2);

INSERT INTO students_lessons VALUES (1, 3);

INSERT INTO students_lessons VALUES (2, 2);

INSERT INTO students_lessons VALUES (2, 3);

INSERT INTO students_lessons VALUES (3, 1);

INSERT INTO students_lessons VALUES (3, 3);