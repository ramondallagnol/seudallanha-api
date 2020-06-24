package com.spring.SeuDallanhaApi.dtos;

import com.spring.SeuDallanhaApi.validations.password.ValidPassword;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTO {
    @NotEmpty
    @Size(min = 3)
    private String firstName;
    @NotEmpty
    @Size(min = 3)
    private String lastName;

    @ValidPassword
    @NotEmpty
    private String password;

    @NotEmpty
    @Email
    @Size(min = 3)
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
