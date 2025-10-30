package com.ohfiraffers.section02.looping;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
        //app.whyNeedLoops();
        //app.forLoopSum();
        //app.nestedForLoop();
        app.nestedForLoop2();
    }

    public void whyNeedLoops() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1번째 학생의 이름 입력해주세요 :");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은" + student1 + "입니다.");

        System.out.println("2번째 학생의 이름 입력해주세요 :");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은" + student2 + "입니다.");


        ArrayList<String> sName = new ArrayList<>();


        for (int i = 1; i < 10; i++) { // i가 1부터 10까지 1씩 증가하는 동안 반복!
            System.out.println(i + "번째 학생의 이름을 입력해주세요:");
            String student = sc.nextLine();
            sName.add(student);
            System.out.println(i + "번째 학생의 이름은" + student + "입니다.");
        }
    }

    // for문 - 누적 합계 구하기


    public void forLoopSum() {
        // 1부터 사용자가 입력한 숫자까지의 합계 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("합계를 구할 양의 정수를 입력하세요:");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;   // sum = sum + i;
        }
        System.out.println("1부터" + sum + "까지의 합은 :" + sum);
    }

    // 중첩 for문 - 구구단
    public void nestedForLoop() {

        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    // 중첩 for문 - 별 찍기

    public void nestedForLoop2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("출혁할 줄 수를 입력하세요:");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("***");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("***");
            }
            System.out.println();

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j < rows; j++) {
                System.out.print("***");
            }
            for (int j = i; j < rows - 1; j++) {
                System.out.print("***");
            }

            System.out.println();
        }

    }

    public void whileLoop() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (str.equals("exit")) {
            System.out.println("문자열을 입력하세요");
            str = sc.nextLine();
            System.out.println("입력한 문자열:" + str);

        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void whileLoop2() {
        Scanner sc = new Scanner(System.in);
        String str;

        do {
            System.out.println("문자열을 입력하세요('exit'입력시 종료:");
            str = sc.nextLine();
            System.out.println("입력한 문자열:" + str);

        } while (!str.equals("exit"));


    }
}



