package io.javabrains.springsecurityjpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjpa.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
