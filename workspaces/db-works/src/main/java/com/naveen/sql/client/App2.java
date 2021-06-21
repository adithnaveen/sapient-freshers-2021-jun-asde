package com.naveen.sql.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import com.naveen.sql.entity.Emp2;
import com.naveen.sql.util.JPAUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App2 {
	public static void main(String[] args) {
		Emp2 emp = new Emp2(); 
		emp.setEmpId(102);
		emp.setEmpName("Aarsh wardhan");
		emp.setEmpSal(2525);
		
		EntityManager entityManager = JPAUtil.getEntityManager(); 
//		save(emp, entityManager);
//		delete(entityManager);
//		update(emp, entityManager);
//		getEmp(entityManager);
		getAll(entityManager);
	}

	private static void getAll(EntityManager entityManager) {
		CriteriaQuery<Emp2> criteria = entityManager.getCriteriaBuilder().createQuery(Emp2.class);
		criteria.select(criteria.from(Emp2.class)); 
		List<Emp2> resultList = entityManager.createQuery(criteria).getResultList();
		
		for(Emp2 temp : resultList) {
			log.info("{}", temp);
		}
	}
	

	private static void getEmpBetweenSalary(EntityManager entityManager, double minSal, double maxSal) {
		// TODO 
	}

	private static void getEmp(EntityManager entityManager) {
		Emp2 gotEmp = entityManager.find(Emp2.class, 101); 
		log.info("{}", gotEmp);
	}

	private static void update(Emp2 emp, EntityManager entityManager) {
		entityManager.getTransaction().begin(); 
		entityManager.merge(emp); 
		entityManager.getTransaction().commit();
	}

	private static void delete(EntityManager entityManager) {
		entityManager.getTransaction().begin(); 
//		entityManager.remove(entityManager.merge(emp));
		entityManager.remove(entityManager.getReference(Emp2.class, 103));
		entityManager.getTransaction().commit();
	}

	private static void save(Emp2 emp, EntityManager entityManager) {
		{
			entityManager.getTransaction().begin(); 
			entityManager.persist(emp);
			entityManager.getTransaction().commit();
		}
	}
}
