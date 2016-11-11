package ru.innopolis.nur.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.innopolis.nur.model.User;

/**
 * Created by nur on 11.11.16.
 */

@Service
public interface UserRepository extends CrudRepository<User, Long> {


    User findByUsername(String username);
}
