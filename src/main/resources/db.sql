CREATE DATABASE cms_hospital;
USE cms_hospital;

CREATE TABLE admin(
id INT AUTO_INCREMENT PRIMARY KEY,
email VARCHAR(100) NOT NULL,
username VARCHAR(100) NOT NULL,
password VARCHAR(255) NOT NULL,
full_name VARCHAR(100),
image VARCHAR(100),
gender VARCHAR(50),
date DATE NOT NULL
);