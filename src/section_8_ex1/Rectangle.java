package section_8_ex1;

public class Rectangle {
	
	public double width;
	public double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width * 2 + height * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
