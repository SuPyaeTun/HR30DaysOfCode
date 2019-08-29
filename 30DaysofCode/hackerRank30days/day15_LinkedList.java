package hackerRank30days;

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class day15_LinkedList {

	/**
	 * Complete the insert function in your editor so that 
	 * it creates a new Node (pass data as the Node constructor argument) and 
	 * inserts it at the tail of the linked list referenced by the head parameter. 
	 * Once the new node is added, return the reference to the head node.
	 * If the head argument passed to the insert function is null, 
	 * then the initial list is empty.
	 * @param head
	 * @param data
	 * @return
	 */
    public static  Node insert(Node head,int data) {
        //Complete this method
    	
    	if (head == null) {
    		return new Node(data);
    	}
    	
    	// if head.next is empty, head is the last node or tail 
    	if (head.next == null) {
    		head.next = new Node(data);
    	} else {
    		insert (head.next, data);
    	}
    	return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}