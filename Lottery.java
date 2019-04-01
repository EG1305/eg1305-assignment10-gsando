import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		int[] user = new int[5]; //creates the arrays for both the user and the lottery array
		int[] random = new int[user.length];

		boolean same = false; //initializes to false for future loop
		int flag = 0;

		getValues(user); //gets values from user

		System.out.print("Lottery numbers: ");
		for (int x = 0; x < random.length; x++) { //initiliazes the random array to random values and prints them for the user to see
			random[x] = (int) (Math.random() * 9);
			System.out.print(random[x] + " ");
		}

		for (int j = 0; j < user.length; j++) {
			same = compareNumbers(user[j], random[j]); //if true, will add one to flag for a running total, and then prints the value
			if (same == true) {
				flag++;
				if (flag == 1) {
					System.out.print("Here are the numbers that matched: "); //prints only if there is at least one matching
				}
				System.out.print(user[j] + " ");
			}
		}
		System.out.println("\nYou matched " + flag + " numbers."); //states how many were matches

	}

	private static boolean compareNumbers(int i, int j) {
		boolean same = false;
		if (i == j) {
			same = true; //if equal will return true
		}

		return same;
	}

	private static void getValues(int[] user) { //gets values from user

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < user.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			user[i] = input.nextInt();
		}
		input.close();

	}

}
