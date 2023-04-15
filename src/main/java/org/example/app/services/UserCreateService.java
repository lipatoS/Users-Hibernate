package org.example.app.services;

import org.example.app.entities.User;
import org.example.app.exceptions.CreateException;
import org.example.app.repositories.UserCreateRepository;
import org.example.app.utils.Constants;
import org.example.app.utils.EmailValidator;

import java.util.HashMap;
import java.util.Map;

public class UserCreateService {
    UserCreateRepository repository;

    public UserCreateService(UserCreateRepository repository) {
        this.repository = repository;
    }

    public String createUser(User user) {

        Map<String, String> errors = validateData(user);

        if (errors.size() > 0) {
            try {
                throw new CreateException("Check inputs", errors);
            } catch (CreateException ce) {
                return ce.getErrors(errors);
            }
        }

        return repository.createUser(user);
    }

    private Map<String, String> validateData(User user) {
        Map<String, String> errors = new HashMap<>();

        if (user.getLogin().isEmpty())
            errors.put("login", Constants.INPUT_REQ_MSG);

        if (user.getPass().isEmpty())
            errors.put("password", Constants.INPUT_REQ_MSG);

        if (EmailValidator.isEmailValid(user.getEmail()))
            errors.put("email", Constants.WRONG_EMAIL_MSG);

        return errors;
    }
}
