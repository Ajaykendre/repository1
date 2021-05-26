package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	private String uname;
	private String upass;
	private String umobileno;
	private String uemailid;
	private String ugender;
	private String uaddress;
	private String udob;
	private String status;
//	private int roleid;
//	
//	public int getRoleid() {
//		return roleid;
//	}
//	public void setRoleid(int roleid) {
//		this.roleid = roleid;
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUmobileno() {
		return umobileno;
	}
	public void setUmobileno(String umobileno) {
		this.umobileno = umobileno;
	}
	public String getUemailid() {
		return uemailid;
	}
	public void setUemailid(String uemailid) {
		this.uemailid = uemailid;
	}
	public String getUgender() {
		return ugender;
	}
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUdob() {
		return udob;
	}
	public void setUdob(String udob) {
		this.udob = udob;
	}
	
	
	
}
