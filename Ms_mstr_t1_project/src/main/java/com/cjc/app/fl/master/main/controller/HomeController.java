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

import com.cjc.app.fl.master.main.model.Status;
import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	@PostMapping("/saveStatus")
	public String saveStatus(@RequestBody Status s)
	{
		
		//System.out.println(s.getState());
		hs.saveStatus(s);
		
		return "save successful";
	}
	@GetMapping("/getStatus")
	public List<Status>getStatusList()
	{
		List<Status> slist=hs.getStatusList();
		return slist;
	}
	@PutMapping("/updateStatus")
	public List<Status>updateStatus(@RequestBody Status s)
	{
		List<Status>slist=hs.updateStatus(s);
		return slist;
	}
	@DeleteMapping("/deleteStatus/{sid}")
	public List<Status>deleteStatus(@PathVariable("sid")int sid)
	{
		List<Status>slist=hs.deleteStatus(sid);
		return slist;
	}
	

}
