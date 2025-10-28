package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumber;

public class Application {
    public static void main(String[] args) {

        // non-static 메소드 호출
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumber(30,20);
        System.out.println(min);

        // static 메소드 호출
        int max = com.ohgiraffers.section01.method.Calculator.maxNumber(30,20);
        System.out.println(max);

        // import 사용하여 다른 패키지의 클래스 사용하기
        // non-static
        Calculator calc2 = new Calculator();
        int min2 = calc2.minNumber(30,20);
        System.out.println(min2);

        // static
        int max2 = Calculator.maxNumber(30,20); // 클래스 이름은 여전히 필요하다.
        System.out.println(max2);

        /* 메소드 이름만으로 호출 가능하지만 권장하지 않음
        * 이 기능이 어디에서 온건지 한눈에 파악하기 어려움*/
        int max3 = maxNumber(40,20); // static import 해서 클래스명 없이 메소드 이름만으로 호출 가능
        System.out.println(max3);
    }
}
