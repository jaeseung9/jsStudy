package com.greedy.level03.basic.student.run;
import  com.greedy.level03.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDTO[]  students = new StudentDTO[10];

        for(int i=0; i<10; i++){
            students[i] = new StudentDTO();
        }

        int num = 1;
        while(num <= 10){
            students[num].StudentDTO(
                    sc.nextInt(),sc.nextInt(),sc.next(),
                    sc.nextInt(),sc.nextInt(),sc.nextInt());

            System.out.println("계속 추가할 겁니까? (y/n)");

            String y = sc.next();

            if(y.equals("n")){
                break;
            }
            else if(y.equals("y")){
                System.out.println("계속 진행하겠습니다.");
            }
            else{
                System.out.println("잘못된 입력을 하였습니다. 종료합니다.");
                break;
            }

            num++;
        }

           for(int i=1; i< num+1; i++) {
               students[i].getinformation();
           }



    }
}
