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

import com.cjc.app.fl.master.main.model.Districts;

import com.cjc.app.fl.master.main.serviceI.HomeService;
@CrossOrigin("*")
@RestController
public class DistrictsController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/savedistrict")
	public List<Districts> savedata(@RequestBody Districts d)
	{
		List<Districts> d1=hs.save(d);
		return d1;
		//return "Data Saved";
	}
	
	@GetMapping("/getdistrict")
	public List<Districts> getdata()
	{
		List<Districts> list=hs.getdist();
		return list;
	}
	
	@PutMapping("/updatedistrict")
	public List<Districts> updatestate(@RequestBody Districts d)
	{
		List<Districts> list=hs.updatedata(d);
		return list;
	}
	
	@DeleteMapping("/deletedistrict/{district_id}")
	public Iterable<Districts> deletedata(@PathVariable("district_id")int did)
	{
		Iterable<Districts> list=hs.deletedist(did);
		return list;
	}
}
