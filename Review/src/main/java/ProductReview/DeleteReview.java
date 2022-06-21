package ProductReview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteReview {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Review review = entityManager.find(Review.class, 2);

		if (review != null) {
			entityTransaction.begin();
			entityManager.remove(review);
			entityTransaction.commit();
		} else {
			System.out.println("No record to delete");
		}

	}

}
