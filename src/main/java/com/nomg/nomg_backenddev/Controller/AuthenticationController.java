package com.nomg.nomg_backenddev.Controller;

import com.nomg.nomg_backenddev.Model.LoginCredentials;
import com.nomg.nomg_backenddev.Model.UserCustomer;
import com.nomg.nomg_backenddev.Services.AuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("nomgindia/api/v1/auth/")
public class AuthenticationController {


    @Autowired
    private AuthenticationServices authenticationServices;


    @PostMapping("login/")
    public String loginUser(@RequestBody LoginCredentials login) {
        return authenticationServices.loginUser(login);
    }


    @PostMapping("register/")
    public String register(@RequestBody UserCustomer user) {
        return authenticationServices.register(user);
    }


    @PostMapping("changePassword/")
    public String newPassword(String newPassword,String oldPassword, String apiKey)
    {
        return authenticationServices.newPassword(newPassword,oldPassword, apiKey);
    }

}
