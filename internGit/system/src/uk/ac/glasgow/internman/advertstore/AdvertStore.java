package uk.ac.glasgow.internman.advertstore;

import java.util.Map;

import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.userstore.User;

public interface AdvertStore {
	

	public Map<Integer, Advertisement> getAdverts(User u);
	public void addAdvert(Advertisement a);
	
}
