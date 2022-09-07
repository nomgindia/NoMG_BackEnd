package com.nomg.nomg_backenddev.api.author.dto;


import com.nomg.nomg_backenddev.api.feed.dto.FeedModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Author extends AbstractPersistable<Long> {
    String name;
    int gender;
    boolean isActive = true;
    String email;
    String password;
    String apiKey;
    @OneToMany
    List<FeedModel> feedModel;
}
