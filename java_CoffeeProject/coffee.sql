CREATE TABLE kdy01_coffeecompany (
	c_name varchar2(10 char) primary key,
	c_storenum number(5) not null
);

CREATE TABLE kdy01_coffeemenu (
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_size number(4) not null,
	m_calorie number(4) not null,
	m_c_name varchar2(10 char) not null,
	
	constraint coffee_store foreign key (m_c_name) 
	references kdy01_coffeecompany(c_name) on delete cascade
);

select * from (select rownum as rn, m_no, m_name, m_price, m_size, m_calorie, m_c_name from (select * from kdy01_coffeemenu where m_c_name = (select c_name from kdy01_coffeecompany where c_name like '%'||?||'%') order by m_name)) where rn >= ? and rn <= ?;

select * from kdy01_coffeemenu where m_name like '%'||?||'%'

select * from kdy01_coffeemenu where m_c_name = (select c_name from kdy01_coffeecompany where c_name like '%스%') order by m_name

select count(*) from kdy01_coffeemenu where m_c_name = (select c_name from kdy01_coffeecompany where c_name like '%'||?||'%') order by m_name;

select * from (select rownum as rn, m_no, m_name, m_price, m_size, m_calorie, m_c_name from (select * from kdy01_coffeemenu where m_name like '%'||?||'%' order by m_name)) where rn >= ? and rn <= ?

select count(*) from kdy01_coffeecompany;

select * from (select rownum as rn, c_name, c_storenum from ( select * from kdy01_coffeecompany)) where rn >= ? and rn <= ?;

select * 
from 
(
	select rownum as rn, c_name, c_storenum
	from
	(
		select * from kdy01_coffeecompany
	)
) 
where rn >= 3 and rn <= 5;

select * from (select rownum as rn, m_name, m_price, m_size, m_calorie, m_c_name from (select * from kdy01_coffeemenu where m_name like '%'||?||'%' order by m_name)) where rn >= ? and rn <= ?;
create sequence kdy01_coffeemenu_seq;

insert into kdy01_coffeecompany values ('스타벅스', 1893);
insert into kdy01_coffeecompany values ('메가커피', 2757);
insert into kdy01_coffeecompany values ('컴포즈커피', 2540);
insert into kdy01_coffeecompany values ('빽다방', 1482);
insert into kdy01_coffeecompany values ('이디야커피', 3018);

insert into kdy01_coffeemenu values (kdy01_coffeemenu_seq.nextval, '에스프레소', 3700, 22, 5, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '카페아메리카노', 5300, 473, 15, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '스타벅스돌체라떼', 6700, 473, 310, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '카페라떼', 5800, 473, 150, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '카라멜마끼야또', 6700, 473, 190, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '플랫화이트', 6400, 473, 165, '스타벅스');
insert into kdy01_coffeemenu 
values (kdy01_coffeemenu_seq.nextval, '카페모카', 6300, 473, 330, '스타벅스');

select * from kdy01_coffeemenu;
select * from kdy01_coffeecompany;

drop table kdy01_coffeemenu cascade constraint purge;
drop sequence kdy01_coffeemenu_seq;