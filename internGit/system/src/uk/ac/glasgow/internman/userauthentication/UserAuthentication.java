package uk.ac.glasgow.internman.userauthentication;

import java.util.Map;

import uk.ac.glasgow.internman.*;
import uk.ac.glasgow.internman.userstore.User;

public interface UserAuthentication {
	
	public Employer addEmployer(String name, String emailAddress);
	public User getUser(String GUID);
	public Student getStudent(String matriculation);
	public Map<String, Student> returnStudentMap();
	

}
