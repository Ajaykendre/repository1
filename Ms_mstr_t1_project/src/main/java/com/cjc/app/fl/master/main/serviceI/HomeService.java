package com.cjc.app.fl.master.main.serviceI;

import java.util.List;

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

public interface HomeService {

	void saveStatus(Status s);

	List<Status> getStatusList();

	List<Status> updateStatus(Status s);

	List<Status> deleteStatus(int sid);

	void saveRole(Role r);

	List<Role> getRoleList();

	List<Role> updateRole(Role r);

	List<Role> deleteRole(int rid);
	void saveDoc(Document d);

	List<Document> getDocList();

	List<Document> updateDoc(Document d);

	List<Document> deleteDoc(int did);
	void save(User u);

	List<User> getdata();

	List<User> updatedata(User u);

	Iterable<User> deletedata(int uid);

	void save(States s);
	
	List<States> getrecord();
	
	List<States> updatedata(States s);

	Iterable<States> deleterecord(int sid);

	List<Districts> save(Districts d);

	List<Districts> getdist();

	List<Districts> updatedata(Districts d);

	Iterable<Districts> deletedist(int did);
	void addData(PoliceStationType ps);

	void adddata(DealerDetails dd);

	List<PoliceStationType> deleteData(int ps_id);

	List<DealerDetails> deletedatad(int dealer_id);

	//DealerDetails getData(int dealer_id);

	List<PoliceStationType> getAll();

	List<PoliceStationType> editData(PoliceStationType ps);

	List<DealerDetails> getall();

	List<DealerDetails> editdata(DealerDetails dd);
	void savebranch(BranchDetails bd);
	
	List<BranchDetails> getallbranch();

	List<BranchDetails> updatebranch(BranchDetails bd);

	List<BranchDetails> delbranch(int branch_id);
	
	void saveoccup(CustomerOccupation co);
	
	List<CustomerOccupation> getalloccup();

	List<CustomerOccupation> updateoccup(CustomerOccupation co);

	List<CustomerOccupation> deloccup(int customer_id);


}
