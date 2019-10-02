DROP TABLE IF EXISTS toy;

CREATE TABLE toy
(
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR (16) not null,
   description VARCHAR (140) not null,
);



DROP TABLE IF EXISTS Other_items;
CREATE TABLE Other_items
(
   item_id BIGINT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR (16) not null,
   category VARCHAR (20) not null,
   quantity INT not null,
   zipcode VARCHAR(10) not null,
   date_posted DATE not null,
);


DROP TABLE IF EXISTS clothes;
CREATE TABLE clothes
(
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
   style VARCHAR (16) not null,
   size VARCHAR (16) not null,
   color VARCHAR (10) not null
);