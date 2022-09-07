package com.nomg.nomg_backenddev.api.feed.dto;


import com.nomg.nomg_backenddev.api.author.dto.Author;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Getter
@Setter
public class FeedRequest {

    Long authorId;
    String headLine;
    String body;
    String imageUrl;
    String timeOfPublish;

}
