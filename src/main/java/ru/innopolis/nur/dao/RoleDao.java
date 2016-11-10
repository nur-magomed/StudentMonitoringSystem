package ru.innopolis.nur.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.nur.model.Role;

/**
 * Created by nur on 09.11.16.
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
