CREATE TABLE IF NOT EXISTS TASKS (
    ID VARCHAR(36) PRIMARY KEY,
    TITLE VARCHAR(255),
    DESCRIPTION VARCHAR(1000),
    DONE TINYINT(1)
);

CREATE TABLE IF NOT EXISTS USERS (
    USERNAME VARCHAR(200) NOT NULL PRIMARY KEY,
    PASSWORD VARCHAR(250) NOT NULL,
    EMAIL VARCHAR(250) NOT NULL
);