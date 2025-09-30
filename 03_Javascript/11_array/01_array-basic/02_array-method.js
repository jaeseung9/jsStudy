const foods = ['짜장면', '샌드위치', '우동'];
console.log(foods);

// push(): 맨 뒤에 값 추가하기
foods.push('탕후루');
foods.push('햄버억');

console.log('push 후:',foods);

// pop(): 맨 뒤 값 삭제
foods.pop();
console.log('pop 한번:',foods);

//const food = foods.pop(); // 값을 제거하고 제거한 값을 반환한다.

foods.pop();
console.log('pop 두번:',foods);


/* 
unshift(): 맨 앞에 값을 추가한다.
shift(): 맨 앞 값을 제거한다.
*/
// shift(): 맨 앞 값 삭제
foods.shift();
console.log('shift 한번:',foods);

// unshift(): 맨 앞에 값 추가
foods.unshift('짜장면');
console.log('unshift',foods);

/* 
indexOf(값): 특정 값이 있는 '첫 번째 인덱스'를 알려준다. 없으면 -1을 반환한다.
includes(값): 특정 값이 있는지 여부만 true/false로 알려준다.
*/

foods.push('짜장면');
console.log(foods);

console.log(foods.indexOf('짜장면'));
console.log(foods.indexOf('샌드위치'));

console.log(foods.includes('샌드위치'));
console.log(foods.includes('홍어'));