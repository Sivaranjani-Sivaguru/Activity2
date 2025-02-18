package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.model.Item;

public class ItemDAOImpl implements ItemDAO{
	EntityManager entityManager;
	public ItemDAOImpl() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("ItemPU");
		entityManager=factory.createEntityManager();
	}


	@Override
	public boolean add(Item item) {
		try {
			EntityTransaction transaction =entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(item);
			transaction.commit();
			return true;
			}catch(Exception e) {
				System.out.println(e);
				return false;
			}
	}

}
