package assignment1;
import java.util.Scanner;

public class Sumoftwonum {
         public static void main(String[] args) 
         {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First No :");
			int firstNo=sc.nextInt();
			System.out.println("Enter Second No :");
			int secoundNo=sc.nextInt();
			int sum=firstNo+secoundNo;
			System.out.println("Sum : "+firstNo+" + "+secoundNo+" = "+sum);
		}

	}

