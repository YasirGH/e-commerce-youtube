package com.youtube.ecommerce.dao;

import com.youtube.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
