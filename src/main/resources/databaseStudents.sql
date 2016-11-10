-- Table: students
CREATE TABLE students(

  id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  firstname   VARCHAR(255) NOT NULL ,
  lastname    VARCHAR(255) NOT NULL ,
  birth_date  DATE,
  gender      VARCHAR(20)

) ENGINE = InnoDB;

-- Table: lessons
CREATE TABLE lessons(
  id            INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  topic         VARCHAR(50) NOT NULL ,
  lesson_date   DATE NOT NULL
) ENGINE = InnoDB;

-- Table for mapping students and lessons: students_lessons
CREATE TABLE students_lessons(
  student_id INT NOT NULL ,
  lesson_id INT NOT NULL ,

  FOREIGN KEY (student_id) REFERENCES students(id),
  FOREIGN KEY (lesson_id) REFERENCES lessons(id)

) ENGINE = InnoDB;



