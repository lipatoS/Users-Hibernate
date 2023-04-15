package org.example.app.services;

import org.example.app.entities.User;
import org.example.app.repositories.UserReadRepository;
import org.example.app.utils.Constants;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UserReadService {
    UserReadRepository repository;

    public UserReadService(UserReadRepository repository) {
        this.repository = repository;
    }

    public String readUsers() {

        List<User> list = repository.readUsers();


        if (list != null) {

            if (!list.isEmpty()) {
                AtomicInteger count = new AtomicInteger(0);
                StringBuilder stringBuilder = new StringBuilder();
                list.forEach((contact) ->
                        stringBuilder.append(count.incrementAndGet())
                                .append(") id: ")
                                .append(contact.getId())
                                .append(", ")
                                .append("login: ")
                                .append(contact.getLogin())
                                .append(", ")
                                .append("password: ")
                                .append(contact.getPass())
                                .append(", ")
                                .append("email: ")
                                .append(contact.getEmail())
                                .append("\n")
                );
                return "\n______ USERS ___________\n" + stringBuilder.toString();
            } else return Constants.DATA_ABSENT_MSG;
        } else return Constants.DATA_ABSENT_MSG;
    }
}

