import java.util.ArrayList;


class HelloWorld {


	public static void main(String[] args) {



		ArrayList <Integer> set = new ArrayList <Integer>();
		set.add(1);
		set.add(2);
		set.add(3);

		ArrayList <Integer> subset = new ArrayList <Integer>();
		subset.add(1);
		subset.add(4);


		for (int i = 0 ; i < subset.size(); i++){
			
			//System.out.println(set.get(i));
			
			int cur_subset_el_index = subset.get(i);

			if (set.contains(cur_subset_el_index)){
				System.out.println("set contains " + cur_subset_el_index);
			}else{
				System.out.println("go break , the it does not contain this el");
				break;
			}
		}





	}


}