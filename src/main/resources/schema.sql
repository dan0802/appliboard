CREATE TABLE IF NOT EXISTS JobListing (
    id INT NOT NULL,
    title varchar(250) NOT NULL,
    description varchar(250) NOT NULL,

);

INSERT INTO JobListing(title,description,city,country,workStyle,salary,industry,status,dateAdded)
VALUES('My First Job', 'Lorem ipsum','Vancouver','Canada','REMOTE',50000,'TECHNOLOGY','SENT',CURRENT_TIMESTAMP);