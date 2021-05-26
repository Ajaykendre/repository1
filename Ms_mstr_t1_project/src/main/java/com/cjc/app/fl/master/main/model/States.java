package com.cjc.app.fl.master.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

@Entity
public class States {

	@Id
	private int stateid;
	private String statecode;
	private String statename;
	private int stategstcode;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="stateid")
	private Districts district;
	
		public Districts getDistrict() {
		return district;
	}
	public void setDistrict(Districts district) {
		this.district = district;
	}
		public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public int getStategstcode() {
		return stategstcode;
	}
	public void setStategstcode(int stategstcode) {
		this.stategstcode = stategstcode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
