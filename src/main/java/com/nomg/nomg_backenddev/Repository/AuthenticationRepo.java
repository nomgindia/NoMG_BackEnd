package com.nomg.nomg_backenddev.Repository;


import com.nomg.nomg_backenddev.Model.UserCustomer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticationRepo extends MongoRepository<UserCustomer, ObjectId> {
    Optional<UserCustomer> findUserByEmailAddress(String emailAddress);

    Optional<UserCustomer> findUserByApiKey(String apiKey);
}
