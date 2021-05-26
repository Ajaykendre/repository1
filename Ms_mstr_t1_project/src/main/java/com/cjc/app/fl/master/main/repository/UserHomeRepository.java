package com.cjc.app.fl.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.User;

@Repository
public interface UserHomeRepository extends CrudRepository<User, Integer>{

}
