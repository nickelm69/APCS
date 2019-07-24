package module4;

//import java.util.Scanner;

public class TestMod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 10;
		//if(x + 1 < 20)
		//    x += 5;
		//System.out.println(x);
		//int num = 20;
		String word1 = "busy";
		String word2 = "be";
		System.out.println(word2.compareTo(word1));
		//Scanner in = new Scanner(System.in);
		
		//String genderString = "F";
		//char gender = genderString.charAt(0);
		//boolean isFemale = gender == "F";
		//String ageString = "13";
		//int age = Integer.parseInt(ageString);
		//String genderString = in.nextChar();
		//String ageString = in.nextInt();
		//String heightInchesString = in.next();
		//double heightIn = 3.5;
		//double heightCm = 2.54 * heightIn ;
		//System.out.println(heightCm);
		//double weightKg = 5.4;
		//double BMR = 2.5;
		//System.out.println("Weight (kg): " + (int)(10 * weightKg )/10.0 );
		//System.out.println("Height (cm): " + (int)(10 * heightCm)/10.0 );
		//System.out.println("Basal Metabolic Rate: " + (int)(10 * BMR)/10.0 );
		
		String word = "starfish";
		String x = word.substring(4);
		String y = word.substring(3, 8);
		if( x == y)
		   System.out.print(1);
		else if( x.equals(y))
		   System.out.print(2);
		else
		   System.out.print(3);
	
	
	}

}
