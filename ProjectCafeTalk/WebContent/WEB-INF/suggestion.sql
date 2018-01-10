create table board_suggestion
(num number primary key, 
writer varchar2(100), 
title varchar2(100), 
smallTitle varchar2(100), 
content CLOB, 
viewCount number, 
regdate DATE
);

create sequence board_suggestion_seq;