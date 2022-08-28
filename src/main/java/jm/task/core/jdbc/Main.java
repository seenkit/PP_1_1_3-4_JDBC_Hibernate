package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Petrov", (byte) 56);
        userService.saveUser("Nikolai", "Ivanov", (byte) 65);
        userService.saveUser("Viktor", "Konovalov", (byte) 34);
        userService.saveUser("Nikita", "Alekseenko", (byte) 30);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
