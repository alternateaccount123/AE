

import java.util.*;
//https://www.algoexpert.io/questions/find-closest-value-in-bst

//note: the particular sample case is a bst tree . but the whole thing is  just a regular binary tree . so if you change the sample it means 
// you are qorking with a regular tree 

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
		int answer = foo(t,13,0);
		System.out.println(answer);

	}

	//10,5,2,1,5,15,13,14,22
	public static int foo (BST my_tree, int target, int current_closest_value){

		

		if(my_tree != null){

			//update closest value 
			if ( current_closest_value - target < my_tree.value - target){
				current_closest_value = my_tree.value;
			}
			//System.out.println(my_tree.value );
			foo(my_tree.left, target, current_closest_value);
			
			foo(my_tree.right, target, current_closest_value);
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