package ProductReview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetReview {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Review review = entityManager.find(Review.class,1 );
		
		if(review != null) {
			System.out.println("Id is "+review.getId());
			System.out.println("Subject is "+review.getSubject());
			System.out.println("Content is "+review.getContent());
			System.out.println("Create Date Time "+review.getCreateDateTime());
			System.out.println("Update Date Time "+review.getUpdateDateTime());
		}
		else {
			System.out.println("No Review exist for given id");
		}
	}

}
