package com.cjc.app.fl.master.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class BranchDetails 
{
	@Id
	private int branchid ;
	private String branchname      ;
	
	private String branchmobileno  ;
	
	private String branchemailid   ;
	private String branchcode      ;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="branchid")
	private List <DealerDetails> dealer;
	public List<DealerDetails> getDealer() {
		return dealer;
	}

	public void setDealer(List<DealerDetails> dealer) {
		this.dealer = dealer;
	}	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getBranchmobileno() {
		return branchmobileno;
	}

	public void setBranchmobileno(String branchmobileno) {
		this.branchmobileno = branchmobileno;
	}

	public String getBranchemailid() {
		return branchemailid;
	}

	public void setBranchemailid(String branchemailid) {
		this.branchemailid = branchemailid;
	}

	public String getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

}
