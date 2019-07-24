package module4;
import java.util.*;

public class BMI {
	
	/**
	 * @author Nikhil Mishra
	 * 6/28/19
	 * Description: This program calculates the BMI of a person from their height and weight
	 */
	
	    public static void main(String[] args) {
	    	
	        Scanner in = new Scanner(System.in);

	        System.out.print("Please enter your name (first last): ");
	        String name = in.next();
	        name += in.nextLine();
	        
	        System.out.print("Enter your weight in pounds (eg. 140): ");
	        int weight = in.nextInt();

	        System.out.print("Enter your height as feet and inches (eg. 5 11): ");
	        int feet = in.nextInt();
	        int inches = in.nextInt();

	        //the code for the conversions
	        double weightKg = weight * 0.453;
	        double heightM = (((feet * 12) + inches) * .0254);
	        double bmi = weightKg / (heightM * heightM);

	        System.out.println();
	        System.out.println("Body Mass Index Calculator");
	        System.out.println("--------------------------");	        
	        System.out.println("Name: " + name);
	        System.out.println("Height (m): " + heightM);
	        System.out.println("Weight (kg): " + weightKg);
	        System.out.println("BMI: " + bmi);
	        System.out.print("Category: ");
	        //the code for figuring out the category
	        if (bmi < 18.5 ) {
	            System.out.print("Underweight");
	        }

	        else if (bmi >= 18.5 && bmi < 25) {
	            System.out.print("Normal");
	        }

	        else if (bmi >= 25 && bmi < 30) {
	            System.out.print("Overweight");
	        }

	        else {
	            System.out.print("Obese");
	        }

	        in.close();

	    }

	}