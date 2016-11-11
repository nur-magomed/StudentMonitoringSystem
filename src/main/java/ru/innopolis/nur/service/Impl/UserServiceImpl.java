package ru.innopolis.nur.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.innopolis.nur.dao.RoleDao;
import ru.innopolis.nur.dao.UserDao;
import ru.innopolis.nur.model.Role;
import ru.innopolis.nur.model.User;
import ru.innopolis.nur.repository.RoleRepository;
import ru.innopolis.nur.repository.UserRepository;
import ru.innopolis.nur.service.UserService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nur on 09.11.16.
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;
//    @Autowired
//    private RoleDao roleDao;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword())); //шифруем пароль
        Set<Role> roles= new HashSet<>();
        roles.add(roleRepository.findOne(1L)); //присваиваем каждому новому пользователю роль user
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
