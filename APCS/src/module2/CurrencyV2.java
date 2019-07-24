package module2;

/**
 * Project title: 02.07 Pitfalls, Surprises, and Shortcuts
 * @author Nikhil Mishra
 * 6/11/19
 * Description: This program determines the costs of a trip to 3 countries with their own unique currencies.
 */

public class CurrencyV2
{
    public static void main(String [ ] args)
    {
        double startingUSDollars = 6500.00;		
        double pesosSpent = 7210.25;            
        double pesoExchangeRate = 19.12;    
        double yensSpent = 99939.75;		
        double yenExchangeRate = 108.49;	
        double eurosSpent = 696.69;			
        double euroExchangeRate =  0.88;	
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;   
        double dollarsSpentInJapan = yensSpent / yenExchangeRate;	
        double dollarsSpentInEurope = eurosSpent / euroExchangeRate;
        double remainingUsDollars = startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope;    
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Starting US Dollars:          " + startingUSDollars);
        System.out.println();
        System.out.println("Mexico: ");
        System.out.println("  Pesos Spent:                " + pesosSpent);
        System.out.println("  US dollars equivalent:      " + dollarsSpentInMexico);
        System.out.println("  US dollars remaining:       " + (startingUSDollars - dollarsSpentInMexico));
        System.out.println();
        System.out.println("Japan: ");
        System.out.println("  Yen Spent:                  " + yensSpent);
        System.out.println("  US dollars equivalent:      " + dollarsSpentInJapan);
        System.out.println("  US dollars remaining:       " + (startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan));
        System.out.println();
        System.out.println("Europe: ");
        System.out.println("  Euros Spent:                " + eurosSpent);
        System.out.println("  US dollars equivalent:      " + dollarsSpentInEurope);
        System.out.println("  US dollars remaining:       " + (startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope));
        System.out.println("================================================");
        System.out.println("Remaining US Dollars:         " + remainingUsDollars);
        
        //I didnt want to kepp adding println's so i just added a while loop :)
        int i = 0;
        while (i < 4) {
          System.out.println();
          i++;
        }
        
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int costItem1 = 12;  					
		int budget1 = 100;   		
		int totalItem1 = budget1 / costItem1;
		int fundsRemaining1 = budget1 % totalItem1; 

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		double costItem2 = 29.99;  						
		int budget2 = 500;   							
		int totalItem2 = (int) (budget2 / costItem2); 	
		double fundsRemaining2 = budget2 - (costItem2 * totalItem2);  

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class