-- jave : 적재적소에 쓰는게 중요, 창의성이 필요 	=> 어렵다 - O
-- SQL 	: DB제어용 언어, 답이 나와있음			=> 어렵다 - X

-- SQL(Structured Query Language)
--		- DB를 제어하는 언어
--		- DB메이커는 다양 : Oracle, MySQL, M...
--			=> 그 다양한 메이커들이 공용으로 
--		- 대소문자 구별 X -> 무조건 대문자로 인식 ==> 이름 뱀(_)체 쓰기
--------------------------------------------------
-- DBP : DB랑 연동된 프로그램 개발
-- CRUD : 데이터를 Create Read Update Delete
--------------------------------------------------
-- 용어 
--	table 
--		field, 열(column)
--		record, 행(row), data
--------------------------------------------------
-- 테이블 만들기
-- create table 테이블 명(
--		열제목 자료형 [옵션],
--		필드명 자료형 [옵션],
--		...
-- );

-- 옵션 
--		not null : 값 필수
--		primary key : not null + 중복데이터 불가능
--					  그 데이터를 대표하는 값
--					  데이터를 찾을 때 정확하게 찾아줄 기본값
--					  -> 테이블에는 pk 주는 쪽으로
-- 			가격으로 찾으면 : 여러 개 나올수도
-- 			이름으로 찾으면 : 딱 하나만

-- 필드명
-- 		- 필드명 지을때 SQL문법과 중복될까봐 [테이블명을줄여서_이름]으로 짓기

-- 자료형 (OracleDB 한정)
--		- 글자	
--			char(용량) 	  : 고정사이즈 (용량보다 작은 값일 경우 뒤에 띄어쓰기 붙여서 사이즈 고정) (hdd 비효율)
--							varchar2보다 빠름 (cpu)
--							자리수가 일정한 상황에서는 유리
--			varchar2(용량) : 가변사이즈 (용량보다 작으면 쓴 용량으로 저장) ==> 주로 사용
--							char보다 느림 (cpu)
--		- 숫자
--			number(용량)
--				number(5) : 정수 5자리
--				number(5, 2) : 실수 xxx.xx
--			int ? - 21억까지인디 굳이?
--		- 시간,날짜
--			date

-- OracleDB에서 영어, 숫자 1글자 = 1byte
--			   한글 1글자	= 3bytes
-- 용량 
--		5 		: 5bytes
--		5 char  : 5글자

CREATE TABLE aug14_snack(
	s_name varchar2(10 char) primary key,
	s_price number(5) not null
);
------------------------------------------------------------------
-- 데이터 넣기
-- insert into 테이블명(필드명, 필드명, ...) values(값, 값, ...)
-- insert into 테이블명 values(값, 값, ...) - 필드명 뺴고 값을 순서대로 써주기

insert into aug14_snack values('빼빼로',2000);
insert into aug14_snack(s_name,s_price) values('새우깡',3000);
insert into aug14_snack(s_name,s_price) values('양파링',3500);
insert into aug14_snack(s_name,s_price) values('양파링',2500); -- 이름 동일은 불가능
insert into aug14_snack(s_name,s_price) values('마이쮸',1000);
insert into aug14_snack(s_name,s_price) values('멘토스',1000); -- 값 동일은 가능
-- 순서 바꾸기 - 가능하지만 의미없음
insert into aug14_snack(s_price,s_name) values(700, '새콤달콤');
-- 특정 필드만 값 넣기 - 가능하지만 쓸모없음 
insert into aug14_snack(s_name) values('버터와플');
---------------------------------------------------------------------
-- 데이터 조회 - R
select * from aug14_snack;
---------------------------------------------------------------------
-- 테이블 수정 - 기능은 있는데 실무에서는 못씀 => 수업 안할거임 ㅡㅡ

-- 테이블 삭제
-- drop table 테이블명; ==> 이러면 아예 삭제가 아니고 휴지통으로 감 
-- drop table 테이블명 cascade constraint purge; 
drop table aug14_snack cascade constraint purge; 
---------------------------------------------------------------------
-- 이름 : 데이터
-- 점수 : 데이터
-- 번호 : ? 마땅치 않았는뎀 => 데이터 XX

CREATE TABLE aug14_student(
	s_no number(2) primary key, -- pk 줄곳이 마땅치 않을 때 많이 사용
	s_name varchar2(10 char) not null,
	s_kor number(3) not null,
	s_eng number(3) not null,
	s_mat number(3) not null
);
insert into aug14_student values(1, '홍길동', 50, 90, 30);
insert into aug14_student values(2, '김길동', 30, 10, 20);

select * from aug14_student;

drop table aug14_student cascade constraint purge; 