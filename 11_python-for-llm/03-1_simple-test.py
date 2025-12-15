inventory = [
    {'name': 'healing_potion', 'type': 'potion', 'grade': 'common', 'price': 50},
    {'name': 'sword_of_legend', 'type': 'weapon', 'grade': 'legendary', 'price': 10000},
    {'name': 'iron_shield', 'type': 'armor', 'grade': 'rare', 'price': 1500},
    {'name': 'mana_potion', 'type': 'potion', 'grade': 'common', 'price': 40}
]
print("초기 인벤토리 데이터:", inventory)

# for문과 if문을 사용해 인벤토리에서 타입(type)이 'potion'인 아이템들의 이름과 가격만 형식에 맞춰 출력하세요.

# 등급(grade)이 'rare' 이상인 아이템들의 이름만 뽑아 새로운 리스트를 만드세요.
# 이때, List Comprehension을 이용해 단 한 줄로 해결해 보세요.

# 인벤토리의 모든 아이템을 가격(price)이 비싼 순서대로 정렬하여 출력하세요.
# list.sort() 메서드와 lambda 함수를 사용합니다.

for item in inventory:
    if item['type'] == 'potion':
        print(f"아이템 이름: {item['name']}, 가격: {item['price']}원")
    

rare_and_above = [item['name'] for item in inventory if item['grade'] in ['rare', 'legendary']]
print("등급이 'rare' 이상인 아이템들:", rare_and_above)

inventory.sort(key=lambda x: x['price'], reverse=True)
print("가격이 비싼 순서대로 정렬된 인벤토리:", inventory)
