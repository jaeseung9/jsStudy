# 문자열 핵심 기능
# 슬라이싱 : 문자열의 일부를 잘라낸다. [시작인덱스:끝인덱스]

text = "Hello, World!"
print(f"슬라이싱[0:5]: {text[0:5]}")  # Hello
print(f"슬라이싱[:5]: {text[:5]}")    # Hello 끝을 생략하면 끝까지
print(f"슬라이싱[:]: {text[:]}")      # 처음부터 끝까지
print(text[::-1])                      # step을 -1로 주면 뒤에서부터 가져온다.

# .split() : 긴 텍스트를 문장 단위로 나누거나, CSV 데이터를 콤마(,) 기준으로 나눌 때 많이 사용
# 문자열을 특정 기준으로 나누어 리스트로 만든다.
csv_data = "홍길동,20,서울"
user_list = csv_data.split(",")
print("split 결과:,{user_list}, 이름: {user_list[0]}")

# 제어문 : if, for
score = 85

if score >= 90:
    grade = 'A'
elif score >= 80:
    grade = 'B'
else:
    grade = 'C'

