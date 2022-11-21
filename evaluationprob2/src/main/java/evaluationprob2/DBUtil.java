package evaluationprob2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManagerFactory emf=Persistence.createEntityManagerFactory("bookUnit");
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}

}
