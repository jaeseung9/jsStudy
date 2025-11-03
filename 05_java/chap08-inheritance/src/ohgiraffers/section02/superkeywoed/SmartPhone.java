package ohgiraffers.section02.superkeywoed;

// Product 클래스 상속 받는다.
public class SmartPhone extends Product {


    // 고유 필드를 하나 추가
    String color;

    // 부모 필드 포함 모든 필드를 초기화 하는 생성자
    public SmartPhone(){
        super();
        System.out.println("SmartPhone 기본 생성자 호출");
    }

    public SmartPhone(String code, String name, int price,String color){
        super(code,name,price);
        this.color = color;
        System.out.println("SmartPhone클래스의 부모 필드도 초기화하는 생성자 호출함");
    }

    // getInformation() 메소드 오버라이딩
    @Override
    public String getInformation(){
        String parentInfo = super.getInformation();
        String smartPhoneInfo = ", Computer [cloor= " + color + "]";

        return parentInfo + smartPhoneInfo;
    }

}
