package hackerRank30days;

import java.io.*;
import java.util.*;

public class day18_QueuesAndStacks {
    // Write your code here.
	//Two instance variables: one for your stack, and one for your queue.
	Stack<Character> charStack = new Stack<>();
	Queue<Character> charQ = new LinkedList<>();
	
	
	//A void pushCharacter(char ch) method that pushes a character onto a stack.
	void pushCharacter(char ch) {
		charStack.push(ch);
	}
	
	//A void enqueueCharacter(char ch) method that 
	//enqueues a character in the queue instance variable.
	void enqueueCharacter(char ch) {
		charQ.add(ch);
	}
	
	//A char popCharacter() method that pops and returns the character 
	//at the top of the stack instance variable.
	/**
	 * pop() removes the objects at the top of this stack and return that object
	 * as the value of this function
	 * @return char at the top of stack
	 */
	char popCharacter() {
		return charStack.pop();
	}
	
	//A char dequeueCharacter() method that dequeues and 
	//returns the first character in the queue instance variable.
	/**
	 * poll() retrieves and removes the head of this queue or returns null
	 * if this queue is empty
	 * @return char at the top of queue
	 */
	char dequeueCharacter() {
		return charQ.poll();
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        day18_QueuesAndStacks p = new day18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}