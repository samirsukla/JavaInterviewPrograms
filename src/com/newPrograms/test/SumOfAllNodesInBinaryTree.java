package com.newPrograms.test;

public class SumOfAllNodesInBinaryTree {
	
	public static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right = null;
		}
		
	}
	public Node root;
	
	public SumOfAllNodesInBinaryTree() {
		root = null;
	}
	public int calculateSum(Node temp) {
		
		int sum, sumLeft, sumRight;
		sum=sumLeft=sumRight =0;
		if(root==null) {
			System.out.println("Root is empty");
			return 0;
		}
		else {
			if(temp.left!=null) {
				sumLeft=calculateSum(temp.left);
			}
			if(temp.right!=null) {
				sumRight=calculateSum(temp.right);
			}
			sum=temp.data+sumLeft+sumRight;
			return sum;
		}
		
		
	}

	public static void main(String[] args) {
		SumOfAllNodesInBinaryTree sm = new SumOfAllNodesInBinaryTree();
		sm.root = new Node(0);
		sm.root.left = new Node(0);
		sm.root.right = new Node(9);  
        sm.root.left.left = new Node(1);  
        sm.root.right.left = new Node(8);  
        sm.root.right.right = new Node(6);  
        
        System.out.println("Sum of all Nodes = "+ sm.calculateSum(sm.root));

	}

}
