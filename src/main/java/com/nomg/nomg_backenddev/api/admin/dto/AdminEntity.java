package com.nomg.nomg_backenddev.api.admin.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class AdminEntity extends AbstractPersistable<Long> {
    String firstName;
    String lastName;
    String email;
    String password;

}
