package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.sql.*;
import java.util.Properties;

public class Util {
    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "12031992");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static SessionFactory getSessionFactory() {
        try {
            if (sessionFactory == null) {
                Properties properties = new Properties();
                properties.setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.setProperty(Environment.URL, "jdbc:mysql://localhost:3306/new_schema");
                properties.setProperty(Environment.USER, "root");
                properties.setProperty(Environment.PASS, "12031992");
                properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                sessionFactory = new Configuration().addProperties(properties).addAnnotatedClass(User.class).buildSessionFactory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
