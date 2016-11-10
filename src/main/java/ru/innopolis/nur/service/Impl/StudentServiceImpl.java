package ru.innopolis.nur.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.nur.dao.StudentDao;
import ru.innopolis.nur.model.Student;
import ru.innopolis.nur.service.StudentService;

import java.util.List;

/**
 * Created by nur on 10.11.16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.findAll();
    }
}
