package module5;

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 * @author Nikhil Mishra
 * 7/4/19
 * Description: This program reads a text file containing family info and organizes it.
 */
public class Family {
	    public static void main(String[] args) throws IOException
	    {
	    	//variables
	    	int numFams = 0;
	    	int bb = 0;
	    	int gg= 0;
	    	int bg = 0;
	        String token = "";
	        //file location
	        File fileName = new File("D:/eclipse-workspace/APCS/src/module5/maleFemaleInFamily.txt");
	        Scanner inFile = new Scanner(fileName);
	        //scanning the file
	        while( inFile.hasNext() )
	        {
	            token = inFile.next( );      //read next token from file
	            if(token.equals("BB")) {
	            	bb++;
	            }
	            else if(token.equals("GG")) {
	            	gg++;
	            }
	            else{
	            	bg++;
	            }
	            numFams++;
	        }	        
	        
	        //calculations
	        double percentBB = ((double)bb / numFams) * 100;
	        double percentGG = ((double)gg / numFams) * 100;
	        double percentBG = ((double)bg / numFams) * 100;
	        DecimalFormat numberFormat = new DecimalFormat("#.##");
	        
	        //print statements
	        System.out.println("Composition statistics for families with two children.");
	        System.out.println();
	        System.out.println("Total number of families: " + numFams);
	        System.out.println();
	        System.out.println("Number of families with ");
	        System.out.println("           2 boys:   " + bb + "   represents   " + numberFormat.format(percentBB) + "%");
	        System.out.println("          2 girls:   " + gg + "   represents   " + numberFormat.format(percentGG) + "%");
	        System.out.println(" 1 boy and 1 girl:   " + bg + "   represents   " + numberFormat.format(percentBG) + "%");
	        
	        inFile.close();                 
	        
	    }
	}

