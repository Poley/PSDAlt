package uk.ac.glasgow.internman.userstore;

public abstract class User {

	String forename;
	String surname;
	String GUID;
	String password;
	String type;
	
	public User(String inforename, String insurname, String inGUID, String inpassword, String intype){
		forename = inforename;
		surname = insurname;
		GUID = inGUID;
		password = inpassword;
		type = intype;
	}
	
	public String getType(){
		return this.type;
	}
	
	public boolean authenticate(String inputPassword){
		return password.equals(inputPassword);
	}
	

}
