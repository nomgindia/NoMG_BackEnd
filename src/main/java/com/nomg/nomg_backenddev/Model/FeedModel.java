package com.nomg.nomg_backenddev.Model;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Document(collection = "Feed")
@Component
public class FeedModel {

    @Id
    ObjectId _id;
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
