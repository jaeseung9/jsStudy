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

const myDog = new Dog("바둑이", "멍멍", "진돗개");
myDog.speak();

const bulldog = new Dog("뭉치", "왈왈", "불독");
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
console.log(`면적: ${rect.area}`);  // 면적: 50

// width 변경
rect.width = 7.5;

// 변경 후 면적 출력
console.log(`변경 후 면적: ${rect.area}`);  // 변경 후 면적: 75