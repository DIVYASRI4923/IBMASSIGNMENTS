package day4ass;

public class Rectangle implements Polygon {
	float length;
	float breadth;
		public void calcArea()
		 {
			 System.out.println("area is--"+(length*length));
			 }
		public void calcPeri()
		 {
			 System.out.println("perimeter is"+(length+breadth));
	     }
		public float getLength() {
			return length;
		}
		public void setLength(float length) {
			this.length = length;
		}
		public float getBreadth() {
			return breadth;
		}
		public void setBreadth(float breadth) {
			this.breadth = breadth;
		}

}
