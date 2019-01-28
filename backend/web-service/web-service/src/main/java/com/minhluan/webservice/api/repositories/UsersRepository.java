package com.minhluan.webservice.api.repositories;

import com.minhluan.webservice.api.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersRepository extends MongoRepository<User, String> {

    public User findByUsername(String username);

    public List<User> findAll();

}
