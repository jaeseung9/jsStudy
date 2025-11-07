package com.ohgiraffers.section01;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // 테스트용 데이터 리스트
        List<String> names = Arrays.asList("홍길동", "유관순", "이순신", "신사임당", "장보고", "강감찬", "이성계");

        // 기존 방식 :  for-each문을 사용한 외부 반복
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---------");

        // [ 스트림 방식 ] forEach를 사용한 내부 반복
        names.stream().forEach(name -> System.out.println(name));

        /* 스트림 파이프라인 조립하기 */
        /**
         * 요구사항 : 이름이 4글자인 사람만 찾아서, "🍓신사임당🍓" 과 같은 형태로 변환하여 출력하라
         */
        for (String name : names) {
            if (name.length() == 4) {
                String decoratedName = "🍓" + name + "🍓";
                System.out.println(decoratedName);
            }
        }
        System.out.println(" ------------ ");

        names.stream()
                .filter(name -> name.length() == 3)
                .map(name -> "🍓" + name + "🍓")
                .forEach(decoratedName -> System.out.println(decoratedName));

        /* 스트림 결과물 만들기 : collect */
        /**
         * 요구사항 : 성이 '이'씨인 사람들을 찾아서, 알파벳 순서로 정렬한 후, 새로운 List로 만들어라.
         * */
    }
}
