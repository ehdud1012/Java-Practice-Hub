-- 1) 이클립스로 DB제어
-- 2) 테이블 만들기, 삭제
-- 3) C - insert
-- 4) R - select

CREATE TABLE aug19_product(
	c_no number(2) primary key,
	c_name varchar2(10 char) not null,
	c_price number(6) not null
);
create sequence aug19_product_seq;

insert into aug19_product values (aug19_product_seq.nextval, '우산', 5000);
insert into aug19_product values (aug19_product_seq.nextval, '대일밴드', 1000);

delete from aug19_product where c_name = '우산';

update aug19_product set c_price = c_price + 500 where c_name = '우산';

select * from aug19_product;

select avg(c_price) from AUG19_PRODUCT;


drop table aug19_product cascade constraint purge;
