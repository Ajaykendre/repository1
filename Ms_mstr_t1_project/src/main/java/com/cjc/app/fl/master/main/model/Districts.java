package com.cjc.app.fl.master.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Districts {

	@Id
	private int districtid;
	private String districtname;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="districtid")
	private PoliceStationType police;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public PoliceStationType getPolice() {
		return police;
	}
	public void setPolice(PoliceStationType police) {
		this.police = police;
	}
	public int getDistrictid() {
		return districtid;
	}
	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	
}
