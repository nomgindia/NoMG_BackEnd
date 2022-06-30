package com.nomg.nomg_backenddev.Services;

import com.nomg.nomg_backenddev.Model.UserCustomer;
import com.nomg.nomg_backenddev.Repository.AuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthenticationServices {

    @Autowired
    private AuthenticationRepo authRepo;

    public String loginUser(Map<String, String> login) {

        UserCustomer user = authRepo.findUserByEmailAddress(login.get("emailAddress"))
                .orElseThrow(() -> new IllegalStateException("User Not Found!"));


        if (login.get("password").equals(user.getPassword()))
        {
            return user.getApiKey();
        }
        else
        {
            return "Wrong Password";
        }
    }


    public String register(Map<String, String> user) {
        Optional<UserCustomer> userOptional = authRepo.findUserByEmailAddress(user.get("emailAddress"));

        if(userOptional.isPresent())
        {
            return "Email Address already in use";

        }

        else if(user.get("emailAddress")==null || user.get("name")==null|| user.get("password")==null)
        {
            return "Bad Body Found";
        }
        else
        {

            String key = UUID.randomUUID().toString();
            UserCustomer userObj = new UserCustomer();
            userObj.setApiKey(key);
            userObj.setEmailAddress(user.get("emailAddress"));
            userObj.setName(user.get("name"));
            userObj.setPassword(user.get("password"));
            authRepo.save(userObj);
            return "Registered";
        }

    }

}
