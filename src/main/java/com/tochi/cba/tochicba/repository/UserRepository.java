package com.tochi.cba.tochicba.repository;

import com.tochi.cba.tochicba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

    Boolean existsByAccountNumber(String accountNumber);
    User findByAccountNumber(String accountNumber);
}
