package com.cjc.app.fl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.master.main.model.BranchDetails;

import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class BranchDetailsController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/savebd")
	public String adddata(@RequestBody BranchDetails bd)
	{
		hs.savebranch(bd);
		return "Data added Successfully"; 
	}
	
	@GetMapping("/getallbd")
	public List<BranchDetails> getalldata()
	{
		List<BranchDetails> bd=hs.getallbranch();
		return bd;
	}
	
	@PutMapping("/updatebd")
	public List<BranchDetails> updatedata(@RequestBody BranchDetails bd)
	{
		List<BranchDetails> blist=hs.updatebranch(bd);
		return blist;
	}
	
	@DeleteMapping("/deletebd/{branch_id}")
	public List<BranchDetails> deldata(@PathVariable("branch_id")int branch_id)
	{
		List<BranchDetails> blist=hs.delbranch(branch_id);
		return blist;
		
	}

}
