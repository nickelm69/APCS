package module5;

import java.io.*;
import java.util.*;

/**
 * @author Nikhil Mishra
 * 7/17/19
s * Description: This program writes random numbers 0-9 to a text file and then reads from that file to find the amount of times that the 
 * number 9 (which in this case represents the Fox Squirrel) occurs as opposed to all the other numbers.
 */

public class AnimalPopulation {

	public static void main(String[] args) throws IOException {
		// PART 1
		
		PrintWriter outfile = new PrintWriter(new File("AnimalType.txt"));
		Scanner in = new Scanner(System.in);
		
		int triedAmt = 0;
		int rightAmt = 0;

		
		System.out.println("Welcome to the Fox Squirrel Simulator");
		System.out.println();
		System.out.println("How Many Trials should be simulated?");
		System.out.println("Enter a value greater than or equal to 1000: ");
		
		int trials = in.nextInt();
		
		while (trials <= 999) {
			System.out.println();
			System.out.println(" Please try again. Enter a number greater than or equal to 1000.");
			System.out.println();
			System.out.println("How Many Trials should be simulated?");
			System.out.println("Enter a value greater than 1000: ");
			trials = in.nextInt();
		}
		
		for (int loop = 1; loop <= trials; loop++) {
			int randType = (int) (Math.random() * 10);
			outfile.println(randType);
		}
		
		outfile.close();
		
		// PART 2
		
		Scanner fileIn = new Scanner(new File ("AnimalType.txt"));
        
		int typeTrial;
		
        while (fileIn.hasNextInt()) {
            typeTrial = fileIn.nextInt();
            	if (typeTrial == 9) {
            		rightAmt++;
            		triedAmt++;
            	}
            	else {
            		triedAmt++;
            	}
            }
		System.out.println();
		System.out.print("Simulating trials now... ");
		//code to make the program wait
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		}
		System.out.println("One moment please... ");
		//code to make the program wait
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("The results!");
		System.out.println("The average number of squirrels observed until spotting a Fox Squirrel at the city park is : "
		+ ((double)rightAmt / triedAmt) * 100);
		
		in.close();
		fileIn.close();
	}
}
