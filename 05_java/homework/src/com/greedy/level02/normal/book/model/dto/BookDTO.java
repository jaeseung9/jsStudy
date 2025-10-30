package com.greedy.level02.normal.book.model.dto;

public class BookDTO {

    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public void BookDTO(){
        System.out.println("DTO가 호출 되었습니다.");
    }

    public void BookDTO(String title,String publisher,String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public void BookDTO(String title, String publisher,String author,int price,double discountRate){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void printInformation(){

        System.out.println("타이틀: " + this.title + "출판년도: " + this.publisher + "작가: "+ this.author + "가격: " + this.price + "할인율: " + this.discountRate);
    }


}
