package hackerRank30days;


public class tester {
	public static void main (String[] args) {
		int n = 3;
		int result = factorial(n);
		System.out.print(result);
	}

	 // Complete the factorial function below.
    static int factorial(int n) {
        int f = 0;
      
            if (n <= 1) {
                f = 1;
            } else {
                f = n * factorial(n-1);
            }
       
        return f;

    }
   


}
