package com.nomg.nomg_backenddev.api.feed.dto;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FeedRequest {

    Long authorId;
    String headLine;
    String body;
    String imageUrl;
    String timeOfPublish;

}
