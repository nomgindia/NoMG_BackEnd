package com.nomg.nomg_backenddev.Controller;


import com.nomg.nomg_backenddev.Model.Author;
import com.nomg.nomg_backenddev.Model.LoginCredentials;
import com.nomg.nomg_backenddev.Repository.AuthorAuthRepo;
import com.nomg.nomg_backenddev.Services.AuthorAuthenticationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("nomgindia/api/v1/author/auth/")
public class AuthorAuthController {

    @Autowired
    AuthorAuthenticationServices authorAuthenticationServices;


    @GetMapping
    public List<Author> getAllAuthor(){
        return authorAuthenticationServices.getAllAuthor();
    }

    @PostMapping("register/")
    public String register(@RequestBody Author author) {
        return authorAuthenticationServices.register(author);
    }

    @PostMapping("login/")
    public String login(@RequestBody LoginCredentials login){
        return authorAuthenticationServices.login(login);
    }


}
