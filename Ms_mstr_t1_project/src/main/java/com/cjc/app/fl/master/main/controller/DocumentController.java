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

import com.cjc.app.fl.master.main.model.Document;

import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class DocumentController {
	
	@Autowired
	HomeService hs;
	@PostMapping("/saveDoc")
	public String saveDoc(@RequestBody Document d)
	{
		hs.saveDoc(d);
		return "save successful";
	}
	@GetMapping("/getDoc")
	public List<Document>getDocList()
	{
		List<Document> dlist=hs.getDocList();
		return dlist;
	}
	@PutMapping("/updateDoc")
	public List<Document>updateDoc(@RequestBody  Document d )
	{
		List<Document> dlist=hs.updateDoc(d);
		return dlist;
	}
	@DeleteMapping("/deleteDoc/{did}")
	public List<Document>deleteDoc(@PathVariable("did")int did)
	{
		List<Document>dlist=hs.deleteDoc(did);
		return dlist;
	}
	
	
	

	
	

}
