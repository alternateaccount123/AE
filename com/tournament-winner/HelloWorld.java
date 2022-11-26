
import java.util.*;

class HelloWorld {


	public static void main(String[] args) {

		
		//store information about the competitions
		ArrayList <ArrayList<String>> competitions = new ArrayList<>(); 		
		//each 1d arraylist form of [homeTeam,results]
		competitions.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
		competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
		competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
		
		//store information about winner of round 
		ArrayList <Integer> results = new ArrayList <Integer>();
		results.add(0);results.add(0);results.add(1);



		//traverse competitions 
		for (int i = 0 ; i< competitions.size() ;i++){
			System.out.println(competitions.get(i));
		}
		


	}


	//public String tournamentWinner (ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

      
  	//}


}