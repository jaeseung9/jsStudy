let globalVar = '전역 변수'; // 가장 넓은 스코프

if (true) {
    let blockVar = '블록 스코프 변수'; // if문 안에서만 유효

    function sayHi() {
        let functionVar = '함수 스코프 변수'; // sayHi 함수 안에서만 유효


        console.log(globalVar);
        console.log(blockVar);
        console.log(functionVar);
    }

    sayHi();

    //console.log(functionVar); ReferenceError: functionVar is not defined
}

//console.log(blockVar); Error: 블록 밖에서는 접근 불가 (var로 선언하면 가능!!)

