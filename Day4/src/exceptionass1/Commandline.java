package exceptionass1;

public class Commandline {

	public static void main(String[] args)
	{
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		try
		{
		  int result=a/b;
		  System.out.println("divison of two numbers:"+result);
		}
		catch(ArithmeticException aie)
		{
			System.out.println("Divison with Zero is not possible");
		}
		catch(NumberFormatException nie)
		{
			System.out.println("only integers are allowed");
		}

	}

}
