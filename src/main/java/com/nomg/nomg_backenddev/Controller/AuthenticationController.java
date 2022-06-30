package com.nomg.nomg_backenddev.Controller;

import com.nomg.nomg_backenddev.Services.AuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("nomgindia/api/v1/")
public class AuthenticationController {


    @Autowired
    private AuthenticationServices authenticationServices;


    @PostMapping("login/")
    public String loginUser(@RequestParam Map<String, String> login) {
        return authenticationServices.loginUser(login);
    }


    @PostMapping("register/")
    public String register(@RequestParam Map<String, String> user) {
        return authenticationServices.register(user);
    }

}
