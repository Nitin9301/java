package first;

 class Rect {
	public double hight;
	public double width;
	 
	public Rect(double h, double w) {
		hight=h;
		width=w;
	}
	public double rectarea() {
		return hight*width;
	}
	public double rectperi() {
		return 2*(hight+width);
	}
	
 }
public class Rectangle{
	public static void main(String[] args) {
		Rect Rectangle= new Rect(5.0,3.0);
			double area=Rectangle.rectarea();
			double perimeter=Rectangle.rectperi();
			System.out.println("Area of rectangle: " + area);
	        System.out.println("Perimeter of rectangle: " + perimeter);
		}
	}


