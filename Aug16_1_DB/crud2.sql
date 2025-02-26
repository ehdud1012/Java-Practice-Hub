-- RDBMS (Relational )
-- 		OracleDB, MySQL, MariaDB, ...
--		테이블을 나눠서 디자인, 테이블 간의 관계를 중점

-- 설계 = DB 모델링

CREATE TABLE aug16_ceo(
	c_no number(2) primary key,
	c_name varchar2(10 char) not null,
	c_birthday date not null,
	c_house varchar2(10 char) not null
);

CREATE TABLE aug16_restaurant(
	r_no number(2) primary key,
	r_name varchar2(10 char) not null,
	r_jijum varchar2(10 char) not null,
	r_address varchar2(10 char) not null,
	r_table number(3) not null
);

CREATE TABLE aug16_menu(
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(6) not null,
	m_category varchar2(10 char) not null,
	m_restaurant_num number(2) not null
);

CREATE TABLE aug16_run(
	r_no number(2) primary key,
	r_c_num number(6) not null,
	r_r_num number(6) not null
);

create sequence aug16_seq;

insert into aug16_ceo values(aug16_seq.nextval, '홍길동', to_date('19990101', 'YYYYMMDD'), '수원');
insert into aug16_ceo values(aug16_seq.nextval, '이길동', to_date('20001101', 'YYYYMMDD'), '화성');
insert into aug16_ceo values(aug16_seq.nextval, '김길동', to_date('19771001', 'YYYYMMDD'), '인천');
insert into aug16_restaurant values(aug16_seq.nextval, '카페', '서초', '서초구123', 11);
insert into aug16_menu values(aug16_seq.nextval, '카라멜라떼', 3200, '음료', 33);
insert into aug16_run values(aug16_seq.nextval, 3, 11);

select * from aug16_ceo;
select * from aug16_restaurant;
select * from aug16_menu;
select * from aug16_run;

drop table aug16_run cascade constraint purge;
drop table aug16_ceo cascade constraint purge;
drop table aug16_restaurant cascade constraint purge;
drop table aug16_menu cascade constraint purge;


-- 김밥천국 종로점의 메뉴명
select m_name, m_price from AUG16_MENU
where m_restaurant_num = (select r_no from aug16_restaurant where r_name = '김밥천국' and r_jijum = '종로');

-- 제일 싼 메뉴
select r_name, r_address from AUG16_RESTAURANT 
where r_no in (select m_restaurant_num from AUG16_MENU where m_price = (select min(m_price) from AUG16_MENU));

-- 연장자 사장님네 가게 메뉴
select m_name, m_price from AUG16_MENU 
where m_restaurant_num in (select r_r_num from AUG16_RUN where r_c_num in 
(select c_no from AUG16_CEO where c_birthday = (select min(c_birthday) from AUG16_CEO)));

-- 최고가 메뉴 파는 사장님 이름, 생일
select c_name, c_birthday from AUG16_CEO where c_no in 
(select r_c_num from AUG16_RUN where r_r_num in 
(select m_restaurant_num from AUG16_MENU where m_price in (select max(m_price) from AUG16_MENU)));

--commit