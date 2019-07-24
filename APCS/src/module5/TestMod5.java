package module5;

import java.util.Random;

//import java.util.Scanner;

public class TestMod5 {

	public static void main(String[] args) {
		/*
		 * int blue = 0; int red = 0; int yellow = 0; int green = 0; int flipCount = 0;
		 * int totalFlips = 0; double randNum = 0.0;
		 * 
		 * totalFlips = 15;
		 * 
		 * while(flipCount < totalFlips) { randNum = Math.random();
		 * System.out.print((flipCount+1) + "\t");
		 * 
		 * if(randNum <= 0.25) //change to < 0.3 { blue++; System.out.println("Blue!");
		 * } else if(randNum > 0.25 && randNum <= 0.5) { red++;
		 * System.out.println("Red!"); } else if(randNum > 0.5 && randNum <= 0.75) {
		 * yellow++; System.out.println("Yellow!"); } else { green++;
		 * System.out.println("Green!"); } flipCount++;
		 * 
		 * }//end while System.out.println(); System.out.println("Number of Blue = " +
		 * blue); System.out.println("Number of Red = " + red);
		 * System.out.println("Number of Yellow = " + yellow);
		 * System.out.println("Number of Green = " + green);
		 * 
		 * int x = 0; while(x < 20) { x += 3; } System.out.println(x);
		 * 
		 * int userGuess = 1; int secretNumber = 2; while(userGuess != secretNumber)
		 * System.out.println("no");
		 * 
		 * // String answer = "N";
		 * 
		 * // while(!answer.equals( "N")) // { // System.out.println("no"); // }
		 */	
		
	
		/*
		 * String lotteryNum = "456"; //String lotteryFrontPair = lotteryNum
		 * .substring(0, 2); //String lotteryBackPair = lotteryNum.substring(2); String
		 * userPick = "123"; String lotteryFrontPair = lotteryNum.substring(0, 2);
		 * String lotteryBackPair = lotteryNum.substring(1); String userFrontPair =
		 * userPick.substring(0, 2); String userBackPair = userPick.substring(1);
		 * System.out.println(lotteryBackPair); System.out.println(lotteryFrontPair);
		 * System.out.println(userBackPair); System.out.println(userFrontPair);
		 * 
		 * if( userBackPair.equals(lotteryBackPair) ) {System.out.println("e");}
		 * 
		 * else if( userFrontPair.equals(lotteryFrontPair) ) {System.out.println("f");}
		 * else if( userPick == lotteryNum ) {System.out.println("g");}
		 * 
		 * int lotNumLength = 3; for(int n = 1; n < lotNumLength; n++)
		 * {System.out.println("g");}
		 * 
		 * for(int n = 1; n <= lotNumLength; n++) {System.out.println("h");} for(int n =
		 * 0; n < lotNumLength; n++) {System.out.println("j");}
		 */
		int countFlip = 0;
		//for(int outer = 0; outer < 4; outer++)
		//{
		//   for(int inner = 0; inner < 5; inner++)
		 //  {
		//      System.out.print("*");
		//   }
		 //  System.out.println();}
		   
		 //  for(int t = 0; t < 10; t++) {
		//	     for(int f = 0; f < 1000; f++) {
		//	    	 countFlip++;
		//	     }
		 //  System.out.println(countFlip);
		 //  }
		   
	//	   Random rand = new Random();
	//	   int randomNum = rand.nextInt(5);
	//	   System.out.println(randomNum);
		
		   

//int a = 6;
//int b = 0;
//while (a < 20)
///{
 //  b = 10;
///   while (b > a)
//   {
 //     b--;
//    }
//    a += b;
 //  }
//System.out.println(a);
	    double[] a = { 3.5, -1.0, 7.8 }; 
	    int t = 0; 

	    for ( double b : a ) 
	    { 
	      t += (int)b; 
	    }
		System.out.println(t);
		
	}
}
	


