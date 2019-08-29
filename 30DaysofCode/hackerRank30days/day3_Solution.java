package hackerRank30days;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day3_Solution {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
      //solution
        if (( 1 <= N) && ( N <= 100)) {
            if (N % 2 == 1) {
                System.out.println("Weird");
            } else {
                if ((2 <= N) && (N <= 5)) {
                    System.out.println("Not Weird");
                } else if ((6 <= N) && (N <= 20)) {
                    System.out.println("Weird");
                } else if ( N > 20) {
                    System.out.println("Not Weird");
                }
            }
        } else {
            System.out.println("Inputs need to be between 1 and 100.");
        }
        
        scanner.close();
    }
}
