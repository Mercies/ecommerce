package com.emsi.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.ecommerce.entity.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long> {

}
