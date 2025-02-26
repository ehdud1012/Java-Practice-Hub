select * from AUG14_SNACK;

CREATE TABLE aug16_fruit(
	f_no number(2) primary key,
	f_name varchar2(10 char) not null,
	f_price number(6) not null,
	f_weight number(3, 1) not null,
	f_exp date not null
);
--------------------------------------------------------------
-- 이름 : 데이터
-- 점수 : 데이터
-- 번호 : ? 마땅치 않았는뎀 => 데이터 XX
--			=> 자동이었으면 좋겠는데 
-- sequence
--		insert 실패해도 올라감
--		여러 테이블이 같이 사용
--		앞 데이터가 삭제 되면 데이터가 땡겨지는가? XX

-- sequence 만들기
-- sequence / table은 별개의 존재
--		=> 하지만 일반적으로 table당 sequence를 만들어 쓰는 편
-- create sequence 시퀀스명;

create sequence aug16_fruit_seq;

-- sequence 사용 
--		시퀀스명.nextval

-- 현재 시간 날짜 : sysdate
-- 특정 시간 날짜 
--		to_date('값', '패턴') string -> date
-- 		YYYY MM DD HH MI SS AM PM HH24
insert into aug16_fruit values(aug16_fruit_seq.nextval, '사과', 30000, 1.5, sysdate);
insert into aug16_fruit values(aug16_fruit_seq.nextval, '수박', 40600, 3.1, to_date('2024-09-01 13:30:00', 'YYYY-MM-DD HH24:MI:SS'));
insert into aug16_fruit values(aug16_fruit_seq.nextval, '키위', 12000, 1.5, to_date('2004-11-22 14:30:00', 'YYYY-MM-DD HH24:MI:SS'));
insert into aug16_fruit values(aug16_fruit_seq.nextval, '참외', 44500, 3.0, to_date('2014-07-01 15:30:00', 'YYYY-MM-DD HH24:MI:SS'));
insert into aug16_fruit values(aug16_fruit_seq.nextval, '오렌지', 32000, 1.8, to_date('2020-06-01 17:30:00', 'YYYY-MM-DD HH24:MI:SS'));

-- 전체 데이터 조회
select * from aug16_fruit;
-- select 필드명, 필드명 as 별칭 (보고싶은것만 선택)
-- from 테이블명;
-- where 조건식;

-- 전체 과일 이름, 가격
select f_name, f_price from aug16_fruit;

-- 전체 과일 이름, 유통기한
select f_name, f_exp as exp_date from aug16_fruit;

-- 전체 과일 이름, 가격, 할인가(20%)
select f_name, f_price, f_price * 0.8 as sale from aug16_fruit;

-- 전체 과일 이름, 키로당 가격
select f_name, f_price / f_weight as kg from aug16_fruit;

-- 통계함수 존재
-- 전체 과일 평균가
select avg(f_price) from aug16_fruit;

-- 최고가, g당 최저가, 총 과일 수
select max(f_price), min(f_price / f_weight), count(*) from aug16_fruit;

-- 가격이 20000 이상인 과일 이름, 가격
select f_name, f_price from AUG16_FRUIT where f_price >= 20000;

-- 수박 평균가 
select avg(f_price) from AUG16_FRUIT where f_name = '수박';

-- 문자열 포함 검색
--		필드명 like '패턴'
--					%가  : 가로 끝나는거
--					가%  : 가로 시작하는거
--					%가% : 가가 포함되어있는거

--'수' 가 들어있는 이름, 가격 
select f_name, f_price from AUG16_FRUIT where f_name like '%수%';

-- 유통기한이 2024/08/20 15시 이후인 이름, 유통기한
select f_name, f_exp from AUG16_FRUIT where f_exp > to_date('2024-08-20 15', 'YYYY-MM-DD HH24');

insert into aug16_fruit values(aug16_fruit_seq.nextval, '테스트', 0, 0, to_date('2024-08-16 22:00:00', 'YYYY-MM-DD HH24:MI:SS'));


-- to_char (날짜, '패턴') : date -> str
-- concat(글자, 글자, 글자 ...) : 문자열 결합
-- to_char(sysdate, 'YYYYMMDD') : '20240816'
-- concat ( , '235959') : 20240816 235959

-- 오늘 안에 먹어야되는 거 이름, 유통기한
select f_name, f_exp from AUG16_FRUIT 
where f_exp <= to_date(concat(to_char(sysdate, 'YYYYMMDD'), ' 235959'), 'YYYYMMDD HH24MISS');

-- 수박 or 사과 이름, 가격
select f_name, f_price from AUG16_FRUIT where f_name = '수박' or f_name = '사과';

-- 10000< 가격 < 20000 이름, 가격
select f_name, f_price from AUG16_FRUIT where f_price >= 10000 and f_price <= 20000;

-- 유통기한이 오늘 오후 중으로 끝나는거 이름, 유통기한
select f_name, f_exp from AUG16_FRUIT 
where f_exp >= to_date(concat(to_char(sysdate, 'YYYYMMDD'), ' 120001'), 'YYYYMMDD HH24MISS') 
and f_exp >= to_date(concat(to_char(sysdate, 'YYYYMMDD'), ' 235959'), 'YYYYMMDD HH24MISS');

-- subquery : select 안에 select
-- 최고가 이름, 가격
select f_name, f_price from aug16_fruit where f_price = (select max(f_price) from aug16_fruit);

-- 평균가보다 싼거 이름, 가격
select f_name, f_price from aug16_fruit where f_price < (select avg(f_price) from aug16_fruit);

drop table aug16_fruit cascade constraint purge; 