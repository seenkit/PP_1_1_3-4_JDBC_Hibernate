package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "12031992");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
