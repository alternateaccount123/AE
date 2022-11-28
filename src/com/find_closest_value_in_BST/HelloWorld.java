package com.find_closest_value_in_BST;

import java.util.*;
//https://www.algoexpert.io/questions/find-closest-value-in-bst

//note: the particular sample case is a bst tree . but the whole thing is  just a regular binary tree . so if you change the sample it means 
// you are working with a regular binary  tree 

//test case 1  -> input : bst tree    output:13 
//fails test case 10 .
//current problem: test case sample is too big to figure out what is wrong 

class HelloWorld {

	public static void main(String[] args) {
		

		//store sample for bst 
		HelloWorld.BST t = new HelloWorld.BST (10); 
		//System.out.println(t.value);
		
		//preorder traversal like 
		HelloWorld.BST t2 = new HelloWorld.BST (5);	//level 2 
		t.left = t2;
		HelloWorld.BST t3 = new HelloWorld.BST (2);	//level 3 
		t.left.left = t3;
		HelloWorld.BST t4 = new HelloWorld.BST (1);	//level 4 
		t.left.left.left = t4;
		HelloWorld.BST t5 = new HelloWorld.BST (5);	//level 3 
		t.left.right = t5;
		HelloWorld.BST t6 = new HelloWorld.BST (15);  //level 2 
		t.right = t6;
		HelloWorld.BST t7 = new HelloWorld.BST (13);	//level 3 
		t.right.left = t7;
		HelloWorld.BST t8 = new HelloWorld.BST (14);	//level 4
		t.right.left.right = t8;
		HelloWorld.BST t9 = new HelloWorld.BST (22);	//level 3
		t.right.right = t9;


		int current_closest_value = 0;
		//function call 
		int answer = findClosestValueInBst(t,13);
		System.out.println(answer);

	}
	
	public static int findClosestValueInBst(BST tree, int target) {
		int current_closest_value = 0;
		return findClosestValueInBst(tree, target, current_closest_value);
	}
	
	

	//10,5,2,1,5,15,13,14,22
	public static int findClosestValueInBst (BST tree, int target, int current_closest_value){


		if(tree != null){

			//update closest value 
			if ( Math.abs(current_closest_value - target) > Math.abs(tree.value - target)){
				current_closest_value = tree.value;

			}
			//System.out.println(my_tree.value );
			current_closest_value = findClosestValueInBst(tree.left, target, current_closest_value);
			
			current_closest_value = findClosestValueInBst(tree.right, target, current_closest_value);
			//System.out.println(my_tree.value );
			
			

		}

		return current_closest_value;
		

	}



	static class BST { 
		public int value;
		public BST left;
		public BST right;

		public BST( int value){
			this.value = value; 
		}
	}



}