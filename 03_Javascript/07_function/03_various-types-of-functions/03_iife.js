/* 
즉시 실행 함수(IIFE)
함수를 정의하자마자 딱 한 번만 실행되는 '일회용 함수' 입니다.
*/

function sayHi() {
    console.log('일반 함수 Hi!!')
}

sayHi();

(() => // 이름없는 화살표함수
{
    //console.log("즉시 실행 함수가 실행되었1");
})(); // () <== 이 부분이 즉시 호출

(function () {
    const secretMessage = "이 변수는 이 안에서만 존재합니다."
    console.log('즉시 실행 함수가 실행되었습니다.');
    console.log(secretMessage);
})(); // () <== 이 부분이 즉시 호출

//console.log(secretMessage); // ReferenceError: secretMessage in not defined

/* 
- 변수 이름 충돌 방지: 내가 만든 변수 이름이 다른 라이브러리나 코드와 겹치는 것을 막아줍니다.
- '전역 스코프'를 오염시키지 않기 위해 사용합니다. (중요!)
*/

const result = (() => {
    let a = 10;
    let b = 20;
    return a + b;
})();

console.log(result);