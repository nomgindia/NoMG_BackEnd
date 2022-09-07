package com.nomg.nomg_backenddev.api.author.services;

import com.nomg.nomg_backenddev.api.author.dto.Author;
import com.nomg.nomg_backenddev.api.author.dto.AuthorRequest;
import com.nomg.nomg_backenddev.common.LoginCredentials;
import com.nomg.nomg_backenddev.api.author.dao.AuthorAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AuthorAuthenticationServices {


    @Autowired
    AuthorAuthRepo authorAuthRepo;
    public List<Author> getAllAuthor() {
        return authorAuthRepo.findAll();
    }

    public String register(AuthorRequest author) {

        if (authorAuthRepo.countAuthorByEmail(author.getEmail())>0) {
            return "Email Address already in use";

        } else if (author.getEmail() == null || author.getName() == null || author.getPassword() == null) {
            return "Bad Body Found";
        } else {

            String key = UUID.randomUUID().toString();
            Author userObj = new Author();
            userObj.setEmail(author.getEmail());
            userObj.setName(author.getName());
            userObj.setPassword(author.getPassword());
            userObj.setGender(author.getGender());
            userObj.setApiKey(key);
            authorAuthRepo.save(userObj);
            return "Registered";
        }

    }

    public String login(LoginCredentials login) {
        if(authorAuthRepo.countAuthorByEmail(login.getEmail())<0){
            return "Invalid Email";
        }
        if(authorAuthRepo.findAuthorByEmail(login.getEmail()).getPassword().equals(login.getPassword())){
            return authorAuthRepo.findAuthorByEmail(login.getEmail()).getApiKey();
        }
        else{
            return "wrong credential";
        }


    }
}
