

/* 함수 선언문 */

// 함수 선언문에서는 함수의 이름을 생략할 수 없다.
function hello(name){
    return `${name}님 안녕하세요!`
}

//함수 호출
console.log(hello("재승"));

/* 2. 함수 표현식 */
var hi = function(name){
    return `${name} 안녕~`;
};

console.log(hi("재승"));


// 함수 표현식에서 함수명을 생략하지 않아도 문제는 없다.
var  calc = function add(a,b){
    return a + b;
}

// 단, 함수 호출은 식별자로 이우러진다.
console.log(calc(10,20));

