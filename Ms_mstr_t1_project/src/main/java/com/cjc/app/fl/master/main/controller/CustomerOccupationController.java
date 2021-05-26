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

import com.cjc.app.fl.master.main.model.CustomerOccupation;
import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class CustomerOccupationController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/saveco")
	public String addData(@RequestBody CustomerOccupation co)
	{
		hs.saveoccup(co);
		return "Data added Successfully"; 
	}
	
	@GetMapping("/getallco")
	public List<CustomerOccupation> getallData()
	{
		List<CustomerOccupation> co=hs.getalloccup();
		return co;
	}
	
	@PutMapping("/updateco")
	public List<CustomerOccupation> updateData(@RequestBody CustomerOccupation co)
	{
		List<CustomerOccupation> clist=hs.updateoccup(co);
		return clist;
	}
	
	@DeleteMapping("/deleteco/{customer_id}")
	public List<CustomerOccupation> delData(@PathVariable("customer_id")int customer_id)
	{
		List<CustomerOccupation> clist=hs.deloccup(customer_id);
		return clist;
		
	}

}
