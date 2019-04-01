
public class Rectangle {
	int length;
	int width;

	public double getArea() {

		double area = length * width;

		return area;
	}

	public double getPerimeter() {

		double perimeter = (length * 2) + (width * 2);

		return perimeter;
	}
}
