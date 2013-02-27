package uk.ac.glasgow.internman.internships;

import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Role;
import uk.ac.glasgow.internman.Visit;

public class InternshipImpl implements uk.ac.glasgow.internman.Internship{

	private String managerName;
	private String managerEmail;
	private Employer employer;
	private InternshipStatus status;
	private Visit visit;
	private Role role;
	
	public InternshipImpl(){
		managerName = null;
		managerEmail = null;
		employer = null;
		status = InternshipStatus.APPLYING;
		visit = null;
		role = null;
	}
	
	public InternshipImpl(String name, String email, Employer employer,Role role){
		managerName = name;
		managerEmail = email;
		this.employer = employer;
		status = InternshipStatus.APPLYING;
		visit = null;
		this.role = role;
	}
	
	public String getManager(){
		return managerName;
	};

	public String getManagerEmail(){
		return managerEmail;
	};

	public boolean isVisitComplete(){
		//TODO 
		return true;
	};

	public Employer getEmployer(){
		return employer;
	};

	public Role getRole(){
		return role;
	};

	public InternshipStatus getStatus(){
		return status;
	};

	public Visit getVisit(){
		//TODO
		return null;
	};
}
