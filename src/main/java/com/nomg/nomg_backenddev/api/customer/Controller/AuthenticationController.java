package com.nomg.nomg_backenddev.api.customer.Controller;

import com.nomg.nomg_backenddev.api.customer.dto.UserAddRequest;
import com.nomg.nomg_backenddev.common.LoginCredentials;
import com.nomg.nomg_backenddev.api.customer.dto.UserCustomer;
import com.nomg.nomg_backenddev.api.customer.services.AuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String register(@RequestBody UserAddRequest user) {
        return authenticationServices.register(user);
    }


    @PostMapping("changePassword/")
    public String newPassword(String newPassword,String oldPassword, String apiKey)
    {
        return authenticationServices.newPassword(newPassword,oldPassword, apiKey);
    }

}
