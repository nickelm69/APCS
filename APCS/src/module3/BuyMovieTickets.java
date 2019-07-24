package module3;
import java.util.*;

public class BuyMovieTickets {

/**
 * @author Nikhil Mishra
 * 6/12/19
 * Description: This program makes an e-Reciept for a movie purchase from user-inputted fields.
 */

		public static void main(String[] args) {
			
			Scanner in;
	        in = new Scanner(System.in);
	        
	        System.out.print("Please enter your name (First Last): ");
	        String firstName = in.next();
	        String lastName = in.next();
	        
	        System.out.print("Please enter today's date (mm/dd/yyyy): ");
	        String date = in.next();
	        
	        System.out.print("Please enter the movie you would like to see: ");
	        String movieName = in.next();
	        movieName += in.nextLine();
	        
	        System.out.print("Please enter the amount of tickets of want to purchase: ");
	        int ticketAmt = in.nextInt();
	        
	        System.out.print("Please enter the ticket price: ");
	        double ticketPrice = in.nextDouble();
	        
	        System.out.print("Please enter your credit card number (#####-###-####): ");
	        String credCard = in.next();
	        
	        System.out.print("Please enter your credit card pin (####): ");
	        @SuppressWarnings("unused")
			String pin = in.next();
	        
	        //date
	        String mm = date.substring(0, 2);
	        String dd = date.substring(3, 5);
	        String yyyy = date.substring(6, 10);
	        String mmddyyyy =  mm + "-" + dd + "-" + yyyy;
	        
	        //first initial
	        String firstInitial = firstName.substring(0, 1);
	        
	        //last 4 digits of credit card number
	        String acctNum = credCard.substring(10, 14);
	        
	        //cost of movie
	        double totalPrice = ticketAmt * ticketPrice;
	        
	        //output
		    System.out.println();
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("                                Your e-Reciept                                  ");
		    System.out.println();
		    System.out.println("Date: " + mmddyyyy);	
		    System.out.println("Order Number: 2n68b");
		    System.out.println();
		    System.out.println("  "+ firstInitial +". "+lastName);
		    System.out.println("  Account Number: #####-###-"+acctNum);
		    System.out.println("  Movie: " + movieName);
		    System.out.println("  Number of Tickets: " + ticketAmt);
		    System.out.println("  Ticket Price: " + ticketPrice);
		    System.out.println();
		    System.out.println("  $" + totalPrice + " will be charged to your account.");
		    System.out.println();
		    System.out.println("  Thank you. Enjoy your movie!");
		    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");    

		    in.close();
		}

	}
