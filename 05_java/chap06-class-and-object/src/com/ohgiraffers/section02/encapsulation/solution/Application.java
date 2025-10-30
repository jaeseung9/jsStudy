package com.ohgiraffers.section02.encapsulation.solution;

public class Application {
    public static void main(String[] args) {

        Chlidren chlid1 = new Chlidren();
        chlid1.setAge(-10);  // setter 메소드로 나이 설정


        System.out.println("어린이 정보 : " + chlid1.getAge() + "세");

        //chlid1.age = -30; // private 필드이기 때문에 접근할수 없다
        System.out.println("어린이 정보 : " + chlid1.getAge() + "세");
    }
}
