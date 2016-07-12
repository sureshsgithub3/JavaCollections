package CollectionsArraylist;

import java.util.ArrayList;

public class Example2_Sublist {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add("four");
		al.add("Five");
		al.add("six");
		System.out.println("Currently the array list has following elements:"+al);
		
		//creating sub list of  al and inserting in to  list2 al1
		ArrayList<String> al1= new ArrayList<String>(al.subList(2, 5));
		
		System.out.println("sub list of al in al1 :"+al1);

	}

}
