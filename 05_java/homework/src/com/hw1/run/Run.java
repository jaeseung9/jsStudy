package com.hw1.run;


import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Student[] student = new Student[3];
        Employee[] employee = new Employee[10];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i < student.length; i++){
            System.out.println("학생 정보를 입력 해주세요." +
                    "전공, 이름, 나이, 신장, 몸무게, 학년");
            String major = sc.nextLine();

            student[i] = new Student(
                    sc.nextLine(),
                    sc.nextInt(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextInt(),
                    major
            );
            sc.nextLine();
        }
        for( Student s : student ){
            System.out.println(s.Information());
        }

        int num = 0;
        while(true) {
            System.out.println("직장인 정보를 입력해주세요." +
                    "부서, 이름, 나이, 신장, 몸무게, 급여");

            String dept = sc.nextLine();
            employee[num++] = new Employee(sc.nextLine(),
                    sc.nextInt(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextInt(),
                    dept);
            sc.nextLine();

            System.out.println("계속 하시겠습니까? (y , n)");
            String a = sc.nextLine();
            if(a.equals("y")) continue;
            else {
            System.out.println("종료합니다.");
            break;
            }
        }

        for( Employee e : employee ){
            if(e != null)break;
            System.out.println(e.Information());
        }

    }
}
