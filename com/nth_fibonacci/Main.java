//objective: template for java file
//import java.util.*;

class Main {
//edited from github master  a

	public static void main(String[] args) {


		System.out.println("Hello world!");

		int answer = f(3);


	}

	public static int f (int n){


		if (n == 0){
			System.out.println(n);
			return 0;

		}else{
			System.out.println(n);
			return f(n-1);

		}

    	
	}

}
