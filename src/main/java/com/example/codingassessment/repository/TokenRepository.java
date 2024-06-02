package com.example.codingassessment.repository;

import com.example.codingassessment.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByValueAndDeletedEquals(String token, Boolean isDeleted);

     /*
          To validate token
          1. Check if token value is present
          2. Check if token is not deleted
          3. Check if token is not expired
         */

    Optional<Token> findByValueAndDeletedEqualsAndExpireAtGreaterThan(
            String token, Boolean isDeleted, Date date);
}
