package com.cjc.DaoI;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Audit;
@Repository
public interface DaoI extends CrudRepository<Audit, Integer>{

	Audit findAllById(int id);
	//void saveAllById(int fid);

	//Audit findAllByUsernameAndPassword(String username, String password);

	//List<Audit> findAllByStafftype(String stafftype);

	
}
