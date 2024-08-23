CREATE TABLE IF NOT EXISTS Job (
    id INT NOT NULL,
    title varchar(250) NOT NULL,
    description varchar(250),
    salary INT,
    type varchar(50),
    industry varchar(50),
    status varchar(50),
    work_style varchar(50),
    date_added datetime NOT NULL
);
