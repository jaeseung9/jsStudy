const studentHQ = {
    activate: true,
    login: function(){
        console.log(`${this.name}님 로그인 되었습니다.`)
    }
};


// 생성자함수
function Student(name){
    this.name = name;
}

// 생성자 함수로 새로 만들어질 객체들이 바라볼 프로토타입 객체를 지정
Student.prototype = studentHQ;


// new 연사자를 사용해 만든 객체는
// 생성자 함수의 프로토타입 정보를 사용해 [[Prototype]]을 설정한다.
// student1.__proto__ == studentHq;
const student1 = new Student('판다');
const student2 = new Student('돼지');

console.log(student1);
console.log(student2);

student1.login();
student2.login();


