package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Document 
{	
	@Id
	private int did;
	private String dname;
	private String ddescription;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDdescription() {
		return ddescription;
	}
	public void setDdescription(String ddescription) {
		this.ddescription = ddescription;
	}
	
	
	
	
	
}
