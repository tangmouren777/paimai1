package com.accp.pojo;

import java.util.Date;

public class Student {
private String name;
private Date date;
private Integer sex;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Integer getSex() {
	return sex;
}
public void setSex(Integer sex) {
	this.sex = sex;
}
public Student(String name, Date date, Integer sex) {
	super();
	this.name = name;
	this.date = date;
	this.sex = sex;
}
public Student() {
	super();
}



}
