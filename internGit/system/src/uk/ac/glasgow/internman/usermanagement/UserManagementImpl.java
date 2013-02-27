package uk.ac.glasgow.internman.usermanagement;

import java.util.Map;

import uk.ac.glasgow.internman.userauthentication.UserAuthenticationImpl;
import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Student;
import uk.ac.glasgow.internman.userstore.User;
import uk.ac.glasgow.internman.userstore.UserStoreImpl;

public class UserManagementImpl implements UserManagement{
	private User currentUser;
	private UserAuthenticationImpl users;
	
	public UserManagementImpl(){
		currentUser = null;
		users = new UserAuthenticationImpl();
	}
	
	@Override
	public Employer addEmployer(String name, String emailAddress) {
		return users.addEmployer(name, emailAddress);
		
	}

	@Override
	public Student getStudent(String matriculation) {
		return users.getStudent(matriculation);
	}

	
	
	public User getCurrentUser(){
		return currentUser;
	}
	
	private void updateCurrent(User newUser){
		currentUser = newUser;
	}
	
	
	public User getUser(String GUID){
		return users.getUser(GUID);
	}
	
	
	public Map<String,Student> returnStudentMap(){
		return users.returnStudentMap();
	}
	
	public boolean authenticate(String GUID, String password){
		if(users.authenticate(GUID, password)==true){
			currentUser = getUser(GUID);
			return true;
		} else
			return false;
	}


}
