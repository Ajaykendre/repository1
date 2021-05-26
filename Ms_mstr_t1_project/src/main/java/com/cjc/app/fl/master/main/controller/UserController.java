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

import com.cjc.app.fl.master.main.model.User;
import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class UserController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/saveuser")
	public String savedata(@RequestBody User u)
	{
		hs.save(u);
		return "Data Saved";
	}
	
	@GetMapping("/getuser")
	public List<User> getdata()
	{
		List<User> list=hs.getdata();
		return list;
	}
	
	@PutMapping("/updateuser")
	public List<User> updateuser(@RequestBody User u)
	{
		List<User> list=hs.updatedata(u);
		return list;
	}
	
	@DeleteMapping("/deleteuser/{u_id}")
	public Iterable<User> deletedata(@PathVariable("u_id")int uid)
	{
		Iterable<User> list=hs.deletedata(uid);
		return list;
	}
}
