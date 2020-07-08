/* This program will store the user inputs and
 * calculate the average, the numbers above the
 * average and the numbers below the average. */

import java.util.Scanner; //importing the Scanner in Java

public class AverageDetails {
	//Main method
	public static void main(String[] args) {
		double[] scores = new double[100]; //creating an array of 100 index
		double sum = 0; //initializing th e double variable "sum"
		int count = 0; //initializing the integer "count"

		double item; //recognizing item as a double variable

		Scanner input = new Scanner(System.in); //creating an object for the scanner input
		do { //creating a loop for asking the user input
			System.out.print("Enter a new score to continue or enter a negative number to calculate: "); //asking for the user input

			item = input.nextDouble(); //storing the values of the input in the variable item

			if (item >= 0) { //creating a loop for the non-negative numbers
				scores[count] = item; //storing the non-negative numbers in an array
				sum += item; //increasing the variable "sum" cumulatively with each value entered
				count++; //increasing the value of the count by 1, after each loop
			}
		} while (item >= 0); //limiting the input entered to a negative number
		input.close(); //closing the input
		
		System.out.println("count is " + count); //counting the total number of variables
		double average = (sum) / count; //counting the average

		int numAbove = 0; //initializing the "numAbove" variable
		int numBelow = 0; //initializing the "numBelow" variable
		for (int i = 0; i < count; i++) { //creating a loop for all of the elements in the array
			if (scores[i] >= average) { //creating an array which to save the values greater than the average
				numAbove++; //increasing the count of numAbove by one, each time the loop runs
			} else {  //creating an array which to save the values greater than the average
				numBelow++; //increasing the count of numBelow by one, each time the loop runs
			}
		}

		System.out.printf("Average is %.2f \n",average); //displaying the Average
		System.out.println("Number of scores above or equal to the average "+ numAbove); //displaying the values greater than the average
		System.out.println("Number of scores below the average " + numBelow); //displaying the values lesser than the average
	}
}
