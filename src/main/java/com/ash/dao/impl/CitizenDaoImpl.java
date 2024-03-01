package com.ash.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ash.dao.CitizenDao;
import com.ash.entity.Citizen;
import com.ash.entity.Passport;

public class  CitizenDaoImpl implements CitizenDao{
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("ashu");
	
	public String saveCitizen(Citizen citi) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		String msg = null;

		try {
			em.persist(citi);
			tx.commit();
			msg = "saved";
			//System.out.println("Citizen's data successfully saved");
		} catch (Exception e) {
			msg = "not saved";
			//System.out.println("Failed to save Citizen's data");
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return msg;
	
		
	}




	public Citizen fetchCitizenDetails(Integer cId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Passport fetchPassportDetails(Integer pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removCitizen(Integer cId) {
		// TODO Auto-generated method stub
		
	}


}
