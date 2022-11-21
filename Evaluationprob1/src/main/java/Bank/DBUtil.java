package Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManagerFactory emf=Persistence.createEntityManagerFactory("accountUnit");
	public static EntityManager provideEntityManager() {
		return emf.createEntityManager();
	}

}
