package com.cjc.app.fl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.fl.master.main.model.PoliceStationType;
import com.cjc.app.fl.master.main.serviceI.HomeService;
@CrossOrigin("*")
@RestController
public class PsTypeController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/saveps")
	public String saveData(@RequestBody PoliceStationType ps)
	{
		hs.addData(ps);
		return "Data added Successfully"; 
	}
	
	@GetMapping("/getallps")
	public List<PoliceStationType> getAllData()
	{
		List<PoliceStationType> pss=hs.getAll();
		return pss;
	}
	
	@PutMapping("/updateps")
	public List<PoliceStationType> editData(@RequestBody PoliceStationType ps)
	{
		List<PoliceStationType> plist=hs.editData(ps);
		return plist;
	}
	
	@DeleteMapping("/deleteps/{ps_id}")
	public List<PoliceStationType> deleteData(@PathVariable("ps_id")int ps_id)
	{
		List<PoliceStationType> plist=hs.deleteData(ps_id);
		return plist;
		
	}
	
}
