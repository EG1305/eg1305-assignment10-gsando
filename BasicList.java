import java.util.ArrayList;

public class BasicList {
	public static void main(String[] args) {

		ArrayList<Integer> myArray = new ArrayList<Integer>(); //initialize array

		for (int i = 10; i < 101; i += 10) {
			myArray.add(i); //adds the elements to the array
		}

		int size = myArray.size(); //saves size of the array

		System.out.println(myArray.toString()); //prints existing array
		System.out.println("There are " + size + " elements in this array.");
		
		myArray.add(size/2, 200); //adds the 200 in the middle of the array
		
		size++;
		
		System.out.println(myArray.toString()); //prints the array
		System.out.println("There are " + size + " elements in this array.");
	}
}
