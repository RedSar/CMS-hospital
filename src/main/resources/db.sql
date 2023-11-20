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

CREATE TABLE doctors(
id INT AUTO_INCREMENT PRIMARY KEY,
doctorId VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL,
fullName VARCHAR(100) NOT NULL,
password VARCHAR(255) NOT NULL,
status VARCHAR(50) NOT NULL,
mobile BIGINT ,
specialized VARCHAR(100),
address VARCHAR(100),
image VARCHAR(100),
gender VARCHAR(50),
date DATETIME NOT NULL,
last_modify_date DATETIME,
last_delete_date DATETIME
);
CREATE TABLE patients (
	id INT AUTO_INCREMENT PRIMARY KEY,
    patientId VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    mobile BIGINT ,
    address VARCHAR(255),
    image VARCHAR(255),
    description TEXT,
    diagnosis TEXT,
    treatment TEXT,
	doctor_id INT,
    specialized VARCHAR(100),
    gender VARCHAR(50),
    date DATETIME NOT NULL,
    last_date_modify DATETIME,
    last_date_delete DATETIME,
    status VARCHAR(50) NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);

ALTER TABLE patients
DROP FOREIGN KEY patients_ibfk_1;