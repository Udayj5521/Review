package ProductReview;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class MultipleReview {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "SELECT s From Review s";
		
		Query query = entityManager.createQuery(sql);
		List<Review> reviews = query.getResultList();
		
		for(Review review: reviews) {
			System.out.println("ID is "+review.getId());
			System.out.println("Subject is "+review.getSubject());
			System.out.println("Content is "+review.getContent());
			System.out.println("Writer is "+review.getWriterName());
			System.out.println("Create Date time is "+review.getCreateDateTime());
			System.out.println("Update Date time is "+review.getUpdateDateTime());
		}
 	}

}
