package com.nomg.nomg_backenddev.Services;

import com.nomg.nomg_backenddev.Model.LoginCredentials;
import com.nomg.nomg_backenddev.Model.UserCustomer;
import com.nomg.nomg_backenddev.Repository.AuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AuthenticationServices {

    @Autowired
    private AuthenticationRepo authRepo;

    public String loginUser(LoginCredentials login) {

        UserCustomer user = authRepo.findUserByEmailAddress(login.getEmail())
                .orElseThrow(() -> new IllegalStateException("User Not Found!"));


        if (login.getPassword().equals(user.getPassword())) {
            return user.getApiKey();
        } else {
            return "Wrong Password";
        }
    }


    public String register(UserCustomer user) {
        Optional<UserCustomer> userOptional = authRepo.findUserByEmailAddress(user.getEmailAddress());

        if (userOptional.isPresent()) {
            return "Email Address already in use";

        } else if (user.getEmailAddress() == null || user.getName() == null || user.getPassword() == null) {
            return "Bad Body Found";
        } else {

            String key = UUID.randomUUID().toString();
            UserCustomer userObj = new UserCustomer();
            userObj.setApiKey(key);
            userObj.setEmailAddress(user.getEmailAddress());
            userObj.setName(user.getName());
            userObj.setPassword(user.getPassword());
            authRepo.save(userObj);
            return "Registered";
        }

    }

    public String newPassword(String newPassword, String oldPassword, String apiKey) {

        UserCustomer user = authRepo.findUserByApiKey(apiKey)
                .orElseThrow(() -> new IllegalStateException("User Not Found!"));
        if (user.getPassword() == oldPassword) {
            user.setPassword(newPassword);
            return apiKey;
        } else {
            return "incorrect password";
        }


    }



}
