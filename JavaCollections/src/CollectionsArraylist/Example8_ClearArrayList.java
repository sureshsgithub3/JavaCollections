package CollectionsArraylist;

import java.util.ArrayList;

public class Example8_ClearArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("one");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		al1.add("Five");
		al1.add("six");
		
		//before remove
		System.out.println("Before clear");
		System.out.println(al1);
		for(String s:al1){
			System.out.println(s);
		
		}
		
		al1.clear();//clearing arraylist 
		System.out.println("After clear");
		System.out.println(al1);
		for(String s:al1){
			System.out.println(s);
		
		}

	}

}
