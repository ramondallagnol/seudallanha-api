package com.spring.SeuDallanhaApi.service.serviceImpl;

import com.spring.SeuDallanhaApi.dtos.UserDTO;
import com.spring.SeuDallanhaApi.exceptions.UserAlreadyExistException;
import com.spring.SeuDallanhaApi.models.User;
import com.spring.SeuDallanhaApi.repository.RoleRepository;
import com.spring.SeuDallanhaApi.repository.UserRepository;
import com.spring.SeuDallanhaApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User registerNewUserAccount(final UserDTO accountDto) {
        if (emailExists(accountDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email adress: " + accountDto.getEmail());
        }
        final User user = new User();

        user.setFirstName(accountDto.getFirstName());
        user.setLastName(accountDto.getLastName());
        user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        user.setEmail(accountDto.getEmail());
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
        return userRepository.save(user);
    }

    @Override
    public User getUser(String verificationToken) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    private boolean emailExists(final String email) {
        return userRepository.findByEmail(email) != null;
    }

}
