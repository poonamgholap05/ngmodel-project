package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Audit;

import com.cjc.serviceI.ServiceI;

@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	ServiceI usi;
	@GetMapping(value="/getAllData")
	public List<Audit> getLoginPage(){
		List<Audit> al=usi.getAllData();
		al.forEach((s2)->{
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getMobileno());
	
		});
		
			return al;
	}
	@PostMapping(value="/postSingleData")
	public String postSingleData(@RequestBody Audit s2) {
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getMobileno());
		
		usi.saveData(s2);	
		return "success";
	}
	@PutMapping("/updateSingle")
	public String updateSingleData(@RequestBody Audit s2) {
		usi.updateData(s2);
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getMobileno());
	
		return "success";
	}
	@DeleteMapping("/deleteData/{fid}")
	public String deleteSingleData(@PathVariable int fid) {
		System.out.println(fid);
		usi.deleteData(fid);
		return "success";
	}
	@GetMapping(value="/getSingleData/{fid}")
	public Audit getSingledata(@PathVariable int fid) {
		Audit e=usi.getSingleData(fid);
		return e;
	}
	
//	@GetMapping(value="/gettechnicalData/{stafftype}")
//	public List<Audit> getSingledatabystaff(@PathVariable String stafftype) {
//		List<Audit> e=usi.getSingleDatabystaff(stafftype);
//		return e;
//	}
	
	
//	@GetMapping(value="/getSingleData1/{username}/{password}")
//	public Audit getSingledata1(@PathVariable("username") String username ,@PathVariable("password") String password) {
//		System.out.println("username :"+username);
//		System.out.println(password);
//		Audit e=usi.getSingleData1(username,password);
//		System.out.println(e.getId());
//
//		
//		return e;
//	}


}
