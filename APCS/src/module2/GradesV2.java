package module2;


/**
 * Project title: 02.07 Pitfalls, Surprises, and Shortcuts
 * @author Nikhil Mishra
 * 6/10/19
 * Description: This program determines your test score average from 9 test scores.
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
    	//local variables 
    	int numTests = 0; 
    	int testGrade = 0; 
    	int totalPoints = 0;
    	double average = 0.0;
               
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //my own test scores:  
        
        testGrade = 79;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        testGrade = 52;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);

        testGrade = 99;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);

        testGrade = 98;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        testGrade = 179;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("Test # " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);

    }//end of main method
}//end of class