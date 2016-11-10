package ru.innopolis.nur.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.nur.model.Student;

/**
 * Created by nur on 10.11.16.
 */
public interface StudentDao extends JpaRepository<Student, Long> {
}
