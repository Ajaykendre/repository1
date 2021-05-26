package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PoliceStationType
{
	@Id
	private int psid;
	
	private String psname;
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPsid() {
		return psid;
	}

	public void setPsid(int psid) {
		this.psid = psid;
	}

	public String getPsname() {
		return psname;
	}

	public void setPsname(String psname) {
		this.psname = psname;
	}

	
}
