package org.example.app.views;

import org.example.app.entities.User;

import java.util.Scanner;

public class UserCreateView {
    public User getData() {

        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String title = "Enter login: ";
        System.out.print(title);
        user.setLogin(scanner.nextLine().trim());

        title = "Enter password: ";
        System.out.print(title);
        user.setPass(scanner.nextLine().trim());

        title = "Enter email in format example@mail.com: ";
        System.out.print(title);
        user.setEmail(scanner.nextLine().trim());

        return user;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
