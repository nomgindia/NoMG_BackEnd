package com.nomg.nomg_backenddev.Model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class FeedModel extends AbstractPersistable<Long> {

    String headLine;
    String body;
    String imageUrl;
    String timeOfPublish;
    @ManyToOne
    Author author;
}
