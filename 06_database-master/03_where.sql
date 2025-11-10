# WHERE 조건
-- '조건 필터링'의 역할, 특정 조건에 맞는 레코드만을 선택하는데 사용된다.

-- (1) 비교 연산자 활용(=, <>, >, <=)

SELECT
	menu_name,
    menu_price,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status <> 'Y';	-- 이 조건이 참(true)이 되는 행(row)들만 결과에 포함된다.
    
SELECT
	menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_price < 10000;
    
-- (2) 논리 연산자(AND, OR)를 활용하여 조건 조합
-- 주문 가능하면서(Y), 카테고리가 10번인 메뉴 찾기
-- 주의사항!! AND는 OR 보다 연산 우선순위가 높다. 따라서 () 괄호를 사용해 우선순위를 명확히 해주는것이 좋다.
SELECT
	menu_name,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status = 'Y' AND category_code = 10;

-- OR(둘 중 하나라도 참이면 참)
SELECT
	menu_name,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status = 'Y' OR category_code = 10;
    
-- 우선순위(AND > OR)
SELECT 1 OR 0 AND 0;
SELECT (1 OR 0) AND 0;

-- 가격이 만원 이상이고, 2만 5천원 이하인 메뉴 찾기
SELECT
	menu_name,
    menu_price
FROM 
	tbl_menu
WHERE
	menu_price >= 10000 AND menu_price <= 25000;
    
-- BETWEEN
SELECT
	menu_name,
    menu_price
FROM 
	tbl_menu
WHERE
	-- 10000 이상 25000 이하(부정은 NOT을 붙인다.)
	menu_price NOT BETWEEN 10000 AND 25000;	
    
-- LIKE 
-- 메뉴 이름에 '마늘' 포함된 메뉴 찾고 싶을 때, %는 '0개 이상의 모든 문자'를 의미하는 와일드 카드
SELECT 
	menu_name
FROM 
	tbl_menu
WHERE
	menu_name LIKE '%마늘%'; -- 부정은 NOT LIKE
    -- LIKE '%마늘' -- 마늘로 끝나는 메뉴 찾기
    -- LIKE '마늘%' -- 마늘로 시작하는 메뉴 찾기
    
-- IN 연산자
-- 카테고리 코드가 4번이거나, 5번이거나, 6번인 메뉴 찾기
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code IN (4, 5, 6); -- 부정은 NOT IN
    
-- IS NULL 연산자
SELECT
	category_code,
    category_name,
    ref_category_code
FROM 
	tbl_category
WHERE
	 -- ref_category_code = NULL; -- NULL 값 비교에는 = 사용할 수 없다.
     ref_category_code IS NULL; -- 부정은 IS NOT NULL
