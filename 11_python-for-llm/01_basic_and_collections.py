# 주석

# 변수와 기본 타입 
team_name = '오지라퍼스' #str (문자열)
price = 123456           #int (정수) 숫자가 길 때 언더바로 가독성 높일 수 있음
is_activate = True       # bool (논리형)
user_date = None         # 값이 없음을 나타내는 NoneType

print(team_name)
# f-string : 문자열 앞에 f를 붙이고, 중괄호{} 안에 변수명을 넣으면 그 값이 문자열에 자동 삽입.
print(f"_팀 이름: {team_name}")
print(f"_가격: {price}원")

# List : 순서가 있는 가변 배열
scores = [88,90,67]
print(f"점수 리스트: {scores}, 첫번째 점수: {scores[0]}")

# 리스트에 값 추가
scores.append(100) # 맨 뒤에 추가
scores.insert(1, 77) # 특정 위치에 추가
print(f"점수 리스트 (추가 후): {scores}")

# 리스트에서 값 제거
last_score = scores.pop() # 맨 뒤 값 제거 후 반환
print(f"제거된 점수: {last_score}, 점수 리스트 (제거 후): {scores}")

# Dictionary : 키-값 쌍으로 이루어진 가변 객체
user = {
    'name': '홍길동', 'age': 30}
print(f"사용자 정보: {user}, 이름: {user['name']}, 나이: {user['age']}")

# 키가 없으면 새로 추가되고, 있으면 기존 값을 덮어씀
user['jop'] = '외적'
user['age'] = 33
print(f"사용자 정보 (수정 후): {user}")

# 존재하지 않는 키로 값을 조회하면 keyError 발생 프로그램이 죽음
# print(user['email'])

# 안전하게 값 조회하기 : git(키, 기본값) -> key가 없어도 에러 대신 기본값 반환
email = user.get('email', '정보 없음')
print(f"이메일: {email}")

# List와 Dictionary 조합
users = [
    {'name': '홍길동', 'age': 30},
    {'name': '신사임당', 'age': 45, 'job': '화가'}
]

print(f"첫번째 사용자 이름: {users[0]['name']}")

# 얕은 복사와 깊은 복사

prices = [10000, 20000]

# 얕은 복사 : 주소값만 복사
prices_shallow_copy = prices
prices_shallow_copy[0] = 15000
print(f"얕은 복사 후 원본 리스트: {prices}") # 원본 리스트도 변경됨

#[깊은 복사] .copy() 메서드 사용. 값 자체를 복사한 새 객체 생성
new_prices = prices.copy()
new_prices[0] = 9999
print(f"깊은 복사 후 원본 리스트: {prices}") # 원본 리스트는 변경되지 않음
print(f"깊은 복사된 새 리스트: {new_prices}")