package com.example.newdemomicroswervicesarchtectureuserservices.persistence.repository;

import com.example.newdemomicroswervicesarchtectureuserservices.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<UserEntity, Long> {


    Optional<UserEntity> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    boolean existsByFullName (String fullName);
}
