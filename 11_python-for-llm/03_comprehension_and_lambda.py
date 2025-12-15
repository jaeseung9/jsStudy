# List Comprehension : 한 줄 for문

# 기본 구조 : [(결과) for (변수) in (반복 대상)]

# # 1부터 10까지 제곱수로 이루어진 리스트 만들기
squares = [n**2 for n in range(1, 11)] 
print(f"1~10 제곱수 리스트: {squares}")

# 5글자 이상인 괴일만 필터링해서 대문자로 바꾸기
fruits = ['apple', 'banana', 'cherry', 'kiwi']