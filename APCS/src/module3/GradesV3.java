package module3;
import java.util.Scanner;

/**
 * @author Nikhil Mishra
 * 6/12/19
 * Description: This program makes a grade report from user inputs including a name, subject area, and 3 test grades.
 */

public class GradesV3 {

	public static void main(String[] args) {
		int numTests = 0; 
	    int totalPoints = 0;
	    double average = 0.0;  
		Scanner in;
        in = new Scanner(System.in);
        
        System.out.print("Enter the student's name (First Last): ");
        String firstName = in.next();
        String lastName = in.next();
        
        System.out.print("Please enter 3 of the student's grades, separated by spaces (eg. 90 100 80 ):  ");
        int testGrade = in.nextInt();
        int testGrade2 = in.nextInt();
        int testGrade3 = in.nextInt();
        
        System.out.print("Please enter the subject in which the above grades were earned:  ");
	    String subject = in.next();
	    System.out.println();
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    System.out.println("                                 Grade Report                                   ");
	    System.out.println();
	    System.out.print("Name: " + lastName + ", " + firstName);	
	    System.out.println("                        Subject: " + subject);
	    System.out.println();
	    System.out.println("Test Grades: ");
            

        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        totalPoints += testGrade2;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade2);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        

        totalPoints += testGrade3;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("    Test Grade: " + testGrade3);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);

	}

}
