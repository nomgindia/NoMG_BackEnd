package com.nomg.nomg_backenddev.api.author.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class AuthorRequest {
    String name;
    int gender;
    boolean isActive = true;
    String email;
    String password;
}
