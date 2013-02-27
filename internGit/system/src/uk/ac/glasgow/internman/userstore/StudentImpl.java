package uk.ac.glasgow.internman.userstore;

import uk.ac.glasgow.internman.Internship;
import uk.ac.glasgow.internman.internships.InternshipImpl;
import uk.ac.glasgow.internman.userstore.User;

public class StudentImpl extends User implements uk.ac.glasgow.internman.Student {

	private Internship internship;
	private Programme programme;
	private String email;
	
	public StudentImpl(Programme programme, String email, String surname, String forename, String GUID, String password) {
		super(surname, forename, GUID, password,"Student");
		this.internship = null;
		this.programme = programme;
		email = GUID + "@student.gla.ac.uk";
	}

	public void setInternship(InternshipImpl internship) {
		this.internship = internship;
	}
	
	@Override
	public Internship getInternship() {
		return internship;
	}

	@Override
	public String getSurname() {
		return super.surname;
	}

	@Override
	public String getMatriculation() {
		return super.GUID;
	}

	@Override
	public String getForename() {
		return super.forename;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public Programme getProgramme() {
		return programme;
	}

}
