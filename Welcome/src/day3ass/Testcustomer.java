package day3ass;

public class Testcustomer {
public static void main(String[] args) {
			
			Customer cust1 = new Customer();
			//set the value
			cust1.setCustomerName("John");
			cust1.setResidentialAddress(new Adress("1st Main HSR Layout", "Bengaluru"));
			//get the value
			System.out.println(cust1.getCustomerName());
			System.out.println(cust1.getResidentialAddress());
			System.out.println("\n");
			Customer cust2 = new Customer("John", new Adress("1st Main HSR Layout", "Bengaluru"));
			System.out.println(cust2.getCustomerDetails());
		}

	}


