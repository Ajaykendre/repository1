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

import com.cjc.app.fl.master.main.model.States;

import com.cjc.app.fl.master.main.serviceI.HomeService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@CrossOrigin("*")
@RestController

public class StatesController {

	@Autowired
	HomeService hs;
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	@PostMapping("/savestates")
	public String savedata(@RequestBody  States s)
	{
		System.out.println(s);
		hs.save(s);
		return "Data Saved";
	}
	
	@GetMapping("/getstates")
	public List<States> getdata()
	{
		List<States> list=hs.getrecord();
		return list;
	}
	
	@PutMapping("/updatestates")
	public List<States> updatestate(@RequestBody States s)
	{
		List<States> list=hs.updatedata(s);
		return list;
	}
	
	@DeleteMapping("/deletestates/{state_id}")
	public Iterable<States> deletedata(@PathVariable("state_id")int sid)
	{
		Iterable<States> list=hs.deleterecord(sid);
		return list;
	}
}
