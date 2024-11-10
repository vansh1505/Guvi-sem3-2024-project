package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {

    private static final String URL ="jdbc:mysql://localhost:3306/user_management";
    private static final String USER="root";

    private static final String PASSWORD = "vishu@2005";

    public static void main(String[] args){
        Connection connection =null;

        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management?user=root&password=vishu@2005");
                    System.out.println("Connection Established between Java and DB successfully");

        }catch(SQLException e){
            System.out.println("Erroe while connecting to database" + e.getMessage());


        }
    }

}
