package hackerRank30days;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
  public static void main(String []argh){
      
	  //HashMap
	  Map<String, String> phoneBook;
	  
	  
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      phoneBook = new HashMap<String, String>(n);
      
      for(int i = 0; i < n; i++){
          String name = in.next();
          String phone = in.next();
          // Write code here
          phoneBook.put(name, phone);
      }
      
      ArrayList<String> queries = new ArrayList<String>();
      while(in.hasNext()){
          String s = in.next();
          // Write code here
          queries.add(s);
      }
      in.close();
      
      // for queries
      for (String i : queries) {
    	  if (phoneBook.containsKey(i)) {
    		  System.out.println( i + "=" + phoneBook.get(i));
    	  } else {
    		  System.out.println("Not found");
    	  }
    	 
      }
  }
}

