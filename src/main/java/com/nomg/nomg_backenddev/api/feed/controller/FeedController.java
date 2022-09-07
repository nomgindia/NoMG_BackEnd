package com.nomg.nomg_backenddev.api.feed.controller;

import com.nomg.nomg_backenddev.api.feed.dto.FeedModel;
import com.nomg.nomg_backenddev.api.feed.services.FeedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("nomgindia/api/v1/feed/")
public class FeedController {

    @Autowired
    FeedServices feedServices;


    @GetMapping("getHealthCareArticles/")
    public List<FeedModel> getArticles() {
        return feedServices.getArticles();
    }
    @PostMapping("postHealthCareArticles/")
    public String uploadArticles(@RequestBody FeedModel feedModel){
        return feedServices.uploadArticles(feedModel);
    }
//    @DeleteMapping("deleteHealthCareArticles/{articleId}/{authorId}")
//    public String deleteArticle(@PathVariable("articleId") Long articleId,
//                                @PathVariable("authorId")Long authorId){
//        return feedServices.deleteArticle(articleId,authorId);
//    }


}
