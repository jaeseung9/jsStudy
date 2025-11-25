/* 문제 1: 나이에 따른 영화 관람 가능 여부(삼항 연산자 사용)
 - 변수 age를 선언하고, 삼항 연산자를 사용해 18세 이상이면 '관람 가능', 아니면 '관람 불가'를 출력하세요. */

let age = 99;
let passed;

if (age > 18) passed = "관람 가능";
else passed = "관람 불가";

passed = age > 18 ? "관람 가능" : "관람 불가";

/* 문제 2: 점수에 따른 보너스 지급 (if문 사용)
 - 변수 score를 선언하고 80 이상이면 10점 보너스를 추가하세요. 
 - 50 이상 80 미만이면 5점 보너스를 추가하세요. 
 - 50 미만이면보너스가 없습니다.

 **hint: else문은 작성하지 않아도 된다. */

let score = Math.floor(Math.random() * 100) + 1;

score = score >= 80 ? score + 10 : score >= 50 ? score + 5 : score;

/* 문제 3: 월에 따른 계절 출력(switch문 사용)
 - 변수 month를 선언하고, 해당 월에 따라 계절을 출력하세요.
 - season 변수를 선언하고, season 에 계절이 할당되도록 case문을 작성하세요.
 - 12, 1, 2: 겨울 / 3, 4, 5: 봄 / 6, 7, 8: 여름 / 9, 10, 11: 가을 */

let month;
let season;

month = Math.floor(Math.random() * 12) + 1;

switch (month) {
  case 12:
  case 1:
  case 2:
    season = "겨울";
    break;
  case 3:
  case 4:
  case 5:
    season = "봄";
    break;
  case 6:
  case 7:
  case 8:
    season = "여름";
    break;
  case 9:
  case 10:
  case 11:
    season = "가을";
    break;
}

/* 문제 5: 1부터 n까지의 홀수 출력(while문 사용)
 - 변수 n을 선언하고, 1부터 n까지의 숫자 중 홀수를 출력하세요. 
 **hint: 1부터 시작할 변수가 필요하겠죠? */

let n = Math.floor(Math.random() * 100) + 1;
let n2 = 1;

while (n2 <= n) {
  n2 % 2 === 1 ? console.log(n2) : null;
  n2++;
}

/* 문제 6: 특정 숫자 건너뛰기
 - 1부터 20까지의 숫자 중 5의 배수를 제외하고 출력하세요. */

for (let i = 1; i < 21; i++) {
  if (i % 5 != 0) console.log(i);
}

/* 문제 7: 반복 중단
 - 1부터 50까지 숫자를 출력하다가, 30 이상일 때 반복을 중단하세요. */

for (let i = 1; i < 50; i++) {
  if (i >= 30) break;
  console.log(i);
}
