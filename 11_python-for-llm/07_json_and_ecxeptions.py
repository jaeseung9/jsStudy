import json

structured_data = [
    {"id": 1,
     "category": "python",
     "question": "파이썬의 장점은",
     "answer": "간결한 문법과 강력한 라이브러리 생태계입니다.",
     "tags": ["python", "programming", "strenght"]
     },
     {"id": 2,
     "category": "python",
     "question": "리스트와 튜플의 차이점은",
     "answer": "리스트는 가변(meutable)이고, 튜플은 불변(immutable)입니다.",
     "tags": ["list", "tuple", "date_structure"]
     }
]

output_filename = "structured_date.json"

# 파이썬 객체를 JSON 파일로 저장하기
print(f"{output_filename} 파일로 JSON 데이터 저장 중...")
try:
    with open(output_filename, 'w', encoding='utf-8') as f:
        # json.dump()를 사용해 데이터를 파일에 쓴다. 
        # 1. date : 저장할 파이썬 객체
        # 2. f : 데이터를 쓸 파일 객체
        # 3. indent=2 : 사람이 보기 좋게 2칸 들여쓰기 (가독성을 위해 매우 중요)
        # 4. ensure_ascii=False : 한글을 유니코드로 변환하지 않고 원본 그대로 저장(필수!!)
        json.dump(structured_data, f, indent=2, ensure_ascii=False)
    print("저장 완료!")

except Exception as e:
    print(f"파일 저장 중 오류 발생: {e}")

# JSON 파일을 다시 파이썬 객체로 불러오기
print(f"{output_filename} 파일에서 JSON 데이터 불러오는 중...")
try:
    with open(output_filename,'r', encoding='utf-8') as f:
        # json.load()를 사용해 파일에서 JSON 데이터를 읽어 파이썬 객체로 변환
        loaded_data = json.load(f)
    print("파일 읽기 성공")
    print("불러온 데이터의 타입:", type(loaded_data))
    print(loaded_data[0].get("question"))
    print(loaded_data[0]['tags'])

except FileExistsError:
    print(f"파일을 찾을 수 없습니다: {output_filename}")
except json.JSONDecodeError:
    print(f"파일이 올바른 JSON 형식이 아닙니다: {output_filename}")
except Exception as e:
    print(f"파일 읽기 중 오류 발생: {e}")  

# JSON 문자열과 파이썬 객체 변환

# 파이썬 딕셔너리 -> JSON 문자열로 변환
my_dict = {"name": "토르","power":100}
json_string = json.dumps(my_dict, indent=2, ensure_ascii=False)
print(json_string)
print(type(json_string))

# JSON 문자열 -> 파이썬 딕셔너리로 변환
retrieved_string = '{"id" : "user1", "isActive" :  true}'
retrieved_dict = json.loads(retrieved_string)
print(retrieved_dict)
print(type(retrieved_dict))