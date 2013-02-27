package uk.ac.glasgow.internman.usermanagement;
import java.util.Map;

import uk.ac.glasgow.internman.Student;
import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.userstore.User;

public interface UserManagement {
	
	/**
	 * Provides functionality to add an Employer to the system
	 * @param name
	 * @param emailAddress
	 * 
	 * @return void
	 */
	public Employer addEmployer(String name, String emailAddress);
	
	/**
	 * Provides functionality to retrieve a Student object based on matriculation number. 
	 * @param matriculation
	 * @return Student
	 */
	public Student getStudent(String matriculation);


	/**
	 * Provides functionality to retrieve a User object based on the users GUID
	 * @param GUID
	 * @return User
	 */
	public User getUser(String GUID);
	
	/**
	 * Provides functionality to return a Map of all users in the system
	 * @return Map<String, Student>
	 */
	public Map<String,Student> returnStudentMap();
	
	/**
	 * Provides functionality to authenticate a user based on their GUID and password
	 * @param GUID
	 * @param password
	 * @return true if successful, false if not.
	 */

	public boolean authenticate(String GUID, String password);
	public User getCurrentUser();
}
