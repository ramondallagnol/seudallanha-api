package com.spring.SeuDallanhaApi.services;

import com.spring.SeuDallanhaApi.dtos.UserDTO;
import com.spring.SeuDallanhaApi.exceptions.UserAlreadyExistException;
import com.spring.SeuDallanhaApi.models.User;
import org.springframework.stereotype.Service;

public interface IUserService {
    User registerNewUserAccount(UserDTO accountDto) throws UserAlreadyExistException;
    User getUser(String verificationToken);
    void deleteUser(User user);

}
