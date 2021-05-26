package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.PoliceStationType;

@Repository
public interface PoliceStationTypeRepository extends JpaRepository<PoliceStationType, Integer>
{
	
}
