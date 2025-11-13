package com.ohgiraffers.Controller;

import com.ohgiraffers.model.MenuDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class InsertController {

    public int insertMenu(MenuDTO dto) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;

        int result = 0;

        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("src/main/java/com/ohgiraffers/config/connection-info.properties"));

            String query = prop.getProperty("insertMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, dto.getMenuName());
            pstmt.setInt(2, dto.getMenuPrice());
            pstmt.setInt(3, dto.getCategoryCode());
            pstmt.setString(4, dto.getOrderableStatus());

            result = pstmt.executeUpdate();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }

        return result;
    }



}
