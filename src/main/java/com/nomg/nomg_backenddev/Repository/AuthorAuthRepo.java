package com.nomg.nomg_backenddev.Repository;

import com.nomg.nomg_backenddev.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorAuthRepo extends JpaRepository<Author,Long> {

    Author findAuthorByEmail(String email);

    long countAuthorByEmail(String email);
}
