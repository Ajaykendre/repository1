package com.cjc.app.fl.master.main.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.States;

@Repository
public interface StateHomeRepository extends CrudRepository<States, Integer>{

	void save(List<States> s);

	

}
