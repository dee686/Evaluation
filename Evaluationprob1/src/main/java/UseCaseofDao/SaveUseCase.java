package UseCaseofDao;

import java.util.Scanner;

import Bank.Account;
import Bank.StateBankDao;
import Bank.StateBankDaoImpl;

public class SaveUseCase {
	
	public static void main(String[] args) {
		StateBankDao dao=new StateBankDaoImpl();
		Scanner sc=new Scanner(System.in);
		Account acc=new Account();
		System.out.println("Type the Name");
		acc.setName(sc.next());
		System.out.println("Type the Email");
		acc.setEmail(sc.nextLine());
		System.out.println("Type the Address");
		acc.setAddress(sc.nextLine());
		sc.next();
		System.out.println("Type the Balance");
		acc.setBalance(sc.nextDouble());
		
	}

}
