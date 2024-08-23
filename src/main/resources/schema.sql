CREATE TABLE IF NOT EXISTS JobListing (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    city VARCHAR(50),
    country VARCHAR(50),
    workStyle VARCHAR(50),
    salary INTEGER,
    industry VARCHAR(50),
    status VARCHAR(50),
    dateListed TIMESTAMP NULL,
    dateAdded TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    url VARCHAR(255)
);

INSERT INTO JobListing(title,description,city,country,workStyle,salary,industry,status,dateAdded)
VALUES('My First Job', 'Lorem ipsum','Vancouver','Canada','REMOTE',50000,'TECHNOLOGY','SENT',CURRENT_TIMESTAMP);