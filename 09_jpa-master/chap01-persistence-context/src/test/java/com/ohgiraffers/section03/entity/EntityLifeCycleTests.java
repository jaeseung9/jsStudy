package com.ohgiraffers.section03.entity;

import com.ohgiraffers.section03.eneity.EntityLifeCycle;
import com.ohgiraffers.section03.eneity.EntityManagerGenerator;
import com.ohgiraffers.section03.eneity.Menu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class EntityLifeCycleTests {

    private EntityLifeCycle lifeCycle;

    @BeforeEach
    void setup() {
        this.lifeCycle = new EntityLifeCycle();
    }

    @DisplayName("비영속 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void testTransient(int menuCode) {
        // when
        // 영속성 컨텍스트에서 관리되는 영속 상태의 객체(entityManager가 find로 찾아온 객체)
        Menu foundMenu = lifeCycle.findMenuByMenuCode(menuCode);

        Menu newMenu = new Menu(
                foundMenu.getMenuCode(),
                foundMenu.getMenuName(),
                foundMenu.getMenuPrice(),
                foundMenu.getCategoryCode(),
                foundMenu.getOrderableStutus()
        );

        EntityManager entityManager = lifeCycle.getManagerInstance();

        // then
        assertNotEquals(foundMenu,newMenu);
        assertTrue(entityManager.contains(foundMenu));
        assertFalse(entityManager.contains(newMenu));

    }

    @DisplayName("다른 엔티티 매니저가 관리하는 엔티티의 영속성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void testManagedOtherEntityManager(int menuCode){

        // when
        Menu menu1 = lifeCycle.findMenuByMenuCode(menuCode);
        Menu menu2 = lifeCycle.findMenuByMenuCode(menuCode);

        // then
        assertNotEquals(menu1,menu2);

    }

    @DisplayName("같은 엔티티 매니저가 관리하는 엔티티의 영속성 테스트")
    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void testManagedSameEntityManager(int menuCode){

        // given
        EntityManager entityManager = EntityManagerGenerator.getInstance();

        // when
        Menu menu1 = entityManager.find(Menu.class, menuCode);
        Menu menu2 = entityManager.find(Menu.class, menuCode);


        // then
        assertEquals(menu1,menu2);

    }

    @DisplayName("준영속화 detach 테스트")
    @ParameterizedTest
    @CsvSource({"11, 1000"})
    void testDetachEntity(int menuCode, int menuPrice){
        //given
        EntityManager entityManager = EntityManagerGenerator.getInstance();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        //when
        entityTransaction.begin();;
        Menu foundMenu = entityManager.find(Menu.class,menuCode);
        // detach : 특정 엔티티만 준영속 상태(영속성 컨텍스트가 관리하지 않는 상태)로 만든다.
        entityManager.detach(foundMenu);
        foundMenu.setMenuPrice(menuPrice);
        // 영속성 컨텍스트의 상태를 DB로 내보낸다. commit하지 않은 상태이므로 rollback 가능하다.
        entityManager.flush();
        //then
        assertNotEquals(menuPrice,entityManager.find(Menu.class,menuCode).getMenuPrice());
    }
}
