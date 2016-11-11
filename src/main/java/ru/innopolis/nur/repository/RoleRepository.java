package ru.innopolis.nur.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.innopolis.nur.model.Role;

/**
 * Created by nur on 11.11.16.
 */
@Service
public interface RoleRepository extends CrudRepository<Role, Long> {
}
