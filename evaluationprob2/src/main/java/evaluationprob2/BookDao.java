package evaluationprob2;

import java.awt.print.Book;



public interface BookDao {
	 
	Book findbookId(int id);
	String CreateBook(Book book);
	String deleteBook(int id);
	String updateBook(int Id);
	

}
