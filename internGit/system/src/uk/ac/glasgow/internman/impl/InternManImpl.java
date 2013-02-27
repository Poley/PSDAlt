package uk.ac.glasgow.internman.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import uk.ac.glasgow.internman.Role;
import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.InternMan;
import uk.ac.glasgow.internman.Student;
import uk.ac.glasgow.internman.UoGGrade;
import uk.ac.glasgow.internman.usermanagement.*;
import uk.ac.glasgow.internman.userstore.*;
import uk.ac.glasgow.internman.advertmanagement.*;
import uk.ac.glasgow.internman.advertstore.*;

/**
 * A stub class that implements the InternMan facade without providing any
 * actual functionality (except permitting logging in and out). The class should
 * be replaced by a real implementation once development begins.
 * 
 * @author Cowboy
 * 
 */
public class InternManImpl implements InternMan {

	private UserManagementImpl users;
	private AdvertManagementImpl adverts;
	
	public InternManImpl(UserStore userStore){
		this.users = new UserManagementImpl();
		this.adverts = new AdvertManagementImpl();
	}
	
	@Override
	public boolean login(String userName, String password) {
		return users.authenticate(userName, password);
	}

	@Override
	public User getCurrentUser() {
		return users.getCurrentUser();
	}

	@Override
	public Map<Integer, Advertisement> getAdvertisements() {		
		return adverts.getAdvertisment();
	}

	@Override
	public Map<String, Student> getStudents() {

		return users.returnStudentMap();

	}

	@Override
	public Employer registerNewEmployer(String name, String emailAddress) {
		return users.addEmployer(name, emailAddress);
	}

	@Override
	public Advertisement createNewAdvertisement(String applicationDetails) {
		return adverts.createAdv(applicationDetails);
	}

	@Override
	public Advertisement selectAdvertisement(Integer index) {
		return adverts.selectAdvertisement(index);
	}

	@Override
	public Role selectRole(Integer advertisementIndex, Integer roleIndex) {		
		return adverts.selectRole(advertisementIndex, roleIndex);
	}

	@Override
	public Student selectStudent(String matriculation) {
		return users.getStudent(matriculation);
	}

	@Override
	public void publishAdvertisement(Integer advertisementIndex, String comment) {
		
		adverts.pubAdver(advertisementIndex, comment);
		return;
		
	}

	@Override
	public void notifyAcceptedOffer(Role role, String managerName,
			String managerEmail) {
		System.out.println("Notified");
		
	}

	@Override
	public void approveAcceptedOffer(String matriculation) {
		System.out.println("Approved");
		
	}

	@Override
	public void assignAcademicVisitor(String matriculation, String visitorName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recordVisitAssessment(String matriculation, UoGGrade grade,
			String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employer getCurrentEmployer() {
		if(users.getCurrentUser() instanceof Employer)
			return (Employer) users.getCurrentUser();
		return null;
	}

	@Override
	public Role createNewSelfSourcedRole(String title, String location,
			Date start, Date end, String description, Double salary) {
		return adverts.createRole(title, location, start, end, description, salary);
	}
}
