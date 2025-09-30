

var dog =
{
    name : '뽀삐',
    eat : function(food)
    {
        console.log(`${this.name}는 ${(food)}를 맛있게 먹어요.`)
    }
}

// 마침표 표기법
console.log(dog.name);

dog.eat("개껌");

// 대괄호 표기범 . 프로퍼티 키는 반드시 따옴표로 감싼 문자열을 사용한다.
console.log(dog['name']);
dog['eat']('간식');

// key가 변수에 담겨 있을 때
var propName = 'name';

//dog.propName 이라고 쓰면 'propName' 이라는 키를 찾으려고 한다.(undefined)
// 변수에 담긴 키 값을 이용해 동적으로 프로퍼티에 접근할 때 유용하게 쓰인다.
console.log(dog[propName]); // dog['name']과 같음


// in 연산자
// 프로퍼티 '존재'
console.log("name" in dog);//dog안에 name 존재하나
console.log("age" in dog); 


// for in 반복문
// 객체의 모든 프로퍼티 키 순회
for(var key in dog){        // dog안에 있는 k라는 값으로 다 사용        
    console.log(`key : ${key}`);//
    console.log(`key :${key} : 인자값: ${dog[key]}`);
}
