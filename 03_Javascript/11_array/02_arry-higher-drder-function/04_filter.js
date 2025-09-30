// filter: 배열의 모든 요소에 대해 콜백 함수를 호출하고,
// 그 결과가 true인 요소만으로 '새로운 배열'을 만든다.

const numbers = [1, 2, 3, 4, 5, 6, 7, ,8 ,9, 10];


// 짝수만 걸러내기

const evenNumbers = numbers.filter(num => num % 2 ===0);
console.log(evenNumbers);


const students = [
    {name: '홍길동',score:90},
    {name: '유관순', score:95},
    {name: '서재승', score:95},
    {name: '윤태정', score:95}
];


const highScores = students.filter(student => student.score >= 95);

console.log(highScores);

// 혼자 쳐보기
//const evenNumbers = numbers.filter(num => {
//    if(num % 2 ==0 )return true;
//    else false;
//});
//
//console.log(evenNumbers);