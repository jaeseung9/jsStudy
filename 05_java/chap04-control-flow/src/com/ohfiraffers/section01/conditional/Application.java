package com.ohfiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application application = new Application();

        //application.testSimpleIf();

        //application.testNestedIf();

        //System.out.println(application.testSimpleIfElse(5));

        //application.testGradeCalculation();

        application.testSimpleSwitch();
    }

    // 1. if문
    public void testSimpleIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개를 입력하세요 :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            // 위의 조건이 true일 때만 이 블록이 실행된다.
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    // 2. 중첩 if문과 논리 연산자
    public void testNestedIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 한 개 입력하세요 :");
        int num = sc.nextInt();

        //첫 번째 조건: 양수인가?
        if (num > 0) {
            System.out.println("네 양수 입니다.");
            if (num % 2 == 0) {
                // 두 번째 조건: 짝수인가?
                System.out.println("입력하신 숫자는 양수이면서 짝수 입니다.");
            }
        } else if (num == 0) System.out.println("입력하신 숫자는 0 입니다.");
        else if (num % 2 == 0) System.out.println("입력하신 숫자는 음수이면서 짝수 입니다.");
        else System.out.println("음수 입니다.");
        // 논리 연산자(&&)를 쓰는 것이 훨씬 간결하다.

        if (num % 2 == 0 && num > 0) System.out.println("입력하신 숫자는 양수이면서 짝수 입니다.");
        else System.out.println("입력하신 양수이면서 짝수가 아닙니다.");
    }

    // 3. if-else
    public String testSimpleIfElse(int num) {
        System.out.println("정수를 하나 입력하세요 :" + num);

        // 홀수인가?
        return num % 2 == 0 ? "입력하신 정수는 짝수 입니다." : "입력하신 정수는 홀수 입니다.";
    }

    // 4. if-else-if 문
    public void testGradeCalculation() {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 점수를 입력하세요:");
        int point = sc.nextInt();
        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            } else if (point == 100) grade = "S";
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) grade = "+";
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) grade = "+";
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) grade = "+";
        } else grade = "F";
        System.out.println("점수는 " + point + "이고, 등급은" + grade + "입니다.");
    }

    // 5. switch문
    public void testSimpleSwitch() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 입력");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 입력:");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) :");

        //char op = sc.nextLine().charAt(0); // 버퍼에 남아있는 개행문자를 만나 읽기 종료되어 에러 발생!
        char op = sc.next().charAt(0); // next()는 버퍼에 남아있는 \n(개행문자)를 무시하고 다음 단어를 읽는다.

        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break; // 여기서 멈춰라
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            default: // 위 case에 아무것도 해당되지 않을 때
                System.out.println("Error");
                return; // 메소드 종료
        }
        System.out.println(first + " " + op + second + " " + result);
    }

}
