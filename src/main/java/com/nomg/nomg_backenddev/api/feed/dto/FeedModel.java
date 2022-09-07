package com.nomg.nomg_backenddev.api.feed.dto;


import com.nomg.nomg_backenddev.api.author.dto.Author;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class FeedModel extends AbstractPersistable<Long> {

    String headLine;
    String body;
    String imageUrl;
    String timeOfPublish;
    @OneToOne
    Author author;
}
