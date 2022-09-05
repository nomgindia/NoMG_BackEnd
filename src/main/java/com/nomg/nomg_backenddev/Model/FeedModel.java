package com.nomg.nomg_backenddev.Model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class FeedModel extends AbstractPersistable<Long> {

    String headLine;
    String body;
    String imageUrl;
    String timeOfPublish;
    String authorName;

    public FeedModel(String headLine, String body, String imageUrl, String timeOfPublish, String authorName) {
        this.headLine = headLine;
        this.body = body;
        this.imageUrl = imageUrl;
        this.timeOfPublish = timeOfPublish;
        this.authorName = authorName;

    }

    public FeedModel() {
    }
}
