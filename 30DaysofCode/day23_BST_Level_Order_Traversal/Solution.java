package day23_BST_Level_Order_Traversal;

import java.util.*;
import java.io.*;

//*************************************************************************
//*************************************************************************

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

// *************************************************************************
//*************************************************************************

class Solution{

	/**
	 * To visit each level of a tree's nodes from left to right, top to bottom and
	 * print the level-order traversal of the binary search tree
	 * @param root
	 */
static void levelOrder(Node root){
	
	Queue<Node> queue = new LinkedList<>();
	
	if (root != null) {
		queue.add(root);
	}
	
	do {
		Node cur = queue.remove();
		System.out.print(cur.data + " ");
		if (cur.left != null) {
			queue.add(cur.left);
		}
		if (cur.right != null) {
			queue.add(cur.right);
		}
		
	} while (!queue.isEmpty());
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}