package ProductReview;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveReview {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Review review = new Review();
		
		review.setId(2);
		review.setSubject("Bag");
		review.setContent("Product is ok");
		review.setWriterName("tom");
		
		review.setCreateDateTime(LocalDateTime.now());
		review.setUpdateDateTime(LocalDateTime.now());
		
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
	}
}
