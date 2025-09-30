// map: 배열의 모든 요소에 대해 콜백 함수를 호출하고, 그 결과를 모아 '새로운 배열'을 만든다.

const numbers = [1, 2, 3, 4, 5, 6];

// 각 숫자를 제곱한 새로운 배열 만들기

const squaredNumbers = numbers.map(num => num * num);


console.log(numbers); // 원본 배열에는 영향을 주지 않는다.
console.log(squaredNumbers); 


// 객체 배열에서 이름만 뽑아서 새로운 배열 만들기
const students = [
    {name: '홍길동',score:90},
    {name: '유관순', score:95}
];

const studentNames = students.map(student => student.name );

console.log(studentNames);


//#region 수업x혼자 연습
//const result = numbers.map(num => {
//    if(num % 2 ==0)return num* num;
//    else return num;
//})
//
//console.log(result);
//#endregion