package CollectionsArraylist;

import java.util.ArrayList;

public class Example4_Compare2ListsOrContainsMethod {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("one");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		al1.add("Five");
		al1.add("six");
		
		System.out.println("Arraylist al1 before compare :"+al1);
		
		
		
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("four");
		al2.add("Five");
		al2.add("six");
		al2.add("seven");
		al2.add("eight");
		System.out.println("Arraylist al2 before compare :"+al2);
		
		 //Storing the comparison output in ArrayList<String>
		ArrayList<String> al3= new ArrayList<String>();
		
		for(String s:al1){
			al3.add(al2.contains(s)? "Yes":"No");
			
		}	
		
		System.out.println("Result in Yes or"+al3);
		
		
		ArrayList<Integer> al4= new ArrayList<Integer>();
		//Storing the comparison output in ArrayList<String>
		for(String s:al1){
			al4.add(al2.contains(s)? 1:0);
			
		}
		System.out.println("Result in Yes or"+al4);
		

	}

}
