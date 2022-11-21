package Bank;

public interface StateBankDao {
	
	Account findAccountById(int id);
	String saveAccount(Account account);
	String deleteAccountById(int id);
	String withdrawFromAccount(double amount,int accountId);
	String depositInAccount(double amount,int accountId);

}
