package com.greedy.level01.basic;

import java.util.Scanner;

public class Calculator {

    public void checkMethod() {
        System.out.println("함수 호출 되었습니다.");
    }

    public int sumlto10() {

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {

        System.out.println(a > b ? a : b);
    }

    public int sumTwoNumber(int a, int b) {


        return a + b;
    }

    public int minusTwoNumber(int a, int b) {

        return a - b;
    }



}
