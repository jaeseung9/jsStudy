// 1. let,const 변수 중복 선언 금지 -> 코드의 안정성 확보(캡슐화)
let msg = '안녕하세요';

//SyntaxError: Identifier 'msg' has already been declared
//let msg = '안녕히 가세요'; // Error 같은 이름 변수 선언시

// 2. 블록({}) 레벨 스코프 -> 변수 오염 방지
let i =0;

for(let i=0; i<5; i++)
{
    console.log('for문 내부의 i:', i);
}

console.log('for문 바깥의i',i);


// 3. 변수 호이스팅이 일어나지 않는 것처럼 동작
// console.log(test); // 에러

let test; // 선언과 초기화 단계과 분리되어, 선언 전에 접근하면 에러 발생
test = '반갑습니다';
console.log(test);