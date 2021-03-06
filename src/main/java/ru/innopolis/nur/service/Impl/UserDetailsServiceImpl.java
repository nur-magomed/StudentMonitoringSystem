package ru.innopolis.nur.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.innopolis.nur.dao.UserDao;
import ru.innopolis.nur.model.Role;
import ru.innopolis.nur.model.User;
import ru.innopolis.nur.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nur on 09.11.16.
 */


public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUsername(username);

        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();

        for (Role role: user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
