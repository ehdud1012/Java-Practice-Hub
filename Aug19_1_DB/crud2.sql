-- 데이터 CRUD
-- C : create
-- R : read
-- U : update
-- D : delate


-- U : update ------------------------------------------------------
-- update 테이블명
-- set 필드명 = 값, 필드명 = 값, ...  => 요기 까지 쓰면 모든 필드명 값 다 바뀜
-- where 조건식;

-- 야채김밥 5000원으로 수정
update AUG16_MENU
set m_price = 5000
where m_name = '야채김밥';

-- 밥 시리즈 500원 인상
update AUG16_MENU
set m_price = m_price + 500
where m_name like '%밥%';

-- 김밥천국 종로점 전 메뉴 10% 인상
update AUG16_MENU
set m_price = m_price*1.1
where m_restaurant_num =
(
	select r_no
	from AUG16_RESTAURANT
	where r_name = '김밥천국' and r_jijum = '종로'
);


-- D : delate --------------------------------------------
-- delete from 테이블명 => 여기까지만 쓰면 싹다 지워짐
-- where 조건식

delete from AUG16_MENU
where m_name = '야채김밥';

-- 테이블수 가장 적은 매장 폐업
delete from aug16_restaurant
where r_table =
(
	select min(r_table) from aug16_restaurant
); 

select * from aug16_restaurant;

