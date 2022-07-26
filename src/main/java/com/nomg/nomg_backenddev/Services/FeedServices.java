package com.nomg.nomg_backenddev.Services;

import com.nomg.nomg_backenddev.Model.FeedModel;
import com.nomg.nomg_backenddev.Repository.FeedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class FeedServices {

    @Autowired
    FeedRepo feedRepo;

    public List<FeedModel> getArticles() {

        return feedRepo.findAll();

    }

    public String uploadArticles(Map<String, String> feedModel) {
        FeedModel feedModel1 = new FeedModel();
        feedModel1.setHeadLine(feedModel.get("headLine"));
        feedModel1.setBody(feedModel.get("body"));
        feedModel1.setAuthorName(feedModel.get("authorName"));
        feedModel1.setImageUrl(feedModel.get("imageUrl"));
        Date date = new Date();
        feedModel1.setTimeOfPublish(String.valueOf(date.getTime()));
        feedRepo.save(feedModel1);
        return "posted";
    }
}
