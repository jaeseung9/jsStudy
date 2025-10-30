package com.ohgiraffers.section04.sort;

import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("홀수인 양의 정수를 입력하세요 :");

        int num = sc.nextInt();;
        int num2 = 1;
        int[] arrNum = new int[num];



        for(int i=0; i< num; i++) {
            if(num % 2 == 0){
                System.out.println("홀수인 양의 정수를 입력해야 합니다!");
                break;
            }
            if(i <= num / 2){
                arrNum[i]= i + 1;
            }
            else{
                arrNum[i] = i - num2;
                num2++;
                num2++;
            }
        }
        System.out.println(Arrays.toString(arrNum));

        int[] nums = new int[4];
        int[] nums2 = new int[9];
        int[] myNum2 = new int[4];

        for (int i = 0; i < 9; i++) {
            nums2[i] = i;
        }

        for (int i = 0; i < 4; i++) {
            int RandomNum = i + (int) (Math.random() * (9 - i));

            int temp = nums2[i];
            nums2[i] = nums2[RandomNum];
            nums2[RandomNum] = temp;

            nums[i] = nums2[i];
        }

        System.out.println("정답:" + Arrays.toString(nums));

        for (int i = 0; i < 11; i++) {

            int st = 0;
            int bl = 0;
            System.out.println("4자리의 정수를 입력해주세요! :");
            int myNum = sc.nextInt();

            if(String.valueOf(myNum).length() != 4) {
                i--;
                System.out.println("4자리의 정수로 다시 입력해주세요!");
                continue;
            }

            for (int j = myNum2.length-1; j >= 0; j--) {
                myNum2[j] = myNum % 10;
                myNum /= 10;
            }

            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == myNum2[j]) {
                    st++;
                }
                else {
                    for (int k = 0; k < nums.length; k++) {
                        if (nums[j] == myNum2[k]){
                            bl++;
                            break;
                        }
                    }
                }
            }

            if(st == 4){
                System.out.println("정답 맞춤 게임 종료");
                break;
            }

            System.out.println(st + "스트라이크 " + bl + "볼");
            System.out.println(i + 1 + "회 만큼 소모하였습니다. 10회가 넨으면 게임이 종료 됩니다.");
            st = 0;
            bl = 0;
        }


    }
}
