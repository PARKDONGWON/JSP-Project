create table board_notice 
(num number primary key, 
writer varchar2(100), 
title varchar2(100), 
smallTitle varchar2(100), 
contetne CLOB, 
viewCount number, 
regdate DATE, 
viewlike number)

create sequence board_notice_seq;

create tableboard_notice_comment
(num number primary key,
writer varchar2(100),
content varchar2(500),
target_id varchar2(100),
ref_group number,
comment_group number,
regdate DATE);