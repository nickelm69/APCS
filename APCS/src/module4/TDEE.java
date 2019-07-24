package module4;

/**
 * @author Nikhil Mishra
 * 7/1/19
 * Description: This program calculates a persons TDEE from user-inputted fields.
 */
import java.util.Scanner;

public class TDEE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your name (first last): ");
		String name = in.next();
		name += in.nextLine();

		System.out.println("Please enter your BMR: ");
		double bmr = in.nextDouble();

		System.out.println("Please enter your gender (M/F): ");
		String gender = in.next().toUpperCase();

		System.out.println("Select Your Activity Level");
		System.out.println("[A] Resting (Sleeping, Reclining)");
		System.out.println("[B] Sedentary (Minimal Movement)");
		System.out.println("[C] Light (Sitting, Standing)");
		System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
		System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
		System.out.println("[F] Extremely Active (Full-Active, Heavy Manual Labor)");
		System.out.println();
		System.out.print("Enter the letter corresponding to your activity level: ");
		String activity = in.next().toUpperCase();

		System.out.println();
		double activityFactor = 0.0;

		if (activity.equals("A"))
			activityFactor = 1.0;
		else if (activity.equals("B"))
			activityFactor = 1.3;
		else if (activity.equals("C") && gender.equals("M"))
			activityFactor = 1.6;
		else if (activity.equals("C") && gender.equals("F"))
			activityFactor = 1.5;
		else if (activity.equals("D") && gender.equals("M"))
			activityFactor = 1.7;
		else if (activity.equals("D") && gender.equals("F"))
			activityFactor = 1.6;
		else if (activity.equals("E") && gender.equals("M"))
			activityFactor = 2.1;
		else if (activity.equals("E") && gender.equals("F"))
			activityFactor = 1.9;
		else if (activity.equals("F") && gender.equals("M"))
			activityFactor = 2.4;
		else if (activity.equals("F") && gender.equals("F"))
			activityFactor = 2.2;
		else {
			System.out.println("Your selection was invalid, as a non-menu item was entered.");
			in.close();
			return;
		}
		double tdee = bmr * activityFactor;
		System.out.println();
		System.out.println();
		System.out.println("Your Results:");
		System.out.print("Name: " + name + "             ");
		System.out.println("Gender: " + gender);
		System.out.print("BMR: " + bmr + "              ");
		System.out.println("Activity Factor: " + activityFactor);
		System.out.println("TDEE: " + tdee + " calories");

		in.close();

	}
}