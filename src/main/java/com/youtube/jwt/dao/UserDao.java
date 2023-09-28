package com.youtube.jwt.dao;

import com.youtube.jwt.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
