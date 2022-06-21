package ProductReview;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateReview {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Review review = new Review();
		review.setId(1);
		review.setSubject("JAVA");
		review.setContent("java is a programming language");
		review.setWriterName("uday");
		review.setCreateDateTime(LocalDateTime.now());
		review.setUpdateDateTime(LocalDateTime.now());

		entityTransaction.begin();
		entityManager.merge(review);
		entityTransaction.commit();

	}

}
