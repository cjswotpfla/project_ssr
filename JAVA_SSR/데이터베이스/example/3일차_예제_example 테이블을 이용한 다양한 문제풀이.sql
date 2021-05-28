-- 고객 명단 확인(고객의 전체 정보를 확인)
-- select * from 고객;

-- 고객명단에서 고객들의 등급을 확인
-- [all | distict]를 생략하면 all이 기본값으로 적용
-- select 등급 from 고객;

-- select문에서 테이블명 앞에 주문데이터베이스명을 안쓰면 현재 선택된 데이터베이스에 따라 쿼리문이 실행되지 않을 수도 있다.
-- select distinct 등급 from 고객;

-- 고객의 등급을 확인(고객이름과 등급을 확인)
-- select 고객아이디, 등급 from 고객;

-- as : 검색 결과의 속성 이름을 변경하는 키워드, 해당 검색 결과에서만 바뀜
-- select 고객아이디 as '아이디', 등급 from 고객;

-- 고객아이디가 apple인 고객의 주문내역
-- select * from 주문 where 주문고객 = 'apple'; 

-- 제품명이 p01인 제품이 주문된 내역을 확인
-- select * from 주문 where 주문제품 = 'p01';

-- 제조업체가 한빛제과인 제품의 목록을 확인
-- select 제품명 from 제품 where 제조업체 = '한빛제과'; 

-- 5개이상 주문한 고객의 아이디를 확인
-- select distinct 주문고객 as '아이디' from 주문 where 수량 >= 5;

-- 단가가 2000원 이상 3000원 이하인 제품명을 확인
-- select 제품명, 단가 from 제품 where 단가 >=2000 and 단가 <= 3000;

-- 조건에서 속성 = '문자열'로 확인하면 해당 문자열과 완전히 일치하는 것들을 확인
-- 고객이름이 오인 고객리스트를 확인(이 때 like는 =와 같은 역할)
-- select * from 고객 where 고객이름 like '오';

-- 고객이름이 3글자인 고객의 리스트를 확인
-- select * from 고객 where 고객이름 like '___';

-- 고객의 성이 김씨인 고객의 리스트를 확인
-- select * from 고객 where 고객이름 like '김%';

-- 속성의 값이 null인지 아닌지를 확인할 때 is null 또는 is not null을 이용
-- 나이가 null로 저장된 고객의 이름을 확인
-- select 고객이름 from 고객 where 나이 is null;

-- 나이가 null이 아닌 고객의 이름을 확인
-- select 고객이름 from 고객 where 나이 is not null;

-- 정렬은 order by 속성명1 [asc|desc], 속성명2 [asc|desc], ... 로 정렬할 수 있다.
-- order by는 where와 별개
-- asc : 오름차순, desc : 내림차순

-- 고객을 고객 이름순으로 정렬
-- select * from 고객 order by 고객이름 desc;

-- 고객의 등급을 기준으로 정렬
-- select * from 고객 order by 등급 asc;

-- 고객의 등급을 기준으로 정렬한 후 이름순으로 정렬
-- select * from 고객 order by 등급 asc, 고객이름 asc;

-- count : 속성값의 개수
-- max/min : 속성값 중에서 최대/최소값
-- sum : 속성값들의 합계
-- avg : 속성값들의 평균 

-- 가입된 고객의 수
-- select count(고객아이디) from 고객 ;
-- select count(*) from 고객;

-- 가입된 고객 중 최고령자의 나이
-- select max(나이) from 고객;

-- 가입된 고객 중 최연소자의 나이
-- select min(나이) from 고객;

-- 판매된 제품수(총 판매수량)
-- select sum(수량) as '판매량' from 주문;

-- 제품의 평균 가격
-- select avg(단가) as '평균가격' from 제품;

-- 아이디가 apple인 회원의 평균 주문량을 확인
-- select avg(수량) as 'apple의 평균 주문량' from 주문 where 주문고객 = 'apple';

-- group by는 where절 다음에 order by 앞에 있어야 한다. 
-- 주문 제품별 총 판매 수량
-- select 주문제품, sum(수량) as '판매수량' from 주문 group by 주문제품;

-- 고객별 총 주문 수량
-- select 주문고객, sum(수량) as '주문수량(누적)' from 주문 group by 주문고객;

-- 제조업체별 제품수와 제품들의 최고가와 최저가를 확인
-- select 제조업체, count(*) as 제품수, max(단가) as 최고가, min(단가) as 최저가 from 제품 group by 제조업체;

-- having : 그룹에서 조건을 걸고 싶을때 사용하는 절. 집계함수 이용 가능
-- 제조업체의 제품수가 3개 이상인 제조업체
-- select 제조업체 from 제품 group by 제조업체 having count(*) >= 3;