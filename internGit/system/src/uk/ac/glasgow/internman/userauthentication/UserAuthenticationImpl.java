package uk.ac.glasgow.internman.userauthentication;

import java.io.File;
import java.util.Map;


import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Student;
import uk.ac.glasgow.internman.userstore.User;
import uk.ac.glasgow.internman.userstore.UserStoreImpl;

public class UserAuthenticationImpl implements UserAuthentication{
	UserStoreImpl users;
	File storeFile;

	public UserAuthenticationImpl(){
		this.users = new UserStoreImpl(null);
		
	}
	
	public boolean authenticate(String GUID, String password)
	{
		User u = users.getUser(GUID);
		return u.authenticate(password);
	}
	

	@Override
	public Employer addEmployer(String name, String emailAddress) {
		return this.users.addEmployer(name, emailAddress);	
	}

	
	public User getUser(String GUID) {
		return this.users.getUser(GUID);
		
	}

	@Override
	public Student getStudent(String matriculation) {
		return this.users.getStudent(matriculation);
	}

	

	@Override
	public Map<String, Student> returnStudentMap() {
		return this.users.returnStudentMap();
	}


	
	
}
