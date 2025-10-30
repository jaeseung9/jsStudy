package com.greedy.level02.normal.book.run;
import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {
        BookDTO bd = new BookDTO();

        bd.BookDTO();
        bd.printInformation();
        bd.BookDTO("자바의  정석","도우출판","남궁성");
        bd.printInformation();
        bd.BookDTO("홍길동전","할빈당","허균",5000000,0.5);
        bd.printInformation();

    }
}
