package uk.ac.glasgow.internman.userstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import uk.ac.glasgow.internman.Employer;
import uk.ac.glasgow.internman.Student;

public class UserStoreImpl implements UserStore{
	
	Map<String,User> users = new HashMap<String,User>();

	public UserStoreImpl(String string){}
	
	@Override
	public void addUser(String surname, String forename, String GUID, String password){
		
	};

	@Override
	public Employer addEmployer(String name, String emailAddress) {
				Employer toAdd = new EmployerImpl(name, null, null,"employer", emailAddress);
				users.put(emailAddress, (User) toAdd);
				return toAdd;
	}

	@Override
	public User getUser(String GUID) {
		return users.get(GUID);
	}

	@Override
	public Student getStudent(String matriculation) {
		return (Student) users.get(matriculation);
	}

	
	public Map<String, User> returnUserMap()
	{
		return users;
	}

	public Map<String, Student> returnStudentMap(){
	Set<Entry<String, User>> allUsers = users.entrySet();
	Map<String, Student> students = new HashMap<String, Student>();
	for(Map.Entry<String,User> entry : allUsers){
		if(entry.getValue().getType().equals("student"))
		{
			students.put(entry.getKey(),(Student) entry.getValue());
		}
	}
	return students;
}

}
