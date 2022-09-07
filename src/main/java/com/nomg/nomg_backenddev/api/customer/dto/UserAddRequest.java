package com.nomg.nomg_backenddev.api.customer.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddRequest {

    String name;
    String password;
    String emailAddress;
}
