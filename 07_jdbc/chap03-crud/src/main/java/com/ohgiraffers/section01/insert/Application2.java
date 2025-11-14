package com.ohgiraffers.section01.insert;

import com.ohgiraffers.Controller.InsertController;
import com.ohgiraffers.model.MenuDTO;

import java.util.Scanner;



public class Application2 {
    public static void main(String[] args) {

        /* 1. 메뉴의 이름, 가격, 카테고리 코드, 판매 여부를 입력 받기(Scanner 이용) */

        /* 2. MenuDTO 객체를 생성하여 입력받은 값으로 setting */

        /* 3. InsertController의 insertMenu() 메소드 호출 (2번에서 setting된 DTO 전달하면 호출!!) */

        /* 4. insert 결과에 따라 성공이면 '메뉴 등록 성공!' 출력, 실패이면 '메뉴 등록 실패!' 출력 */

        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴의 이름 : ");
        String menuName = sc.nextLine();

        System.out.print("가격 : ");
        int menuPrice = sc.nextInt();

        System.out.print("카테고리 코드 : ");
        int categoryCode = sc.nextInt();

        sc.nextLine();

        System.out.print("판매여부 Y ro N : ");
        String orderableStatus = sc.nextLine();

        MenuDTO dto = new MenuDTO();

        dto.setMenuName(menuName);
        dto.setMenuPrice(menuPrice);
        dto.setCategoryCode(categoryCode);
        dto.setOrderableStatus(orderableStatus);

        InsertController inc = new InsertController();

        int result = inc.insertMenu(dto);

        if(result > 0){
            System.out.println("메뉴 등록 성공");
        }else{
            System.out.println("메뉴 등록 실패 ㅜㅜㅜ");
        }

    }
}
