package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.model.BranchDetails;

@Repository
public interface BranchDetailsRepository extends JpaRepository<BranchDetails, Integer>{

}
