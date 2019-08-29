package hackerRank30days;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day6_Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int testCases = scan.nextInt();
    	String[] str = new String[testCases];
    	scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	// first constraint
    	if ((testCases >= 1) && (testCases <= 10)) {
    		for (int j = 0; j < testCases; j++) {
    			str[j] = scan.next();
    		}
    		for (int k = 0; k < str.length; k++) {
    			test(str[k]);
    		}
    	} else {
    		System.out.println("The number of test cases must be between 1 and 10.");
    	}
    	scan.close();
    	
    }
    
    public static void test(String str) {
    	// second constraint
    	if ((2 <= str.length()) && (str.length() <= 10000)) {
    		//
    		for (int i = 0; i < str.length(); i++) {
    			if (i % 2 == 0) {
    				System.out.print(str.charAt(i));
    			}
    		}
    		
    		System.out.print(" ");
    		
    		for (int i = 0; i < str.length(); i++) {
    			if (i % 2 == 1) {
    				System.out.print(str.charAt(i));
    			}
    		}
    		System.out.println("");
    	} else {
    		System.out.println("The length of string must be between 2 and 10000.");
    	}
    }
}
