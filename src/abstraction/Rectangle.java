package abstraction;

public class Rectangle extends Shape {
	public double length;
	public double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
		
	}

}
