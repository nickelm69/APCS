package module3;

import java.util.Scanner;

public class TestModule3 {

	public static void main (String [] args) {
		
		String name = "Shakespeare";
		String newStr = name.substring(2,6);
		System.out.println(newStr);
		
		String ageInMinutes = null;
		System.out.print("/tab Age in Minutes: " + ageInMinutes + "/n");
		System.out.print("/t Age in Minutes: " + ageInMinutes + "/n");
		System.out.print("\t Age in Minutes: " + ageInMinutes + "\n");
		
		Scanner in = new Scanner(System.in);
		//System.out.print("Please enter your name (first last): ");
		//String firstName = in.next();
	
		//String userAge = in.next();
		//String ageInYears = Integer.parseInt(userAge);
		//double approxAgeInDays = ageInYears * 365.25;
		
		//String firstname = in.next();
		//String lastName = in.NextLine();
		//System.out.print("\n");
		
		//String firstInitial = firstName.substring(0,1);
		//String lastname = in.NextLine();
		//String Name = firstInitial + ". " + lastname;
		
		//System.out.print("Please enter your age in years: ");
		//String userAge = in.next();
		//int ageInYears = integer.ParseInt(userAge);
		
		//String firstName = in.next();
		//String lastName = in.nextLine();
		//System.out.print("/n");
		
		//String firstName = null;
		//String firstInitial = firstName.subString(0,3);
		//String lastName = in.nextLine();
		//String Name = firstInitial + ". " + lastName;
		
		//int x = 2.5; 
	   // int y = (2 * x); 
	   // int z = y / 2; 
		
		
	   // double a = 0.1; 
	   // double b = 3.14; 
	    //a += b; 
	    String a = "Mathematics"; 
	    String b = "Computer Science"; 
	    String c = (a + " and " + b); 
	  //  int n = c.length(); 
	  //  int m = a.indexOf( "the" ); 
	  //  int p = a.indexOf( "math" ); 
	  //  String d = b.substring( 3, 5 ); 
	  //  String e = b.substring( b.indexOf( "S" ) ); 
	    
	   // System.out.println(n);
	    //System.out.println(m);
	    //System.out.println(p);
	    //System.out.println(d);
	    //int number = 4 + 20 % 8;
	    //System.out.println((20 + 3) / 3);
	    
	    String str = "Florida Keys";
	    System.out.println(str.indexOf("eys"));
	    
	    String str1 = "FloridaState";
	    String str2 = "Seminoles";
	    System.out.println(str1 + str2);
	    
	    int num = 5;
	    num += 20; 
	    System.out.println(num);
	    
	    int grade1 = 88;
	    int grade2 = 92;
	    int grade3 = 83;
	    
	    System.out.println((grade1 + grade2 + grade3) / 3.0);
	    
	    int counter= 2;
	    counter=counter + 1;
	    System.out.println((double)(9 / 2));
	    
	    
	    
	    
	    
	}
}
