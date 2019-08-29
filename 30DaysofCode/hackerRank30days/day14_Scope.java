package hackerRank30days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	/**
	 * A class constructor that takes an array of integers as a parameter and 
	 * saves it to the elements instance variable.
	 */
  	Difference(int[] inputs) {
  		this.elements = inputs;
  	}
  	
  	/**
  	 * A computeDifference method that finds the maximum absolute difference between 
  	 * any 2 numbers in N and stores it in the maximumDifference instance variable.
  	 */
  	int computeDifference() {
  		int max = 0;
  		for (int i = 0; i < elements.length; i++) {
  			for (int j = 1; j < elements.length; j++) {
  				int absDifference = Math.abs(elements[i] - elements[j]);
  				if (absDifference > max) {
  					max = absDifference;
  				}
  			}
  		}
  		maximumDifference = max;
  		return maximumDifference;
  	}

} // End of Difference class

public class day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

