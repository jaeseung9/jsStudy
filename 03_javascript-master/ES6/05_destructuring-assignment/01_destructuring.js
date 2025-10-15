/**
 * [구조 분해 할당]
 * 배열이나 객체의 속성을 분해하여 그 값을 개별 변수에 쉽게 담을 수 있게 하는
 * ES6의 강력하고 간결한 문법이다.
 */

const nameArr = ['Luz', 'Lee'];

// 기존 방식
// const firstName = nameArr[0];
// const lastName = nameArr[1];

// 구조 분해 할당 방식
const [firstName, lastName] = nameArr;
console.log(lastName, firstName);

// 쉼표를 사용해 특정 요소를 건너뛸 수 있다.
const [, , title] = ['Mr', 'Gildong', 'Hong'];
console.log(title);

// rest 파라미터(...)로 나머지 요소들을 새로운 배열로 모을 수 있다.
const [leader, ...members] = ['팀장', '팀원1', '팀원2', '팀원3'];
console.log(leader);
console.log(members);

// 기본값(=) 설정: 할당할 값이 없을 때 사용될 기본값을 지정한다.
const [user1, user2 = '기본값'] = ['사용자1'];
console.log(user1);
console.log(user2);

/* 
[객체 구조 분해 할당]
객체는 '키(key) 이름'이 중요하다. 변수 이름과 같은 키를 찾아 값이 할당된다.
*/

const student = {
  name: '유관순',
  age: 16,
  major: '독립운동',
};

// 기존 방식
//const name = student.name;
//const age = student.age;

// 구조 분해 할당 방식
// 콜론(:)을 사용하면 새 변수명으로 할당할 수 있다.
const { name, age } = student;
console.log(`이름: ${name}, 나이:${age}`);

// name이 이미 선언되었기 때문에 name이라는 key값으로 새로운 변수이름 studentName을 사용해서 할당
const { major, name: studentName } = student;
console.log(major, studentName);

// rest 파라미터(...)로 나머지 프로퍼티들을 새로운 객체로 모을 수 있다.
const { age: studentAge, ...restInfo } = student;
console.log(restInfo);

/* 
함수에 객체를 인자로 전닿할 때, 구조 분해 할당을 사용하면
매개변수의 순서를 신경 쓸 필요 없고, 가독성도 높아진다.
*/

const product = {
  id: 'p-001',
  name: '노트북',
  price: 1700000,
  specs: {
    cpu: 'i7',
    ram: '16GB',
  },
};

// 함수의 매개변수 자리에서 바로 구조 분해를 한다.
function printProductInfo({ name, price, specs: { ram }, producer = '삼성' }) {
  console.log(name);
  console.log(price);
  console.log(ram);
  console.log(producer); // 전달된 객체에 없으므로 기본값 사용
}

// 함수를 호출할 때 객체 하나만 전달하면 된다.
printProductInfo(product);
