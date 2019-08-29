package day29_BitwiseAND;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Given set S = {1, 2, 3, ..., N}. Find two integers, A and B (where A < B), from set S 
 * such that the value of A & B is the maximum possible and also less than a given integer, K . 
 * In this case, & represents the bitwise AND operator.
 * @author sutun
 *
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	// The first line contains an integer, T, the number of test cases. 
    	// Each of the T subsequent lines defines a test case as 
    	// 2 space-separated integers, N and K, respectively.
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Integer> results = new ArrayList<Integer>();
        
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int sum = bitwiseAND(n, k);
            results.add(sum);
        }

        scanner.close();  
        for (int i = 0; i < results.size(); i++) {
        	System.out.println(results.get(i));
        }
    }
    
    private static int bitwiseAND(int n, int k) {
    	int sum = 0;
    	int max = 0;
    	for (int i = 1; i <= n; i++) {
    		for (int j = i+1; j <= n; j++) {
    			sum = i & j;
    			if (sum < k) {
    				if (sum > max) {
    					max = sum;
    				}
    			}
    		}	
    	}
    	return max;
    }
}
