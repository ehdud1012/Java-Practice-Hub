-- 16일 crud2에서 만든 테이블 사용
-- 주소가 종로구 어쩌고인 식당의 메뉴명 가격
select m_name, m_price from aug16_menu
where m_restaurant_num = (select r_no from aug16_restaurant where r_address like '%종로구%');

-----------------------------------------------------------------------------------------------

-- join : 테이블 여러 개를 붙이는 행위 (테이블명 여러 개 적기)	
select * from AUG16_MENU, AUG16_RESTAURANT; -- ==> 이럴 경우 모든 경우의 수를 다 보여줘	
select * from AUG16_MENU, AUG16_RESTAURANT where r_no = m_restaurant_num; -- > 요렇게 조건 붙이기

-- 평균보다 비싼 메뉴명, 가격, 식당명, 지점명
select m_name, m_price, r_name, r_jijum from AUG16_MENU, AUG16_RESTAURANT 
where r_no = m_restaurant_num and m_price > (select avg(m_price) from AUG16_MENU);


-- 테이블 수 가장 적은 식당명, 지점명, 사장이름, 생일 
-- 		==> 이거는 최종값이 여러 테이블에서 나와서 join 사용 OK
select r_name, r_jijum, c_name, c_birthday 
from AUG16_CEO, AUG16_RESTAURANT, AUG16_RUN
where r_c_num = c_no and r_r_num = AUG16_RESTAURANT.r_no 
		and r_table in (select min(r_table) from aug16_restaurant);
		
-- 최연장자 사장님네 메뉴명 가격
--		==> 이거는 한 테이블에서  최종값이 나오기에 join XX
select m_name, m_price from AUG16_CEO, AUG16_MENU, AUG16_RUN
where r_c_num = c_no and r_r_num = m_restaurant_num 
and c_birthday = (select min(c_birthday) from AUG16_CEO);

-- join vs subquery
-- join : 원래 데이터보다 용량 크게 해서 RAM으로
-- 		  일단 모든 경우의 수 해놓고, where로 필터링
-- 		  변수해놓고, if
-- 		  10TB가 hdd에 저장되어있는데 용량이 폭증 -> 1000TB를 변수에 RAM에
-- subquery : 원래 데이터에서 줄여서 RAM으로
-- ==> join은 최대한 안쓰는게 좋음

-- 테이블이 3개 이상인 매장의 매장명, 지점명, 메뉴명, 가격
select r_name, r_jijum, m_name, m_price from aug16_restaurant, AUG16_MENU
where r_no = m_restaurant_num and r_table >= 3;

-- 식사류를 파는 매장명, 지점명, 주소 
select r_name, r_jijum, r_address from AUG16_RESTAURANT 
where r_no in (select m_restaurant_num from AUG16_MENU where m_category = '식사');

--------------------------------------------------------------------------------
-- 정렬 -- 

-- select 필드명, 필드명 as 별칭, 연산자 사용가능, 통계함수, ...
-- from 테이블명, 테이블명, subquery, ...
-- where 조건식
-- order by 필드명, 필드명 desc, ...;
--			오름차순, 내림차순

-- 테이블이 3개 이상인 매장의 매장명, 지점명, 메뉴명, 가격
-- 을 매장명 가나다 순으로 -다음-> 메뉴명 가나다 역순
select r_name, r_jijum, m_name, m_price from aug16_restaurant, AUG16_MENU
where r_no = m_restaurant_num and r_table >= 3
order by r_name, m_name desc;

-- 식사류를 파는 매장명, 지점명, 주소, 테이블수
-- 테이블이 많은 순서 -> 매장명 가나다, 지점명 가나다
select r_name, r_jijum, r_address, r_table from AUG16_RESTAURANT 
where r_no in (select m_restaurant_num from AUG16_MENU where m_category = '식사')
order by r_table, r_name, r_jijum;

-------------------------------------------------------------------------------------

-- 페이지
-- 한 페이지당 4개씩

-- rownum : select할 때마다 부여되는 가상 필드
--			* 이랑 같이 못씀
--			order by보다 먼저
--			1번부터 조회해야 나옴

-- 메뉴명, 가격
-- 메뉴명 가나다 -> 가격 싼 순서
-- 5-8번까지만 나오게 
-- from에도 subquery 가능
select * 
from (
	select rownum as rn, m_no, m_name, m_price
	from (
		select m_no, m_name, m_price 
		from aug16_menu 
		order by m_price
		)
	) 
where rn >= 5 and rn <= 8;

-- 제일 비싼 메뉴만 빼고 메뉴명, 가격, 사장 이름
-- 메뉴명 가나다 -> 가격 싼 순서
-- 3-5번까지만
select * 
from (
	select rownum as rn, m_name, m_price, c_name
	from (
		select m_name, m_price, c_name
		from AUG16_MENU, aug16_ceo, aug16_run
		where r_c_num = c_no and r_r_num = m_restaurant_num 
				and m_price < (select max(m_price) from AUG16_MENU)
		order by m_name, m_price
		)
	) 
where rn >= 3 and rn <= 5;
--------------------------------------------------------------------------

-- select 필드명, 필드명 as 별칭, 연산자 사용가능, 통계함수, ...
-- from 테이블명, 테이블명, subquery, ...
-- where 조건식
-- group by 필드명, 필드명, ...
-- order by 필드명, 필드명 desc, ...;
--			오름차순, 내림차순


-- 카테고리별 메뉴 평균가, 카테고리 가나다
select m_category, avg(m_price) 
from AUG16_MENU
group by m_category
order by m_category;

-- 식당명별-> 카테별 메뉴 최고가, 최소가 / 식당명 -> 카테 가나다
select r_name, m_category, max(m_price) as 최고가, min(m_price) as 최저가
from AUG16_RESTAURANT, AUG16_MENU
where m_restaurant_num = r_no
group by r_name, m_category
order by r_name, m_category;

-- 사장 이름 -> 카테별 메뉴 평균가, 갯수
-- 사장 이름 가나다순 -> 카테고리 가나다순
select c_name, m_category, avg(m_price), count(*)
from AUG16_MENU, AUG16_CEO, AUG16_RUN
where r_c_num = c_no and r_r_num = m_restaurant_num
group by c_name, m_category
order by c_name, m_category;

-----------------------------------------------------------------------
-- ==> 최종
-- select 필드명, 필드명 as 별칭, 연산자 사용가능, 통계함수, ...
-- from 테이블명, 테이블명, subquery, ...
-- where 조건식							<- 데이터 필터링
-- group by 필드명, 필드명, ...
-- having 조건식 							<- group by한 결과 필터링
-- order by 필드명, 필드명 desc, ...;
--			오름차순, 내림차순

-- 카테고리별 평균가
-- 카테고리 가나다순
select m_category, avg(m_price) 
from AUG16_MENU
group by m_category
order by m_category;

-- 카테고리별 평균가
-- 평균 계산할 때 5000미만인 메뉴는 빼고 (데이터 필터링 -> 평균과에 영향)
-- 카테고리 가나다순
select m_category, avg(m_price)
from AUG16_MENU
where m_price >= 5000
group by m_category
order by m_category;

-- 카테고리별 평균가
-- 평균가 구한게 5000 미만이면 보여주지마 (결과 필터링)
-- 카테고리 가나다순
select m_category, avg(m_price)
from AUG16_MENU
group by m_category
having avg(m_price) >= 5000
order by m_category;

-- 종로구 위치한 매장만 가지고
-- 메장명별, 카테별 평균가
-- 매장명 가나다, 카테 가나다
-- 평균가 3000미만 빼고
select r_name, m_category, avg(m_price)
from AUG16_RESTAURANT, AUG16_MENU
where r_no = m_restaurant_num and r_address like '%종로구%'
group by r_name, m_category
having avg(m_price) >= 3000
order by r_name, m_category;





