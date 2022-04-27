package com.spring.SeuDallanhaApi.service;

import com.spring.SeuDallanhaApi.dtos.UserDTO;
import com.spring.SeuDallanhaApi.exceptions.UserAlreadyExistException;
import com.spring.SeuDallanhaApi.models.User;

public interface UserService {
    User registerNewUserAccount(UserDTO accountDto) throws UserAlreadyExistException;
    User getUser(String verificationToken);
    void deleteUser(User user);

}
