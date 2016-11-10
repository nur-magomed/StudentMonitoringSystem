package ru.innopolis.nur.service;

import ru.innopolis.nur.model.User;

/**
 * Created by nur on 09.11.16.
 */
public interface UserService {

    void save(User user);
    User findByUserName(String username);
}
