package com.nomg.nomg_backenddev.api.author.controller;


import com.nomg.nomg_backenddev.api.author.dto.Author;
import com.nomg.nomg_backenddev.api.author.dto.AuthorRequest;
import com.nomg.nomg_backenddev.common.LoginCredentials;
import com.nomg.nomg_backenddev.api.author.services.AuthorAuthenticationServices;
import org.apache.catalina.realm.AuthenticatedUserRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String register(@RequestBody AuthorRequest author) {
        return authorAuthenticationServices.register(author);
    }

    @PostMapping("login/")
    public String login(@RequestBody LoginCredentials login){
        return authorAuthenticationServices.login(login);
    }


}
