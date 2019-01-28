package com.minhluan.webservice.api.services;

import com.minhluan.webservice.api.models.User;
import com.minhluan.webservice.api.repositories.UsersRepository;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersRepository repository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserByUsername(String username) {
        return repository.findByUsername(username);
    }
}
