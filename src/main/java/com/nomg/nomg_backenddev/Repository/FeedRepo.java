package com.nomg.nomg_backenddev.Repository;

import com.nomg.nomg_backenddev.Model.FeedModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedRepo extends MongoRepository<FeedModel, ObjectId> {



}
