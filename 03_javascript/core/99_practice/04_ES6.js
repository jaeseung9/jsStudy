/*
1. 클래스와 메서드 정의
- Animal 클래스를 정의하고 name과 sound를 속성으로 갖습니다.
- Animal 클래스는 sound를 출력하는 speak 메서드를 가집니다.
- Animal 클래스를 상속받은 Dog 클래스를 정의하고,
- Dog 클래스에 새로운 속성을 추가해 보세요.
- Dog 클래스에 Animal 클래스의 speak 메서드를 재정의(오버라이딩) 합니다.
- Dog 클래스를 통해 객체를 생성하고 speak 메서드를 호출하세요.
*/

class Animal {
  constructor(name, sound) {
    this.name = name;
    this.sound = sound;
  }

  speak() {
    console.log(`${this.name}이(가) ${this.sound} 소리를 냅니다.`);
  }
}

class Dog extends Animal {
  constructor(name, sound, breed) {
    super(name, sound);
    this.breed = breed;
  }

  speak() {
    console.log(
      `${this.breed} 품종인 ${this.name}이(가) ${this.sound}! 하고 짖습니다.`
    );
  }
}

const myDog = new Dog('바둑이', '멍멍', '진돗개');
myDog.speak();

const bulldog = new Dog('뭉치', '왈왈', '불독');
bulldog.speak();

/*
2. Getter와 Setter 활용
- Rectangle 클래스를 정의하고 width와 height 속성을 갖습니다.
- 면적을 계산하는 getter인 `area`를 추가하세요.
- width 또는 height를 변경할 수 있도록 setter를 추가하세요.
- Rectangle 클래스를 통해 객체를 생성하고 면적을 출력한 뒤 width를 변경하고 다시 면적을 출력하세요.

예시 출력:
면적: 50
변경 후 면적: 75
*/

class Rectangle {
  constructor(width, height) {
    this.width = width;
    this.height = height;
  }

  // Getter: 면적 계산
  get area() {
    return this.width * this.height;
  }

  // Setter: width 변경
  set width(value) {
    this._width = value;
  }

  get width() {
    return this._width;
  }

  // Setter: height 변경
  set height(value) {
    this._height = value;
  }

  get height() {
    return this._height;
  }
}

// 객체 생성
const rect = new Rectangle(5, 10);

// 면적 출력
console.log(`면적: ${rect.area}`); // 면적: 50

// width 변경
rect.width = 7.5;

// 변경 후 면적 출력
console.log(`변경 후 면적: ${rect.area}`); // 변경 후 면적: 75

/*
3. Rest 파라미터와 Spread 문법 활용
- 두 개의 함수 sumAll과 mergeArrays를 작성하세요.
  1. sumAll 함수는 가변 인수를 받아 모든 숫자의 합을 반환합니다.
  2. mergeArrays 함수는 두 개의 배열을 인수로 받아 두 배열을 합친 새 배열을 반환합니다.
- 두 함수를 각각 호출하여 결과를 출력하세요.

예시 출력:
합계: 15
병합된 배열: [1, 2, 3, 4, 5, 6]
*/

function sumAll(...numbers) {
  let total = 0;
  for (let num of numbers) {
    total += num;
  }
  return total;
}

console.log(sumAll(5, 5, 5));

function mergeArrays(array1, array2) {
  let newArray = [...array1, ...array2];
  return newArray;
}

console.log(mergeArrays([1, 2, 3], [4, 5, 6]));

/*
4. 구조분해 할당 활용
- User 클래스를 생성하고 name, age, location 속성을 초기화합니다.
- 구조분해 할당을 사용하여 name과 age를 추출하고 이를 이용해 "name은 age살입니다." 형태의 문장을 출력하세요.

임의의 배열을 리터럴로 생성하고,
- 구조분해 할당을 사용하여 배열에서 첫 번째 요소와 나머지 요소를 분리하여 출력하세요.

예시 출력:
홍길동은 30살입니다.
첫 번째 요소: 1
나머지 요소: [2, 3, 4, 5]
*/

class User {
  constructor(name, age, location) {
    this.name = name;
    this.age = age;
    this.location = location;
  }
}

const user = new User('재승', 20);
const { name, age } = user;

console.log(`${name}은 ${age}살 입니다.`);

const array3 = ['홍길동은 30살입니다.', 1, 2, 3, 4, 5];

const [profile, firstNum, ...num] = array3;

console.log(profile);
console.log(`첫 번째 요소: ${firstNum}`);
console.log(num);

class User2 {}

/*
5. 클래스와 구조분해 할당을 활용한 학생 관리 시스템
- Student 클래스를 정의하고 name, age, score 속성을 추가하세요.
- 3명의 학생 데이터를 가진 배열 students를 생성하세요.
- 구조분해 할당을 사용하여 학생들의 이름과 점수만 배열로 추출하여 출력하세요.

예시 출력:
학생 이름: [유관순, 홍길동, 장보고]
학생 점수: [90, 80, 70]
*/

class Student {
  constructor(name, age, score) {
    this.name = name;
    this.age = age;
    this.score = score;
  }
}

const students1 = new Student('재승', '20', '90');
const students2 = new Student('태정', '21', '80');
const students3 = new Student('선웅', '22', '70');

const students = [students1, students2, students3];

const names = students.map(({ name }) => name); // 화살표 함수

const scores = students.map(function ({ score }) {
  // 화살표 함수X
  return score;
});

console.log('학생 이름:', names);
console.log(
  '학생 점수:',
  //scores.sort((a, b) => b - a)
  scores
);
