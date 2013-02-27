package uk.ac.glasgow.internman.advertstore;

import java.util.HashMap;
import java.util.Map;

import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.userstore.User;

public class AdvertStoreImpl implements AdvertStore{
	
	public Map<Integer, Advertisement> adverts;
	private static Integer advertNo = 0;
	
	public AdvertStoreImpl(){
		adverts = new HashMap<Integer, Advertisement>();
	}

	public Map<Integer, Advertisement> getAdverts(User u){
		return adverts;
	};
	public void addAdvert(Advertisement a){
		adverts.put(advertNo, a);
		advertNo++;
		
	};
}
