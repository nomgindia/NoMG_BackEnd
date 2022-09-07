package com.nomg.nomg_backenddev.api.feed.dao;

import com.nomg.nomg_backenddev.api.author.dto.Author;
import com.nomg.nomg_backenddev.api.feed.dto.FeedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FeedRepo extends JpaRepository<FeedModel, Long> {

//    FeedModel findAllByAuthorId(Long authorId);
//    FeedModel findO
//    List<FeedModel>  findAllByAuthor(Author author);

    FeedModel findOneById(Long articleId);




}
