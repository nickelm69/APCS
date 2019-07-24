package module2;

/**
 * @author Nikhil Mishra
 * 6/10/19
 * Description: The Calculations class performs addition, subtraction,
 * multiplication, division, and % operations on integers and
 * decimals.
 */

public class CalculationsV6
{
	
    public static void main(String[ ] args)
    {
    	
    	int iNum25 = 25;
    	int iNum9 = 9;
    	double dNum43 = 43.21;
    	double dNumPi = 3.14;
    	double dNum10 = 10.0;
    	int iNum11 = 11;
    	
        // Addition
        System.out.println("Addition");
        System.out.println(iNum25 + " + " + iNum9 + " = " + (iNum25 + iNum9));
        System.out.println(dNum43 + " + " + dNumPi +" = "+ (dNum43 + dNumPi));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("11 - 9 - 25 = " + (iNum11 - iNum9 - iNum25 ));
        System.out.println("3.14 - 10.0 = "  + (dNumPi - dNum10 ));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("25 * 9 = " + (iNum25 * iNum9 )); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (dNumPi * dNum10 * dNum10 ));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("9 / 25 = " + (iNum9 / iNum25 ));
        System.out.println("43.21 / 10.0 = " + (dNum43 / dNum10 ));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("11 % 9 = " + (iNum11 % iNum9 ));
        System.out.println("10.0 % 3.14 = " + (dNum10 % dNumPi ));
        System.out.println();
        
        // 2.03 Additional int Equations
        
        System.out.println("2.03 Additional int Equations");
        System.out.println("11 + (25 % 9) = "+(iNum11 + (iNum25 % iNum9)));
        System.out.println("25 + (9 % 11) = "+(iNum25 - (iNum9 / iNum11)));	
        System.out.println("9 + (11 % 25) = "+(iNum9 / (iNum11 * iNum25)));
        System.out.println();
        
        //2.04 Additional double Equations
        
        System.out.println("11 + (10.0 % 43.3) = "+(iNum11 + (dNum10 % dNum43)));
        System.out.println("234 - (234 / 6 % 12) + 3 = " + (iNum25 / (dNumPi / iNum9 % dNum43) + iNum11));
        System.out.println("(10.0 / 43.21) - 25 + 9 % (3.14 * 25) = " + ((dNum10 / dNum43) - iNum25 + iNum9 % (dNumPi * iNum25)));       
        
    } // end of main method
} // end of class