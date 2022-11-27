

import java.util.*;

class HelloWorld {

	public static void main(String[] args) {
		

		//store 
		HelloWorld.BST t = new HelloWorld.BST (10); 
		System.out.println(t.value);

		t.left.value = 5;					//level 2
		t.right.value = 15;					//level 2

		t.left.left.value = 2; 				//level 3
		t.left.right.value = 5;				//level 3
		t.right.right.value = 22;			//level 3
		t.right.left.value = 13;			//level 3

		t.left.left.left.value = 1;			//level 4
		t.right.left.right.value = 14;		//level 4 


		

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