package com.nomg.nomg_backenddev.Repository;

import com.nomg.nomg_backenddev.Model.FeedModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedRepo extends JpaRepository<FeedModel, Long> {

    FeedModel findAllByAuthorId(Long authorId);


}
