package com.skyware.estore.services;

import com.skyware.estore.models.Role;
import com.skyware.estore.models.User;
import com.skyware.estore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService
{
//    @Autowired
    private IUserRepository userRepository;

//    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserService(IUserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User SaveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setUserRole(Role.USER);
        user.setCreatedTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> FindUserByUsername(String username) {
//        return Optional.empty();
        return userRepository.findByUsername(username);
    }


//    @Override
//    public Optional<User> FindUserByUsername(String username)
//    {
//        return userRepository.findByUsername(username);
//    }

    @Override
    @Transactional
    public void MakeAdmin(String username)
    {
        userRepository.updateUserRole(username, Role.ADMIN);
    }


}
