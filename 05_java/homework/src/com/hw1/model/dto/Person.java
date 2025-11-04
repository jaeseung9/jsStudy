package com.hw1.model.dto;

public class Person {

    protected String name;
    private int age;
    private double height;
    private double weight;

    Person(){
        System.out.println("기본 생성자 호출~");
    }

    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String Information(){

        return "name :" + name + "age :" + age + "height :" + height + "weight :" + weight;
    }
}
