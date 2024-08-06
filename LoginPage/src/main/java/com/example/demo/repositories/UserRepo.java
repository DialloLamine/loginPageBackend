/**
 * 
 */
package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

/**
 * 
 */
@Repository
public interface UserRepo extends JpaRepository<User, String>{

	User findByUserId(String userId);

}
