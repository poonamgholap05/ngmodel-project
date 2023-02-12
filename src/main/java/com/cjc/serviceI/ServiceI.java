package com.cjc.serviceI;

import java.util.List;

import com.cjc.model.Audit;

public interface ServiceI {

	List<Audit> getAllData();

	void saveData(Audit s2);

	void updateData(Audit s2);

	void deleteData(int fid);

	Audit getSingleData(int fid);

//	Audit getSingleData1(String username, String password);
//
//	List<Audit> getSingleDatabystaff(String stafftype);

}
