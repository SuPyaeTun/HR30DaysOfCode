package hackerRank30days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
    
        /* Declare second integer, double, and String variables. */
        String var = "";

        System.out.println("type the string: ");
        
        /* Read and save an integer, double, and String to your variables.*/
        var = scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        System.out.println( s + var);

        scan.close();
    }
}
