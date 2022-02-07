package com.pimplex.proxibanque.dao;

import com.pimplex.proxibanque.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
