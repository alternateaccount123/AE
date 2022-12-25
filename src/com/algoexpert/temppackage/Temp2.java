package com.algoexpert.temppackage;

public class Temp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };

		int[] arr = smallestDifference(arrayOne, arrayTwo);
		System.out.println( "|" + arr[1] + "-" + arr[2] + "|  = " +  arr[0]);

	}

	
	//this works for the inner array 
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		//
		int[] els_of_smallest_calculation = new int[3];
		int prev_calculation = Integer.MAX_VALUE;
		//
		int prev_inner_smallest_calc = Integer.MAX_VALUE;
		int smallest_calculation_of_all;
		
		
		//for (int j = 0 ; j < arrayOne.length ; j++) {
		
		for (int i = 0; i < arrayTwo.length; i++) {  //start inner
		
			int calculation = Math.abs(arrayTwo[0]-arrayOne[i]);
			
			if (calculation < prev_calculation) {
				//store all elements of what is the smallest calculation 
				els_of_smallest_calculation [0]  =  calculation; 
				els_of_smallest_calculation [1]  =  arrayTwo[0]; 
				els_of_smallest_calculation [2]  =  arrayOne[i]; 
			}
			
			prev_calculation = calculation;
		
			
		}//end of inner 		
		
		
		int cur_inner_smallest_calc =  els_of_smallest_calculation [0];
		
		if (cur_inner_smallest_calc < prev_inner_smallest_calc) {
			smallest_calculation_of_all = cur_inner_smallest_calc;
		}
		
		prev_inner_smallest_calc = cur_inner_smallest_calc;
		
		//end of outer 
		
		System.out.println();

		return els_of_smallest_calculation;
	}

}
