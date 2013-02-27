package uk.ac.glasgow.internman.advertstore;

import java.util.Date;


public class RoleImpl {
String title;
String location;
Date start;
Date end;
String description;
Double salary;
public RoleImpl(String tit, String loc, Date sta, Date end, String des, double sal){
	this.title = tit;
	this.location = loc;
	this.start = sta;
	this.end = end;
	this.description = des;
	this.salary = sal;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getStart() {
	return start;
}
public void setStart(Date start) {
	this.start = start;
}
public Date getEnd() {
	return end;
}
public void setEnd(Date end) {
	this.end = end;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
