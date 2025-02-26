CREATE TABLE kdy01_login (
	l_ID varchar2(10 char) primary key,
	l_PW varchar2(10 char) not null
);

CREATE TABLE kdy01_check (
	c_check varchar2(10 char) not null
);

insert into kdy01_login values ('ehdud1012', '1012');

insert into kdy01_check values ('1012');

delete from kdy01_login where l_ID ='ehdud1012';

select count(l_PW) from kdy01_login where l_PW = (select c_check from kdy01_check);
drop table kdy01_check cascade constraint purge;
select * from kdy01_login;
select * from kdy01_check;
delete from kdy01_check;