package com.cjc.app.fl.master.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.master.main.model.BranchDetails;
import com.cjc.app.fl.master.main.model.CustomerOccupation;
import com.cjc.app.fl.master.main.model.DealerDetails;
import com.cjc.app.fl.master.main.model.Districts;
import com.cjc.app.fl.master.main.model.Document;
import com.cjc.app.fl.master.main.model.PoliceStationType;
import com.cjc.app.fl.master.main.model.Role;
import com.cjc.app.fl.master.main.model.States;
import com.cjc.app.fl.master.main.model.Status;
import com.cjc.app.fl.master.main.model.User;
import com.cjc.app.fl.master.main.repository.BranchDetailsRepository;
import com.cjc.app.fl.master.main.repository.CustomerOccupationRepository;
import com.cjc.app.fl.master.main.repository.DealerDetailsRepository;
import com.cjc.app.fl.master.main.repository.DistrictsHomeRepository;
import com.cjc.app.fl.master.main.repository.DocumentRepository;
import com.cjc.app.fl.master.main.repository.PoliceStationTypeRepository;
import com.cjc.app.fl.master.main.repository.RoleRepository;
import com.cjc.app.fl.master.main.repository.StateHomeRepository;
import com.cjc.app.fl.master.main.repository.StatusRepository;
import com.cjc.app.fl.master.main.repository.UserHomeRepository;
import com.cjc.app.fl.master.main.serviceI.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired 
	StatusRepository sr;

	@Autowired
	RoleRepository rr;
	@Autowired
	DocumentRepository dr;
	@Override
	public void saveStatus(Status s) {
		sr.save(s);
		
	}

	@Override
	public List<Status> getStatusList() {
		List<Status> slist=	sr.findAll();
		return slist;
	}

	@Override
	public List<Status> updateStatus(Status s) {
		sr.save(s);
		
		return displayAllStatus();
	}

	private List<Status> displayAllStatus() {
		 List<Status> slist=sr.findAll();
		return slist;
	}

	@Override
	public List<Status> deleteStatus(int sid) {
		sr.deleteById(sid);
		return displayAllStatus();
	}

	@Override
	public void saveRole(Role r) {
		rr.save(r);
		
	}

	@Override
	public List<Role> getRoleList() {
		List<Role> rlist=rr.findAll();
		return rlist;
	}

	@Override
	public List<Role> updateRole(Role r) {
		rr.save(r);
		return displayAllRole();
	}

	private List<Role> displayAllRole() {
		List<Role> rlist=rr.findAll();
		return rlist;
	}

	@Override
	public List<Role> deleteRole(int rid) {
		rr.deleteById(rid);
		return displayAllRole();
	}

	@Override
	public void saveDoc(Document d) {
		
		dr.save(d);
	}

	@Override
	public List<Document> getDocList() {
		List<Document> dlist=	dr.findAll();
		return dlist;
	}

	@Override
	public List<Document> updateDoc(Document d) {
		dr.save(d);
		return displayAllDocument();
	}

	private List<Document> displayAllDocument() {
		List<Document> dlist=dr.findAll();
		return dlist;
	}

	@Override
	public List<Document> deleteDoc(int did) {
		dr.deleteById(did);
		return displayAllDocument();
	}

	@Autowired
	UserHomeRepository uhr;
	
	@Autowired
	StateHomeRepository shr;
	
	@Autowired
	DistrictsHomeRepository dhr;
	
	@Override
	public void save(User u) {
		uhr.save(u);
		
	}

	@Override
	public List<User> getdata() {
		List<User> list=(List<User>) uhr.findAll();
		return list;
	}

	@Override
	public List<User> updatedata(User u) {
		uhr.save(u);
		List<User> list=(List<User>) uhr.findAll();
		return list;
	}

	@Override
	public Iterable<User> deletedata(int uid) {
	
		uhr.deleteById(uid);
		Iterable<User> list=uhr.findAll();
		return list;
	}

	@Override
	public void save(States s) {
		shr.save(s);
		
	}

	@Override
	public List<States> getrecord() {
		List<States> list=(List<States>) shr.findAll();
		return list;
	}

	@Override
	public List<States> updatedata(States s) {
		shr.save(s);
		List<States>list=(List<States>) shr.findAll();
		return list;
	}

	@Override
	public Iterable<States> deleterecord(int sid) {
		shr.deleteById(sid);
		Iterable<States> list=shr.findAll();
		return list;
	}

	@Override
	public List<Districts> save(Districts d) {
		 List<Districts> d1=(List<Districts>) dhr.save(d);
		return d1;
	}

	@Override
	public List<Districts> getdist() {
		List<Districts> list=(List<Districts>) dhr.findAll();
		return list;
	}

	@Override
	public List<Districts> updatedata(Districts d) {
		dhr.save(d);
		List<Districts> list=(List<Districts>) dhr.findAll();
		return list;
	}

	@Override
	public Iterable<Districts> deletedist(int did) {
		dhr.deleteById(did);
		List<Districts> list=(List<Districts>) dhr.findAll();
		return list;
	}
	@Autowired
	PoliceStationTypeRepository pr;
	
	@Autowired
	DealerDetailsRepository ddr;

	@Override
	public void addData(PoliceStationType ps)
	{
		pr.save(ps);	
	}
	
	@Override
	public List<PoliceStationType> deleteData(int ps_id)
	{
		pr.deleteById(ps_id);
		return showAllps();
		
	}
	
	@Override
	public List<PoliceStationType> getAll()
	{
		return pr.findAll();
	}

	@Override
	public List<PoliceStationType> editData(PoliceStationType ps)
	{
		pr.save(ps);
	//	pr.findAll();
		
		return showAllps();
	}

	private List<PoliceStationType> showAllps()
	{
		List<PoliceStationType> plist=pr.findAll();
		return plist;
	}

	@Override
	public void adddata(DealerDetails dd) 
	{
		ddr.save(dd);
		
	}

	

	@Override
	public List<DealerDetails> deletedatad(int dealer_id) 
	{
		ddr.deleteById(dealer_id);
		return showAlldd();
		
	}

	
	


	@Override
	public List<DealerDetails> getall() 
	{
		return ddr.findAll();
	}

	@Override
	public List<DealerDetails> editdata(DealerDetails dd)
	{
		ddr.save(dd);
		return showAlldd();
	}

	private List<DealerDetails> showAlldd() {
		List<DealerDetails> dlist=ddr.findAll();
		return dlist;
	}

	/*
	 * @Override public DealerDetails getData(int dealer_id) { // TODO
	 * Auto-generated method stub return null; }
	 */
	@Autowired
	BranchDetailsRepository br;
	
	@Autowired
	CustomerOccupationRepository cr;
	

	@Override
	public void savebranch(BranchDetails bd) 
	{
		br.save(bd);
		
	}

	@Override
	public List<BranchDetails> getallbranch() 
	{
		return br.findAll();
	}

	@Override
	public List<BranchDetails> updatebranch(BranchDetails bd) 
	{
		br.save(bd);
		return showAllbd();
	}

	@Override
	public List<BranchDetails> delbranch(int branch_id) 
	{
		br.deleteById(branch_id);
		return showAllbd();
		
	}
	
	private List<BranchDetails> showAllbd() 
	{
		List<BranchDetails> brlist=br.findAll();
		return brlist;
	}

	@Override
	public void saveoccup(CustomerOccupation co) 
	{
		cr.save(co);
		
	}

	@Override
	public List<CustomerOccupation> getalloccup() 
	{
		return cr.findAll();
	}

	@Override
	public List<CustomerOccupation> updateoccup(CustomerOccupation co) 
	{
		cr.save(co);
		return showAllco();
	}

	private List<CustomerOccupation> showAllco() 
	{
		List<CustomerOccupation> clist=cr.findAll();
		return clist;
	}

	@Override
	public List<CustomerOccupation> deloccup(int customer_id)
	{
		cr.deleteById(customer_id);
		return showAllco();
	}
	


	

}
