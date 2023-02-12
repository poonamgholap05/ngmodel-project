package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.DaoI.DaoI;
import com.cjc.model.Audit;

import com.cjc.serviceI.ServiceI;
@Service
public class ServiceImpl implements ServiceI{
@Autowired
DaoI udi;
	@Override
	public List<Audit> getAllData() {
		List<Audit> l=(List<Audit>) udi.findAll();
		return l;
	}
	@Override
	public void saveData(Audit s2) {
		udi.save(s2);
		
	}
	@Override
	public void updateData(Audit s2) {
		
		udi.save(s2);
		
	}
	@Override
	public void deleteData(int fid) {
		udi.deleteById(fid);
		
	}
	@Override
	public Audit getSingleData(int fid) {
	Audit u=udi.findAllById(fid);
		return u;
	}
//	@Override
//	public Audit getSingleData1(String username, String password) {
//		Audit u=udi.findAllByUsernameAndPassword(username,password);
//		return u;
//	}
//	@Override
//	public List<Audit> getSingleDatabystaff(String stafftype) {
//		List<Audit> u=udi.findAllByStafftype(stafftype);
//		return u;
//	}

}
