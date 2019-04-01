import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] user = new int[10]; //initializes user array and array to hold the distinct numbers
		int[] distinct = new int[user.length];
		int flag = 0; //flag for distinct numbers array
		
		for(int x = 0; x < user.length; x++) {
			distinct[x]=-1; //initializes to -1 so that 0 can still be printed as a distinct number
		}

		for (int i = 0; i < user.length; i++) {
			System.out.print("Enter number " + (i + 1) + " : "); //gathers choices from user
			user[i] = input.nextInt();
			
			if (isDistinct(distinct, user[i])) { //if the number is distinct, it will be stored
				distinct[flag] = user[i]; //stores the distinct numbers
				flag++; //"moves over" in distinct array for the next distinct number if applicable
			}
		}

		System.out.println("Here are the distinct numbers: ");
		
		for (int k = 0; k < distinct.length; k++) {
			 if (distinct[k] == -1) { 
					continue; //so that 0 can still be printed
				}
			System.out.print(distinct[k] + " ");
		}

		input.close();

	}

	private static boolean isDistinct(int[] distinct, int i) {
		for (int j = 0; j < distinct.length; j++) { //determines if any numbers are repeating
			if (i == distinct[j]) {
				return false; //returns false is there is a repeat
			}
		}
		return true; //returns true if the number is indeed distinct
	}
}
