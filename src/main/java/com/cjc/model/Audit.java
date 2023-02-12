package com.cjc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Audit {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
private int id;
private String name;
private String address;
private String mobileno;
@OneToMany(cascade = CascadeType.ALL)
private  Set<Comments> comment;




public Set<Comments> getComment() {
	return comment;
}
public void setComment(Set<Comments> comment) {
	this.comment = comment;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
