package day26_NestedLogic;


import java.io.*;
import java.util.*;

/**
 * Create a program that calculates the fine (if any).
 * 1. If the book is returned on or before the expected return date,
 *    no fine will be charged. (i.e. fine = 0)
 * 2. If the book is returned after the expected return day but 
 *    still within the same calendar month and year as the expected return date,
 *    fine = 15 Hackos x (the number of days late)
 * 3. If the book is returned after the expected return month but 
 *    still within the same calendar year as the expected return date, 
 *    the fine = 500 Hackos x (the number of months late).
 * 4. If the book is returned after the calendar year in which it was expected, 
 *    there is a fixed fine of 10000 Hackos.
 * Constraints
 *         1 <= D <= 31
 *         1 <= M <= 12
 *         1 <= Y <= 3000
 * @author sutun
 *
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] returnDate = scan.nextLine().split(" ");
        String[] expectedDate = scan.nextLine().split(" ");
        
        scan.close();
        
        int[] retDate = new int[3];
        int[] expDate = new int[3];
        
        for (int i = 0; i < returnDate.length; i++) {
            retDate[i] = Integer.parseInt(returnDate[i]);
            expDate[i] = Integer.parseInt(expectedDate[i]);
        }
        
        System.out.print(  checkFine(retDate, expDate));

    }
    
    
    static int checkFine(int [] aDate, int [] eDate) {
        int fine = 0;
        
        int retDay = aDate[0];
        int retMonth = aDate[1];
        int retYear = aDate[2];
        
        int expDay = eDate[0];
        int expMonth = eDate[1];
        int expYear = eDate[2];
        
        if (retYear > expYear) {
            fine = 10000;
        } else if (retYear == expYear) {
        	fine = 500 * (retMonth - expMonth);
   
        	if (retMonth == expMonth) {
                fine = 15 * (retDay - expDay);
            }
        	if (retMonth <= expMonth && retDay <= expDay) {
                fine = 0;
            }
        }
        
        return fine;
    }
}



