package com.ash.dao;

import com.ash.entity.Citizen;
import com.ash.entity.Passport;

public interface CitizenDao {

	//void saveCitizen(Citizen citi);
	String saveCitizen(Citizen citi);

	Citizen fetchCitizenDetails(Integer cId);
	
	Passport fetchPassportDetails(Integer pId);

	void removCitizen(Integer cId);
}
