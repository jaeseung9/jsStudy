package com.greedy.level01.basic;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //Calculator calculator = new Calculator();

        //calculator.checkMethod();

        //System.out.println(calculator.sumlto10());

        // calculator.checkMaxNumber(10,20);

        // System.out.println(calculator.sumTwoNumber(10,20));

        //   System.out.println(calculator.minusTwoNumber(10,5));


        score();
        salary();
        System.out.println(홀짝());
        숫자맞추기();
    }

    public static void score() {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수 입력");
        int 국어 = sc.nextInt();
        System.out.println("영어 점수 입력");
        int 영어 = sc.nextInt();
        System.out.println("수학 점수 입력");
        int 수학 = sc.nextInt();

        if ((국어 + 영어 + 수학) / 3 >= 60) System.out.println("평균 합격입니다!");
        if (국어 >= 40) System.out.println("국어합격입니다!");
        else System.out.println("국어불합격!");
        if (영어 >= 40) System.out.println("영어합격입니다!");
        System.out.println("영어불합격!");
        if (수학 >= 40) System.out.println("수학합격입니다!");
        else System.out.println("수학불합격!");
    }

    public static void salary() {
        Scanner sc = new Scanner(System.in);

        System.out.println("월 급여 입력:");
        int 월급여 = sc.nextInt();

        System.out.println("매출액 입력:");
        int 매출액 = sc.nextInt();

        int 보너스율 = 0;

        if (매출액 >= 50000000) 보너스율 = 5;
        else if (매출액 >= 30000000) 보너스율 = 3;
        else if (매출액 >= 10000000) 보너스율 = 1;
        else if (매출액 <= 1000000) 보너스율 = 0;

        System.out.println(매출액);
        System.out.println(보너스율);
        System.out.println(월급여);
        System.out.println(((float) 매출액 * ((float) 보너스율 / 100)));
        System.out.println((((float) 매출액 * ((float) 보너스율 / 100))) + (float) 월급여);
    }

    public static String 홀짝() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");

        int num = sc.nextInt();
        String 수박 = "";

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) 수박 += "수";
            else 수박 += "박";
        }

        return 수박;
    }

    public static void 숫자맞추기() {

        Scanner sc = new Scanner(System.in);

        int 랜덤숫자 = (int) (Math.random() * 100) + 1;

        while (true) {
            System.out.println("정수를 입력 해주세요!:");
            int 입력숫자 = sc.nextInt();
            if (랜덤숫자 > 입력숫자) System.out.println("랜덤숫자가 더 큼");
            else if (랜덤숫자 < 입력숫자) System.out.println("랜덤숫자가 작음");
            else {
                System.out.println("정답입니다!");
                break;
            }
            System.out.println("답안지:" + 랜덤숫자);

        }

    }


}
