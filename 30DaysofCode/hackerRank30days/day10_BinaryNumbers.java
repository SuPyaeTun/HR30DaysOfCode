package hackerRank30days;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day10_BinaryNumbers {
	
	static int binary(int n) {
		int max = 0;
		ArrayList<Integer> biNumbers = new ArrayList<Integer>();
		
		while (n > 0) {
			int reminder = n % 2;
			biNumbers.add(reminder);
			n = n / 2;
		}
		
		int counter = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < biNumbers.size(); i++) {
			if (biNumbers.get(i) == 1) {
				++counter; 
			} else {
				counter = 0;
				list.add(counter);
			}
			list.add(counter);
		}
		max = Collections.max(list);
		return max;
	}
	
	

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(binary(n));
        scanner.close();
       
    }
}
