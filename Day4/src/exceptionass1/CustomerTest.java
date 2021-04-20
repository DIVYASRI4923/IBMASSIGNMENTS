package exceptionass1;
import java.util.Scanner;

public class CustomerTest {
   public static void main(String[] args)
   {
		Scanner s=new Scanner(System.in);
		Customer cust1=null;
		System.out.println("Enter Customer Id");
		String custId=s.nextLine();
		System.out.println("Enter Customer Name");
		String custName=s.nextLine();
		System.out.println("Enter Customer Category");
		String custCategory=s.nextLine();
		try {
			cust1=new Customer(custName, custName, custCategory);
		} 
		catch (InvalidInputException e) {
			System.out.println(e);
		}
	}

}
