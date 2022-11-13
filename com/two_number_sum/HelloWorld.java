//objective: template for java file
//import java.util.*;

class HelloWorld {


	public static void main(String[] args) {


		System.out.println("Hello world!");

		int [] array = {3,5,-4,8,11,1,-1,6};

		int targetSum = 10; 

		int cur_sum = 0; 

		for (int i = 0; i < array.length ; i++){
			for (int j = 0; j < array.length ; j++){
				
				//problem: elements cannot be the same i and j cannot be equal 
				cur_sum = array[i] + array[j];
				
			}
		}


	}


}