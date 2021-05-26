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

import com.cjc.app.fl.master.main.model.DealerDetails;
//import com.cjc.app.fl.master.main.model.PoliceStationType;
import com.cjc.app.fl.master.main.serviceI.HomeService;

@RestController
public class DealerDetailsController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/savedd")
	public String savedata(@RequestBody DealerDetails dd)
	{
		hs.adddata(dd);
		return "Data added";
	}
	
	@GetMapping("/getalldd")
	public List<DealerDetails> getAllData()
	{
		List<DealerDetails> dd1=hs.getall();
		return dd1;
	}
	
	@PutMapping("/updatedd")
	public List<DealerDetails> editData(@RequestBody DealerDetails dd)
	{
		List<DealerDetails> dlist=hs.editdata(dd);
		return dlist;
	}
	
	@DeleteMapping("/deletedd/{dealer_id}")
	public List<DealerDetails> delData(@PathVariable("dealer_id")int dealer_id)
	{
		List<DealerDetails> dlist=hs.deletedatad(dealer_id);
		return dlist;
	}
	
	
}
