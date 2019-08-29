package day28_RegEX_Patterns_Databases;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Consider a database table, Emails, which has the attributes First Name and Email ID. 
 * Given N rows of data simulating the Emails table, print an alphabetically-ordered list 
 * of people whose email address ends in @gmail.com.
 * @author sutun
 *
 */
public class Solution {
    
    /**
     * To print  an alphabetically-ordered list of first names for every user with a gmail account. 
     * Each name must be printed on a new line.
     *         first names - [a-z]only, length is no longer than 20
     *         email ID - [a-z], @ and . only. Length is no longer than 50
     * @param db - String array which has the first name and the email address
     * @return the alphabetically ordered list of first name of gmail users
     */
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> nameList = new ArrayList();
        
        String regEx = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(regEx);
        
        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher m = p.matcher(email);
            if (m.find()) {
                nameList.add(name);
            }
        }
        
        Collections.sort(nameList);
        for (String s : nameList) {
            System.out.println(s);
        }
        
    }
}

