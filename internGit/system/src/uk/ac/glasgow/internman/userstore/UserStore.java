package uk.ac.glasgow.internman.userstore;

import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Student;

public interface UserStore {

	public void addUser(String surname, String forename, String GUID, String password);
	public Employer addEmployer(String name, String emailAddress);
	public User getUser(String GUID);
	public Student getStudent(String matriculation);
}
