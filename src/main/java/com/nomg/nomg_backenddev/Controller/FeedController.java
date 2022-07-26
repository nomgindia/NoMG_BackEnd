package com.nomg.nomg_backenddev.Controller;

import com.nomg.nomg_backenddev.Model.FeedModel;
import com.nomg.nomg_backenddev.Services.FeedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("nomgindia/api/v1/feed/")
public class FeedController {

    @Autowired
    FeedServices feedServices;


    @GetMapping("healthcare/")
    public List<FeedModel> getArticles() {
        return feedServices.getArticles();
    }
    @PostMapping("healthcare/")
    public String uploadArticles(@RequestParam  Map<String, String> feedModel){
        return feedServices.uploadArticles(feedModel);
    }


}
