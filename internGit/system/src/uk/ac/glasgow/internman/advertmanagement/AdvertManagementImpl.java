package uk.ac.glasgow.internman.advertmanagement;

import java.util.Date;
import java.util.Map;

import uk.ac.glasgow.internman.Advertisement;
import uk.ac.glasgow.internman.Role;
import uk.ac.glasgow.internman.advertstore.AdvertStoreImpl;
import uk.ac.glasgow.internman.advertstore.AdvertisementImpl;
import uk.ac.glasgow.internman.advertstore.RoleImpl;

public class AdvertManagementImpl implements AdvertManagement{
	
	public AdvertStoreImpl adverts;
	
	public  void addAdvertisment(String application){
		
	};
	
	public Map<Integer, Advertisement> getAdvertisments() {
		// TODO Auto-generated method stub
		return null;
	}
	public Advertisement createAdv(String applicationDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public Advertisement selectAdvertisement(Integer index) {
		// TODO Auto-generated method stub
		return null;
	}

	public Role selectRole(Integer advertisementIndex, Integer roleIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public void pubAdver(Integer advertisementIndex, String comment) {
		// TODO Auto-generated method stub
		
	}

	public Role createRole(String title, String location, Date start, Date end,
			String description, Double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<Integer, Advertisement> getAdvertisment() {
		// TODO Auto-generated method stub
		return null;
	};

}
