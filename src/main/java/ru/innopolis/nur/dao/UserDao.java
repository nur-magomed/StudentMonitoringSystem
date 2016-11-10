package ru.innopolis.nur.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.nur.model.User;

/**
 * Created by nur on 09.11.16.
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
