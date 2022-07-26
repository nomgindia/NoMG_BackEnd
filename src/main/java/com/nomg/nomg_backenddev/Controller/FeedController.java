package com.nomg.nomg_backenddev.Controller;

import com.nomg.nomg_backenddev.Model.FeedModel;
import com.nomg.nomg_backenddev.Services.FeedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nomgindia/api/v1/feed/")
public class FeedController {

    @Autowired
    FeedServices feedServices;


    @GetMapping("healthcare/")
    public List<FeedModel> getArticles()
    {
        return feedServices.getArticles();
    }



}
