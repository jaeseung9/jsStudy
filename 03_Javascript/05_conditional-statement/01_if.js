/* 
조건문: if-else
    if (조건식){
         조건식이 true인 경우 실행구문
}
         else{
            조건식이 false인 경우 실행구문 
            
            
            
            }
*/

var temperature = 25;

if(temperature <10)
{
    console.log("오늘은 추운 날씨입니다. 옷을 따듯하게 입으세요~!") // 조건이 참일 때 실행
}
else
{
    console.log("오늘은 날씨가 괞찮습니다.");
}

/* 
조건문: if-else if-else
    if (조건식1){
조건식1 true인 경우 실행구문}
else if(조건식2){
조건식2 true인 경우 실행구문
}
else{
    위의 조건이 다 false일 경우 실행구문}

*/

var score = 85;

if(score >=90)
{
    console.log("성적이 매우 우수합니다.");
}
else if(score >=90) console.log("성적이  우수합니다.");
else if(score >=80) console.log("성적이 조금 우수합니다.");
else if(score >=70) console.log("성적이 적당합니다.");
else if(score >=60) console.log("성적이 부족합니다.");
else if(score >=50) console.log("성적이 좀 많이부족합니다.");
else if(score >=40) console.log("성적이 많이 부족합니다.");
else if(score >=30) console.log("성적이 매우 많이 부족합니다.");
else  console.log("심각 합니다.");