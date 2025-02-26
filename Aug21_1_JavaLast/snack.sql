-- 수원에 있는 오리온이라는 회사 직원 100명
-- 에서 만든 초코파이 5000원 500.5G 2024/9/1까지 먹어

-- DB 설계 => 테스트용 데이터 하나 넣어보고
CREATE TABLE aug21_company (
	c_name varchar2(10 char) primary key,
	c_location varchar2(10 char) not null,
	c_employees number(5) not null
);

-- 등록되어있지 않은 제조사의 과자?
-- 회사 폐업하면 과자는 ? - 나는 지울거임 : 자동으로 됐으면 ..

-- foreign key (외래키)
-- 		aug21_company(c_name)에 등록 안된거, s_c_name에 쓸 수 없음

-- constraint (제약조건명)
--		foreign key(필드명) references 테이블명(필드명) on delete cascade

--	on delete cascade - 자동 삭제 : c_name 삭제 시 그 회사의 과자 자동 삭제

CREATE TABLE aug21_snack (
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_price number(6) not null,
	s_weight number(5, 1) not null,
	s_exp date not null,
	s_c_name varchar2(10 char) not null,
	constraint snack_maker foreign key (s_c_name) references aug21_company(c_name) on delete cascade
);

create sequence aug21_snack_seq;

insert into aug21_company values ('오리온', '수원', 100);

insert into AUG21_SNACK 
values (aug21_snack_seq.nextval, '초코파이', 5000, 500.5, to_date('2024-09-01', 'YYYY-MM-DD'), '삼성');

select * from aug21_company;
select * from AUG21_SNACK;

select count(*) from AUG21_SNACK;

select * from aug21_snack order by s_name, s_price;
select * 
from 
(
	select rownum as rn, s_name, s_price, s_weight, s_exp, s_c_namefrom 
	(
		select * from aug21_snack order by s_name, s_price
	)
) 
where rn >= 5 and rn <= 8;

delete from aug21_company;

drop table aug21_company cascade constraint purge;
-- purge : 휴지통
-- cascade constraint : 자동 삭제
drop table aug21_snack cascade constraint purge;
drop sequence aug21_snack_seq;