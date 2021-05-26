package com.cjc.app.fl.master.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.Districts;

@Repository
public interface DistrictsHomeRepository extends CrudRepository<Districts, Integer>{
	
//	 List<Districts> save(Districts d);

}
