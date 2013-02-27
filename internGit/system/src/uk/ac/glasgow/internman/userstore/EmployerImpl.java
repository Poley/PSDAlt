package uk.ac.glasgow.internman.userstore;

import uk.ac.glasgow.internman.userstore.User;

public class EmployerImpl extends User implements uk.ac.glasgow.internman.Employer {

	private String email;
	
	public EmployerImpl(String surname, String forename, String GUID,
			String password,String email) {
		super(surname, forename, GUID, password,"Employer");
		this.email = email;
	}

	@Override
	public String getName() {
		return super.forename + " " + super.surname;
 	}

	@Override
	public String getEmailAddress() {
		return email;
	}

}
