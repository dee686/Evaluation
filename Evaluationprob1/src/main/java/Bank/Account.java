package Bank;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private int id;
			private String name;
		
			private String email;
			private String address;
			private double balance;
			private Date createted_date;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			public Account(int id, String name, String email, String address, double balance, Date createted_date) {
				super();
				this.id = id;
				this.name = name;
				this.email = email;
				this.address = address;
				this.balance = balance;
				this.createted_date = createted_date;
			}
			
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			public Date getCreateted_date() {
				return createted_date;
			}
			public void setCreateted_date(Date createted_date) {
				this.createted_date = createted_date;
			}
			public Account() {
				LocalDate createted_date=LocalDate.now();
			}
			@Override
			public String toString() {
				return "Account [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
						+ ", balance=" + balance + ", createted_date=" + createted_date + "]";
			}
		
			
			
}
