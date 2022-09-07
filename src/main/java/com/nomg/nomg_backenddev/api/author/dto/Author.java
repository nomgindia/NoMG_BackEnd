package com.nomg.nomg_backenddev.api.author.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Author extends AbstractPersistable<Long> {
    String name;
    String timeOfPost;
    String source;
    boolean isActive = true;
    String email;
    String password;
    String apiKey;
}
