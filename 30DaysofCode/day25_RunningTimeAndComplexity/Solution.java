package day25_RunningTimeAndComplexity;


import java.io.*;
import java.util.*;

/**
 * A prime is a natural number greater than 1 that has no positive divisors other
 * than 1 and itself.Given a number, n, determine and print whether it's Prime or Not prime.
 * @author sutun
 *
 */
public class Solution {

    public static void main(String[] args) {
        //The first line contains an integer, T, the number of test cases.
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.next());
        
        int[] arr = new int[testCases];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(prime(arr[j]));
        }

    }
    
    static String prime(int a) {
        String output = "Prime";
        
        if (a == 0 || a == 1) {
            output = "Not prime";
        } else {
            for (int i = 2; i <= a/2; i++) {
                if (a % i == 0) {
                    output = "Not prime";
                    break;
                }
            }
        }
        
        return output;
    }
}

