CREATE TABLE `students` (
`id` bigint NOT NULL AUTO_INCREMENT,
`firstname` varchar(255) DEFAULT NULL,
`lastname` varchar(255) DEFAULT NULL,
`age` int DEFAULT NULL,
`email` varchar(255) DEFAULT NULL,
`mobile` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE employees (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
department VARCHAR(100),
salary DECIMAL(10,2)
);


DELIMITER //
CREATE PROCEDURE GetEmployeesByDepartment(IN dept VARCHAR(100))
BEGIN
SELECT * FROM employees WHERE department = dept;
END //
DELIMITER ;


SHOW PROCEDURE STATUS WHERE Db = 'student_db';

CALL GetEmployeesByDepartment('IT');
