package com.nomg.nomg_backenddev.common;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class LoginCredentials extends AbstractPersistable<Long> {
    String email;
    String password;
}
