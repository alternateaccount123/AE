package com.find_closest_value_in_BST;

import java.util.*;
//https://www.algoexpert.io/questions/find-closest-value-in-bst


//note: the particular sample case is a bst tree . but the whole thing is  just a regular binary tree . so if you change the sample it means 
// you are working with a regular binary  tree 

//test case 1  -> input : 13    expectedoutput: 13   output:13 
//fails test case 10 .
//test case 10 -> input : -1    expectedoutput: 1   output:1 solved at init of cur_closest_value


class HelloWorld {

	public static void main(String[] args) {
		
		
		//store sample for bst 
        HelloWorld.BST t = new HelloWorld.BST (100); 
        //System.out.println(t.value);        
        //preorder traversal like 
        t.left =  new HelloWorld.BST (5);
        t.left.left =  new HelloWorld.BST (2);
        t.left.left.left =  new HelloWorld.BST (1);
        t.left.left.left.left =  new HelloWorld.BST (-51);
        t.left.left.left.left.left =  new HelloWorld.BST (-403);
        t.left.left.left.right =  new HelloWorld.BST (1);
        t.left.left.left.right.right =  new HelloWorld.BST (1);
        t.left.left.left.right.right.right =  new HelloWorld.BST (1);
        t.left.left.left.right.right.right.right =  new HelloWorld.BST (1);
        t.left.left.right =  new HelloWorld.BST (3);
        t.left.right =  new HelloWorld.BST (15);
        t.left.right.left =  new HelloWorld.BST (5);
        t.left.right.right =  new HelloWorld.BST (22);
        t.left.right.right.right =  new HelloWorld.BST (57);
        t.left.right.right.right.right =  new HelloWorld.BST (60);        
        t.right =  new HelloWorld.BST (502);
        t.right.left =  new HelloWorld.BST (204);
        t.right.left.left =  new HelloWorld.BST (203);
        t.right.left.right =  new HelloWorld.BST (205);
        t.right.left.right.right =  new HelloWorld.BST (207);
        t.right.left.right.right.left =  new HelloWorld.BST (206);
        t.right.left.right.right.right =  new HelloWorld.BST (208);
        t.right.right =  new HelloWorld.BST (55000);
        t.right.right.left =  new HelloWorld.BST (1001);
        t.right.right.left.right =  new HelloWorld.BST (4500);
	    
		/*
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
		*/
		
        int input_value = -1;
		//function call 
		int answer = findClosestValueInBst(t,input_value);
		System.out.println(answer);

	}
	
	public static int findClosestValueInBst(BST tree, int target) {
		//initial value cannot be zero becuase if 0 is not in the binary tree 
		//there is a chance that 0 is still gonna be the closest number (which is not necessarily true)
		int current_closest_value = tree.value; 
		return findClosestValueInBst(tree, target, current_closest_value);
	}
	
	

	//10,5,2,1,5,15,13,14,22
	public static int findClosestValueInBst (BST tree, int target, int current_closest_value){


		if(tree != null){

			
			int distance_to_current_closest_value = getDistanceBetweenNumbers(target, current_closest_value);
			int distance_to_tree_value = getDistanceBetweenNumbers(target, tree.value);
					
			if ( distance_to_current_closest_value  > distance_to_tree_value  ){
				current_closest_value = tree.value;
			}


			//System.out.println(my_tree.value );
			current_closest_value = findClosestValueInBst(tree.left, target, current_closest_value);
			
			current_closest_value = findClosestValueInBst(tree.right, target, current_closest_value);
			//System.out.println(my_tree.value );
					

		}

		return current_closest_value;
		

	}
	
	public static int getDistanceBetweenNumbers (int num1, int num2) {
		
		int expression = 0; 
		if ( (num1 > 0 && num2 > 0) ||  (num1 < 0 && num2 < 0 )) {
			expression = Math.abs(Math.abs(num1)   - Math.abs(num2) );
		}else {
			expression = Math.abs( Math.abs(num1)  + Math.abs(num2));
		}
		return expression;
		
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