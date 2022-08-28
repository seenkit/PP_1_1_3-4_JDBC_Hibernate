package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "K60380833e479E");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
