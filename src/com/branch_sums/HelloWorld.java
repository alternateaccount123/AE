package com.branch_sums;

import java.util.ArrayList;
import java.util.List;

//binary tree sample case
class HelloWorld {

	public static void main(String[] args) {

		// store
		HelloWorld.BinaryTree t = new HelloWorld.BinaryTree(1);
		// System.out.println(t.value);

		// preorder traversal like
		HelloWorld.BinaryTree t2 = new HelloWorld.BinaryTree(2); 
		t.left = t2;
		HelloWorld.BinaryTree t3 = new HelloWorld.BinaryTree(4); 
		t.left.left = t3;
		HelloWorld.BinaryTree t4 = new HelloWorld.BinaryTree(8);
		t.left.left.left = t4;
		HelloWorld.BinaryTree t5 = new HelloWorld.BinaryTree(9); 
		t.left.left.right = t5;
		HelloWorld.BinaryTree t6 = new HelloWorld.BinaryTree(5); 
		t.left.right = t6;
		HelloWorld.BinaryTree t7 = new HelloWorld.BinaryTree(10); 
		t.left.right.left = t7;
		HelloWorld.BinaryTree t8 = new HelloWorld.BinaryTree(3); 
		t.right = t8;
		HelloWorld.BinaryTree t9 = new HelloWorld.BinaryTree(6); 
		t.right.left = t9;
		HelloWorld.BinaryTree t10 = new HelloWorld.BinaryTree(7); 
		t.right.right = t10;

		// function call
		ArrayList <Integer> answer = new ArrayList <Integer>();
		answer = branchSums(t);
		System.out.println(answer);

	}
	
	//override
	public static ArrayList<Integer> branchSums(BinaryTree root){
		int accumulated_num = 0;
		ArrayList <Integer> arrl = new ArrayList <Integer>();
		return arrl = branchSums(root, accumulated_num, arrl);
	}

    //1,2,4,8,9,5,10,3,6,7
	public static ArrayList<Integer> branchSums(BinaryTree my_tree, int accumulate, ArrayList<Integer> array) {

		
		if (my_tree != null) {
			
			
			accumulate = accumulate + my_tree.value;
			
			//store when you reach leaf at last level of each branch 
			if (my_tree.right == null && my_tree.left == null) {
				array.add(accumulate);
			}
			
			
			//System.out.println(my_tree.value);
			array = branchSums(my_tree.left, accumulate, array);

			array = branchSums(my_tree.right, accumulate, array);
			//System.out.println(my_tree.value);

		}
		
		return array;

	}

	public static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

}