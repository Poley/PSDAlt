package uk.ac.glasgow.internman.advertstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Role;
import uk.ac.glasgow.internman.Advertisement.AdvertisementStatus;
import uk.ac.glasgow.internman.Internship.InternshipStatus;
import uk.ac.glasgow.internman.advertmanagement.AdvertManagement;

public class AdvertisementImpl  implements Advertisement {
	String description;
	String comments;
	AdvertisementStatus status;
	Employer employer;
	Map<Integer, Role> myRoles;
	
	public AdvertisementImpl(){
		description = null;
		comments = null;
		status = AdvertisementStatus.PENDING;
		employer = null;
		myRoles = null;
	}
	
	public AdvertisementImpl(String desc,Employer employer){
		description = desc;
		comments = null;
		status = AdvertisementStatus.PENDING;
		employer = null;
		myRoles = new HashMap<Integer, Role>();
	}
	
	public Map<Integer, Role> getRoles(){
		return myRoles;
	};

	public Employer getEmployer(){
		return employer;
	};

	public String getApplicationDetails(){
		return description;
	};

	public String getComments(){
		return comments;
	};

	public AdvertisementStatus getStatus(){
		return status;
	};

	public Role addNewRole(
			String title, String location, Date start, Date end, String description, Double salary){
		return null;
	};
}
