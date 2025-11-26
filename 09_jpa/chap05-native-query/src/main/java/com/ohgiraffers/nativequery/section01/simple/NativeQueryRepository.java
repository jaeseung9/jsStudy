package com.ohgiraffers.nativequery.section01.simple;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class NativeQueryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Menu nativeQueryByResultType(int menuCode) {
        String query = "SELECT menu_code, menu_name, menu_price, category_code, orderable_status "
                + "FROM tbl_menu WHERE menu_code = ?";
        Query nativeQuery = entityManager.createNativeQuery(query, Menu.class)
                .setParameter(1, menuCode);

        return (Menu)nativeQuery.getSingleResult();
    }
}
