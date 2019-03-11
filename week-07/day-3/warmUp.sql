CREATE DATABASE hundred_acre_wood;

SHOW DATABASES;

USE hundred_acre_wood;

CREATE TABLE inhabitants (
	id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(30) NOT NULL,
    gender ENUM("F", "M"),
    age TINYINT UNSIGNED
);

SHOW TABLES;

INSERT INTO inhabitants VALUES(NULL, "Micimackó", "M", 6);
INSERT INTO inhabitants(age, name, gender) VALUES(5, "Malacka", "M");

SELECT * FROM inhabitants;

DELETE FROM inhabitants
	WHERE id = 2;

SELECT * FROM inhabitants;

UPDATE inhabitants
	SET age = 15
    WHERE id = 3;
    
SELECT * FROM inhabitants;

