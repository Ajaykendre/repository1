package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DealerDetails 
{
	@Id
	private int dealerid;
	
	private String dealername;
	
	private String dealerinvoice;
	
	private String dealeraddress;
	
	private String dealeraccountno;
	
	private String dealerIFSCcode;
	
	private String dealerbankbranchname;
	
	private String dealerbankname;
	
	private String dealermobileno;
	
	private String dealeremailid;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDealerid() {
		return dealerid;
	}

	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}

	public String getDealername() {
		return dealername;
	}

	public void setDealername(String dealername) {
		this.dealername = dealername;
	}

	public String getDealerinvoice() {
		return dealerinvoice;
	}

	public void setDealerinvoice(String dealerinvoice) {
		this.dealerinvoice = dealerinvoice;
	}

	public String getDealeraddress() {
		return dealeraddress;
	}

	public void setDealeraddress(String dealeraddress) {
		this.dealeraddress = dealeraddress;
	}

	public String getDealeraccountno() {
		return dealeraccountno;
	}

	public void setDealeraccountno(String dealeraccountno) {
		this.dealeraccountno = dealeraccountno;
	}

	public String getDealerIFSCcode() {
		return dealerIFSCcode;
	}

	public void setDealerIFSCcode(String dealerIFSCcode) {
		this.dealerIFSCcode = dealerIFSCcode;
	}

	public String getDealerbankbranchname() {
		return dealerbankbranchname;
	}

	public void setDealerbankbranchname(String dealerbankbranchname) {
		this.dealerbankbranchname = dealerbankbranchname;
	}

	public String getDealerbankname() {
		return dealerbankname;
	}

	public void setDealerbankname(String dealerbankname) {
		this.dealerbankname = dealerbankname;
	}

	public String getDealermobileno() {
		return dealermobileno;
	}

	public void setDealermobileno(String dealermobileno) {
		this.dealermobileno = dealermobileno;
	}

	public String getDealeremailid() {
		return dealeremailid;
	}

	public void setDealeremailid(String dealeremailid) {
		this.dealeremailid = dealeremailid;
	}
	
	

	
}
