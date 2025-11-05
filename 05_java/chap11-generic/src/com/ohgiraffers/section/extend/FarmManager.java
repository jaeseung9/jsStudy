package com.ohgiraffers.section.extend;

public class FarmManager {

    // RabbitFarm<?> : Rabbit의 자손이라면 어떤 타입이든 상관없는 RabbitFarm을 매개변수로 받는다.
    public void manageAnyFarm(RabbitFarm<?> farm){
        System.out.println("어떤 토끼 농장이든 관리 가능해요:");
        farm.getAnimal().cry();
    }

    // Bunny이거나 Bunny의 자손타입만 담긴 RabbitFarm만 받는다.
    public void mabageBunnyFarm(RabbitFarm<? extends Bunny> farm){
        System.out.println("버니 혹은 더 특별한 버니 농장만 관리해요:");
        farm.getAnimal().cry();
    }

    // Bunny이거나 Bunny의 부모 타입만 담긴 RabbitFarm만 받는다.
    public void manageRabbitOrBunnyFarm(RabbitFarm<? super Bunny> farm){
        System.out.println("바니 호은 일반 토끼 농장에 새로운 바니를 넣어요:");
        farm.getAnimal().cry();
    }
}
