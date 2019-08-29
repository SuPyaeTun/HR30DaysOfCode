package day20Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day20_Sorting {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        // n = num of elements in array 'a'
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }

	        in.close();
	        
	        int numOfSwaps = 0;
	        for (int i = 0; i < a.length; i++) {
	        	
	        	for (int j = 0; j < a.length - 1; j++) {
	        		if ( a[j] > a[j+1]) {
	        			System.out.print("a[" + j + "] =" + a[j] + " ");
	        			System.out.print("a[" + j+1 + "] =" + a[j+1] + " ");
	        			int sub = a[j];
                        a[j] = a[j+1];
                        a[j+1] = sub;
	        			++numOfSwaps;
	        			System.out.println("Number of Swaps: " + numOfSwaps);
	        		}
	        	}
	        	if (numOfSwaps == 0) {
	        		break;
	        	}
	        }
	        
	        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
	        System.out.println("First Element: " + a[0]);
	        System.out.println("Last Element: " + a[a.length-1]);
	       
	    }
	 
	 static void swap(int x, int y) {
		 int z = x;
		 x = y; 
		 y = z;
	 }
}
