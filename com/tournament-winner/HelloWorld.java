
import java.util.*;

class HelloWorld {


	public static void main(String[] args) {

		
		//store information about the competitions
		ArrayList <ArrayList<String>> competitions = new ArrayList<>(); 		
		//each 1d arraylist form of [homeTeam,awayteam]
		competitions.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
		competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
		competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
		
		//store information about winner of round 
		ArrayList <Integer> results = new ArrayList <Integer>();
		results.add(0);results.add(0);results.add(1);


		ArrayList <String> cur_competition ;
		int cur_result;
		HashMap <String,Integer> table_of_scores = new HashMap <String, Integer> ();
		int cur_score = 0;

		//traverse competitions 
		for (int i = 0 ; i< competitions.size() ;i++){

			cur_competition = competitions.get(i);
			cur_result = results.get(i);
			
			System.out.println("cur_competition" + cur_competition + "\tcur_result: " + cur_result);

			
			if (cur_result == 0){ //awayteam won 		
				table_of_scores.put(cur_competition.get(1), Integer.valueOf(cur_score + cur_result));
			}

			if (cur_result == 1){  //hometeam won 
				table_of_scores.put(cur_competition.get(0), cur_score + cur_result);
			}

		}
		
		System.out.println(table_of_scores);


	}


	//public String tournamentWinner (ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

      
  	//}


}