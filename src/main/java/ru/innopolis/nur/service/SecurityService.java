package ru.innopolis.nur.service;

/**
 * Created by nur on 09.11.16.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
