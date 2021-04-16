package day4ass;

public class Square implements Polygon
{
	 float side;
	 
	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	public void calcArea()
	 {
		 System.out.println("area is--"+(side*side));
		 }
	public void calcPeri()
	 {
		 System.out.println("perimeter is"+(side+side));
     }
	 
}
