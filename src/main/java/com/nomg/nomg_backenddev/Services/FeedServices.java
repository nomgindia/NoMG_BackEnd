package com.nomg.nomg_backenddev.Services;

import com.nomg.nomg_backenddev.Model.FeedModel;
import com.nomg.nomg_backenddev.Repository.FeedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServices {

    @Autowired
    FeedRepo feedRepo;

    public List<FeedModel> getArticles() {

        return feedRepo.findAll();

    }
}
