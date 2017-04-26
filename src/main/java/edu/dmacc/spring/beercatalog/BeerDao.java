package edu.dmacc.spring.beercatalog;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class BeerDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("UserRegistration1");

	public void insertBeer(Beer beerToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(beerToAdd);
		em.getTransaction().commit();
		em.close();
		emfactory.close();

	}

	public List<Beer> getAllBeers() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select b from Beer b";
		TypedQuery<Beer> typedQuery = em.createQuery(q, Beer.class);
		List<Beer> all = typedQuery.getResultList();
		return all;
	}


}
