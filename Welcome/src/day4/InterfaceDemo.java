package day4;
interface Shape
{
   double calculateArea();
 }
class Circle implements Shape
{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
}


public class InterfaceDemo {
	public static void main(String args[])
	{
		Circle circle=new Circle(10.0);
		System.out.println("area is...."+circle.calculateArea());
	}

}
