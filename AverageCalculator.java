import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int userInput = 0;
		int sum = 0;
		int x = 0;

		System.out.println("You're creating a square array. What do you want the "
				+ "dimensions to be? Enter a number between 1 and 10. "
				+ "(For a 2x2 array, enter 2, for a 7x7 array, enter 7, etc.)");

		try {
			x = scan1.nextInt();
			
			while (x<1 || x>10) {
				System.out.println("Invalid input. Please enter a number between 1 and 10.");
				x = scan1.nextInt();

			}
			
			
			int[][] array = new int[x][x];
				System.out.println("Ok. Start filling your array with numbers.");

				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						System.out.println("Enter a number:  ");
						userInput = scan1.nextInt();
						array[i][j] = userInput;
					}
				}
				for (int i = 0; i < array.length; i++) {
					sum = array[i][i] + sum;
				}
				// calculate average
				calculateAverage(sum, array);

		} catch (Exception g) {
			System.out.println("ERROR! WORLD IS ENDING! SEEK COVER IMMEDIATELY");
		
		scan1.close();	
		}
	}

	public static void calculateAverage(int sum, int[][] array) {
		double average;
		average = sum / array.length;
		System.out.println("The average of the diagonal numbers is " + average + ".");
	}
}
