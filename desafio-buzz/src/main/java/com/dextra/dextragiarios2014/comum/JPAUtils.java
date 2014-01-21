package com.dextra.dextragiarios2014.comum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dextragiarios");

	public static EntityManager getEM() {
		return emf.createEntityManager();
	}

	public static Object merge(Object obj) {
		EntityManager em = JPAUtils.getEM();
		em.getTransaction().begin();
		obj = em.merge(obj);
		em.getTransaction().commit();
		em.close();		
		return obj;
	}

}
