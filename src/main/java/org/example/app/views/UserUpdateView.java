package org.example.app.views;

import org.example.app.entities.User;

import java.util.Scanner;

public class UserUpdateView {
    public User doInputs() {

        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String title = "Enter contact's ID: ";
        System.out.print(title);
        user.setId(scanner.nextInt());
        scanner.nextLine();

        title = "Enter new password: ";
        System.out.print(title);
        user.setPass(scanner.nextLine().trim());

        return user;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}