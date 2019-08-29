package hackerRank30days;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day9_Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {
    	int f = 0;
    	if ( (2 <= n) && (n <= 12)) {
    		if (n <= 1) {
    			f = 1;
    		} else {
    			f = n * factorial(n-1);
    		}
    	} else {
    		f = 0;
    	}
    	return f;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
