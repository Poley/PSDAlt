package uk.ac.glasgow.internman.advertmanagement;

import java.util.Map;

import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.advertstore.RoleImpl;
import uk.ac.glasgow.internman.userstore.User;

public interface AdvertManagement {

	public void advertisment(String application);
	public void addRole(RoleImpl myrole);
	public RoleImpl getRole(int index);
	
	
	
}
