package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public  class UserDaoImpl implements  UserDao {


    private static final String URL = "jdbc:mysql://localhost:3306/user_management";
    private static final String USER = "root";

    private static final String PASSWORD = "vishu@2005";


    @Override
    public void addUser(User user) {
        String query = "Insert into user_table values(username, name, email_id, phone, password) Values(?,?,?,?,?)";

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail_id());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.executeUpdate();

        } catch (SQLException exception) {

            System.out.println("Error while adding user " + exception.getMessage());

        }
    }
}