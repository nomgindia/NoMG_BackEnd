package com.nomg.nomg_backenddev.api.customer.dao;


import com.nomg.nomg_backenddev.api.customer.dto.UserCustomer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticationRepo extends JpaRepository<UserCustomer, Long> {
    Optional<UserCustomer> findUserByEmailAddress(String emailAddress);
    Optional<UserCustomer> findUserByApiKey(String apiKey);
}
