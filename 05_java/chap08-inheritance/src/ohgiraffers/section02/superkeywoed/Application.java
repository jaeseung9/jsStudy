package ohgiraffers.section02.superkeywoed;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("S-0123","갤럭시", 2300000);

        System.out.println(product2.getInformation());

        Computer computer = new Computer("S-9123","갤럭시",2300000,"512",12);
        System.out.println(computer.getInformation());

        SmartPhone smartPhone = new SmartPhone("S-1541","아이폰",215634,"red");
        System.out.println(smartPhone.getInformation());
    }
}
