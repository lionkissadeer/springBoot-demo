CREATE MEMORY TABLE CUSTOMER (
  id       INT IDENTITY PRIMARY KEY,
  username VARCHAR(128),
  age      INT,
  sex      INT
);

-- SET SCHEMA PUBLIC;

INSERT INTO CUSTOMER (username, age, sex) VALUES ('李岸虹', 23, 1);
INSERT INTO CUSTOMER (username, age, sex) VALUES ('杰克', 22, 1);
INSERT INTO CUSTOMER (username, age, sex) VALUES ('安妮', 21, 0);