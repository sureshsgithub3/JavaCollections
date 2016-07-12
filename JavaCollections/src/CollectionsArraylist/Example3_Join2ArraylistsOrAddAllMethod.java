package CollectionsArraylist;

import java.util.ArrayList;

public class Example3_Join2ArraylistsOrAddAllMethod {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add("four");
		al.add("Five");
		al.add("six");
		
		System.out.println("Currently the array list :al has following elements:"+al);
		
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("seven");
		al1.add("eight");
		al1.add("nine");
		
		System.out.println("Currently the array list :al1 has following elements:"+al1);
		
		al.addAll(al1);//joining two arraylists
		System.out.println("After al1 collection added/joined with arraylist al :"+al);
		
		

	}

}
