package com.ash.client;

import com.ash.dao.CitizenDao;
import com.ash.dao.impl.CitizenDaoImpl;
import com.ash.entity.Citizen;
import com.ash.entity.Passport;

public class TestMain {
	public static void main(String[] args) {
		

  CitizenDao dao = new CitizenDaoImpl();
  
  Citizen c = new Citizen();
  c.setcName("ash ");
  c.setcId(234);
 


  
  Passport p = new Passport();
  p.setpId(789);
  p.setpNumber("456");
  p.setpType("P");
  
  c.setPassport(p);
  dao.saveCitizen(c);
  
  
	}
}
  
  
  
  


  // get passport by citizen
//  c.setPassport(pas);
//
//// get citizen by passport
////p.setCitizen(c);
//
//dao.saveCitizen(c);

	
	

