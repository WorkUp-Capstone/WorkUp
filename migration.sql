DROP DATABASE IF EXISTS workup_db;
CREATE DATABASE IF NOT EXISTS workup_db;

USE workup_db; 

INSERT INTO role(role)
VALUES('owner'), ('developer');

INSERT INTO status(status)
VALUES('open'), ('in_progress');

INSERT INTO categories(name)
VALUES ('Front_end_development'), ('Back_end_development'), ('Full_stack_development'), ('MySQL'), ('CSS'), ('HTML'), ('Spring'), ('Java'), ('JQuery'), ('JavaScript'), ('AJAX'), ('Authentication'), ('Email_service'), ('Database'), ('UI_UX'), ('RESTful_API');