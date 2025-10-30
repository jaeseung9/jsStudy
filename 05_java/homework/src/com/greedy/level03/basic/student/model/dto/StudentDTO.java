package com.greedy.level03.basic.student.model.dto;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;


    public void StudentDTO() {
        System.out.println("DTO가 호출 되었습니다!!!");
    }

    public void StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom =classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void getinformation() {
        System.out.println(this.grade + "학년 " + this.classroom + "반" + this.name + "국어 점수: " +
                this.kor + "영어 점수: " + this.eng + "수학 점수 :" + this.math);
    }
}
