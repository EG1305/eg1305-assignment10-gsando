import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rectangles would you like to create?");
		int numOfRec = input.nextInt(); //gets the user's amount of rectangles

		Rectangle[] array = new Rectangle[numOfRec]; //creates an object array based on the user's choice

		for (int i = 0; i < array.length; i++) {
			Rectangle r = new Rectangle();

			System.out.print("Enter rectangle " + (i + 1) + " length: ");
			r.length = input.nextInt(); //saves the length and width for all of the objects
			System.out.print("Enter rectangle " + (i + 1) + " width: ");
			r.width = input.nextInt();

			array[i] = r; //saves object in object array
		}
		System.out.println("Here are the rectangles you created: ");

		for (int j = 0; j < array.length; j++) {
			System.out.println(
					"Rectangle " + (j + 1) + ": Area: " + array[j].getArea() + " Perimeter:" + array[j].getPerimeter());
			//calls on the methods of the rectangle class for the area and the perimeter
		}

		input.close();

	}

}
