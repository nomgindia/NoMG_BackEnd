package com.nomg.nomg_backenddev.api.feed.services;

import com.nomg.nomg_backenddev.api.feed.dto.FeedModel;
import com.nomg.nomg_backenddev.api.feed.dao.FeedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FeedServices {

    @Autowired
    FeedRepo feedRepo;

    public List<FeedModel> getArticles() {

        return feedRepo.findAll();

    }

    public String uploadArticles(FeedModel feedModel) {
        FeedModel feedModel1 = new FeedModel();
        feedModel1.setHeadLine(feedModel.getHeadLine());
        feedModel1.setBody(feedModel.getBody());
        feedModel1.setImageUrl(feedModel.getImageUrl());
        Date date = new Date();
        feedModel1.setTimeOfPublish(String.valueOf(date.getTime()));
        feedRepo.save(feedModel1);
        return "posted";
    }

//    public String deleteArticle(Long articleId, Long authorId) {
//        FeedModel feedModel = feedRepo.findAllByAuthorId(authorId);
//    }
}
