package com.hw1.model.dto;

public class Employee extends Person {

    private int salary;
    private String dept;


    public Employee() {
        System.out.println("Employee 생성자 호출!!1");
    }

    public Employee(String name, int age, double height, double weight, int salart, String dept) {
        super(age, height, weight);
        this.name = name;
        this.salary = salart;
        this.dept = dept;
    }

    @Override
    public String Information(){

        String getInfoPerson = super.Information();
        String getInfoStudent = salary + dept;

        return getInfoPerson + getInfoStudent;
    }
}

