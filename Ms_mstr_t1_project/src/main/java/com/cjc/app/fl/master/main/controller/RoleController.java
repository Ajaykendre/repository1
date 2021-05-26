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

import com.cjc.app.fl.master.main.model.Role;

import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class RoleController {
	
	@Autowired
	HomeService hs;
	@PostMapping("/saveRole")
	public String saveRole(@RequestBody Role r)
	{
		hs.saveRole(r);
		return "save successful";
	}
	@GetMapping("/getRole")
	public List<Role>getRoleList()
	{
		List<Role> rlist=hs.getRoleList();
		return rlist;
	}
	@PutMapping("/updateRole")
	public List<Role>updateRole(@RequestBody  Role r )
	{
		List<Role> rlist=hs.updateRole(r);
		return rlist;
	}
	@DeleteMapping("/deleteRole/{rid}")
	public List<Role>deleteRole(@PathVariable("rid")int rid)
	{
		List<Role>rlist=hs.deleteRole(rid);
		return rlist;
	}
	

	
	


}
