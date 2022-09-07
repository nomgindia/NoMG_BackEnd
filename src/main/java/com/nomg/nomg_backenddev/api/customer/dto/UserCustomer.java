package com.nomg.nomg_backenddev.api.customer.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;


import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class UserCustomer extends AbstractPersistable<Long> {


    String apiKey;
    String name;
    String password;
    String emailAddress;

    public UserCustomer() {
    }

    public UserCustomer(String apiKey, String name, String password, String emailAddress) {
        this.apiKey = apiKey;
        this.name = name;
        this.password = password;
        this.emailAddress = emailAddress;
    }


}