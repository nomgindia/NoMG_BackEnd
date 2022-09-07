package com.nomg.nomg_backenddev.api.author.dao;

import com.nomg.nomg_backenddev.api.author.dto.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorAuthRepo extends JpaRepository<Author,Long> {
    Author findAuthorByEmail(String email);
    long countAuthorByEmail(String email);
}
