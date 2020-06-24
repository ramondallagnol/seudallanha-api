package com.spring.SeuDallanhaApi.controller;

import com.spring.SeuDallanhaApi.dtos.UserDTO;
import com.spring.SeuDallanhaApi.models.User;
import com.spring.SeuDallanhaApi.services.IUserService;
import com.spring.SeuDallanhaApi.utils.GenericResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @PostMapping("/user/registration")
    @ResponseBody
    public GenericResponse registerUserAccount(@Valid final UserDTO accountDto, final HttpServletRequest request) {
        LOGGER.debug("Registering user account with information: {}", accountDto);

        final User registered = userService.registerNewUserAccount(accountDto);
        return new GenericResponse("success");
    }

}
