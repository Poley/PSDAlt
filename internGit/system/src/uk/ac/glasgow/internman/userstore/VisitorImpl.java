package uk.ac.glasgow.internman.userstore;

import uk.ac.glasgow.internman.userstore.User;

public class VisitorImpl extends User implements uk.ac.glasgow.internman.Visitor {

	public VisitorImpl(String surname, String forename, String GUID, String password) {
		super(surname, forename, GUID, password,"Visitor");
	}

	@Override
	public String getName() {
		return super.forename + " " + super.surname;
	}

}
