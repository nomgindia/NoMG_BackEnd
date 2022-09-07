package com.nomg.nomg_backenddev.api.feed.dao;

import com.nomg.nomg_backenddev.api.feed.dto.FeedModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedRepo extends JpaRepository<FeedModel, Long> {

    FeedModel findAllByAuthorId(Long authorId);


}
