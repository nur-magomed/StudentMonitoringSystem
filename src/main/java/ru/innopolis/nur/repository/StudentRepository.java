package ru.innopolis.nur.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ru.innopolis.nur.model.Student;

/**
 * Created by nur on 11.11.16.
 */
@Service
public interface StudentRepository extends CrudRepository<Student, Long> {}
