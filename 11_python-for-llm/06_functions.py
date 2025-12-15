# 1. 기본 함수와 Type Hint
def create_greeting(name: str, age: int = 20)-> str:
    return f"안녕하세요, 제 이름은 {name}이고, 나이는 {age}살입니다."

print(create_greeting("홍길동", 30))
print(create_greeting(age=22, name="이순신"))  # 키워드 인자는 순서가 바뀌어도 된다.
print(create_greeting("유관순")) # age는 기본값 20 사용


# 2. 가변인자(*args)와 키워드 가변 인자(**kwargs)
# *args는 몇개가 들어올 줄 모르는 인자들을 튜플로 받는다.
# 튜플 : '값을 바꿀 수 없는 리스트'
# **kwargs는 키워드 인자들을 딕셔너리로 받는다

def call_llm_api(prompt: str, *args, **kwargs):
    """가상의 LLM API 호출 함수"""
    print(f"전송할 프롬프트: {prompt}")
    if args:
        print(f"부가 옵션(tuple): {args}")
    if kwargs:
        print(f"상세 설정(dict): {kwargs}")

call_llm_api(
    "오늘의 주요 뉴스 요약해줘",
    "3줄 요약",                 # -> args에 들어감
    model="gpt-40",             # -> kwargs에 들어감
    temperature=0.7             # -> kwargs에 들어감
)