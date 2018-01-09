CREATE TABLE talk(
title VARCHAR2(100) NOT NULL,
writer VARCHAR2(100) NOT NULL,
content CLOB,
LikeCount NUMBER,
commandCount NUMBER, 
regdate DATE
);