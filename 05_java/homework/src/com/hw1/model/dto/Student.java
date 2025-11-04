package com.hw1.model.dto;

public class Student extends Person {
    private int grade;
    private String major;

    public Student(){
        System.out.println("Student 기본 생성자 호출됨!");
    }

    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age,height,weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String Information(){

        String getInfoPerson = super.Information();
        String getInfoStudent = grade + major;

        return getInfoPerson + getInfoStudent;
    }


}
