package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String personname;
private String commentmsg;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPersonname() {
	return personname;
}
public void setPersonname(String personname) {
	this.personname = personname;
}
public String getCommentmsg() {
	return commentmsg;
}
public void setCommentmsg(String commentmsg) {
	this.commentmsg = commentmsg;
}
}
