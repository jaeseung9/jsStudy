package com.ohgiraffers.section02.demensinal;

public class Application {
    public static void main(String[] args) {

        /*
         * [ 다차원 배열 ]
         * 2차원 이상의 배열을 의미하며, 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열이다.
         * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열이다.
         * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열 이상의 배열은 사용 빈도가 현저히 적다.
         *
         * [ 2차원 배열을 사용하는 방법 ]
         * 1. 배열의 주소를 보관할 래퍼런스 변수 선언 (stack)
         * 2. 여러 개의 1차원 배열의 주소를 관리할 배열 생성 (heep)
         * 3. 2에서 생성한 배열의 각 인덱스에서 관리하는 배열을 할당(heep)하여 주소를 보관하는 배열
         * 주소를 보관하는 배열(= 2에서 생성한 배열)에 저장
         * 4. 생성한 여러 개의 1차원 배열에 접근하여 사용
         * */

        // 1. 2차원 배열 선언 및 할당
        int[][] iarr = new int[3][5];

        // 2.중첩 반복문을 이용한 값 입력
        int  value = 1;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
            }
        }

        // 3. 중첩 반복문 선언 및 할당
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
