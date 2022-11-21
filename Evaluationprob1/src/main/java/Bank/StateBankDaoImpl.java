package Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StateBankDaoImpl implements StateBankDao{

	@Override
	public Account findAccountById(int id) {
		
		
		EntityManager em=DBUtil.provideEntityManager();
		
		em.getTransaction().begin();
		return em.find(Account.class, id);
	}

	@Override
	public String saveAccount(Account account) {
		
		EntityManager em=DBUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(account);
		
		em.getTransaction().commit();
		em.close();
		return "Account Registered Successfully";
		
	}

	@Override
	public String deleteAccountById(int id) {
	
		EntityManager em=DBUtil.provideEntityManager();
		
		em.getTransaction().begin();
		Account account=em.find(Account.class,id);
		if(account!=null) {
			em.remove(account);
			em.close();
			return "Done";
			
		}
		
		
		else
		return "Account not found";
		
		
	}

	@Override
	public String withdrawFromAccount(double amount, int accountId) {

		EntityManager em=DBUtil.provideEntityManager();
		
		em.getTransaction().begin();
		Account account=em.find(Account.class,accountId);
		if(account!=null) {
			if(amount>account.getBalance())
				return "Available Balance is Low";
			
			account.setBalance(amount-account.getBalance());
			em.getTransaction().commit();
			em.close();
			return "Done";
		}
		
		
		else
		return "Account not found";
	
		
	
	}

	@Override
	public String depositInAccount(double amount, int accountId) {
		
		
		EntityManager em=DBUtil.provideEntityManager();
		
		em.getTransaction().begin();
		Account account=em.find(Account.class,accountId);
		if(account!=null) {
			
			account.setBalance(account.getBalance()+amount);
			em.getTransaction().commit();
			em.close();
			return "Done";
		}
		
		
		else
		return "Account not found";
		
	}

}
