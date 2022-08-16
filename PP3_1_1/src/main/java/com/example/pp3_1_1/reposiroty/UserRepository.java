package com.example.pp3_1_1.reposiroty;

import com.example.pp3_1_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
