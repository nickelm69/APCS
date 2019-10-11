package module6;

/**
 * @author Nikhil Mishra
 * 8/14/19
 * Description: This program takes a set of data from an array, processes it, then displays the data in a formatted matter.
 */
import java.util.Scanner;

public class AnnualWeatherV2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String city = "Miami";
		String state = "Florida";

		String month[] = { "Jan", "Feb", "Mar", "Apr", "Mat", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double temperature[] = { 68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9 }; 
		double precipitation[] = { 1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2 }; 

		// double temperature[] = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8 };
		// double precipitation[] = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};

		String tempLabel = "F";
		String precipLabel = "cm";

		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();
		
		//conversions
		if (tempChoice.equalsIgnoreCase("C")) {
			tempLabel = "(C)";
			for (int index = 0; index < temperature.length; index++) {
				temperature[index] = 5.0 / 9 * (temperature[index] - 32);
			}
		}

		if (precipChoice.equalsIgnoreCase("c")) {
			precipLabel = "(cm)";
			for (int index = 0; index < precipitation.length; index++) {
				precipitation[index] = 2.54 * precipitation[index];
			}
		}

		double average;
		double sumAverage = 0;
		double annual = 0;
		for (int index = 0; index < temperature.length; index++) {
			sumAverage += temperature[index];
		}
		average = sumAverage / temperature.length;
		for (int index = 0; index < precipitation.length; index++) {
			annual += precipitation[index];
		}

		System.out.println();
		System.out.printf("%27s%n", "Climate Data");
		System.out.printf("%39s%n", "Location: " + city + ", " + state + "\n");
		System.out.printf("%5s %18s %s %18s %s %n", "Month", "Temperature", tempLabel, "Precipitation", precipLabel);
		System.out.printf("***************************************************%n");
		for (int i = 0; i < temperature.length && i < precipitation.length; i++) {
			System.out.printf("%-5s%18.1f%21.1f%n", month[i] + ".", temperature[i], precipitation[i]);
		}
		System.out.printf("***************************************************%n");
		System.out.printf("%8sAverage: %-10.1f Annual: %.1f", "", average, annual);
		in.close();
	}
}