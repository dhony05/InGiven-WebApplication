DROP TABLE IF EXISTS toy;
CREATE TABLE toy
(
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR (16) not null,
   description VARCHAR (140) not null,
);