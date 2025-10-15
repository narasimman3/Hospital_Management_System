package com.hms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
