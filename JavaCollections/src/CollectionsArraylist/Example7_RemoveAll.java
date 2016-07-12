package CollectionsArraylist;

import java.util.ArrayList;

public class Example7_RemoveAll {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("one");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		al1.add("Five");
		al1.add("six");
		
		//before remove
		System.out.println("Before removeall");
		System.out.println(al1);
		for(String s:al1){
			System.out.println(s);
		
		}
		
		al1.removeAll(al1);//removing all objects in list
		System.out.println("After removeall");
		System.out.println(al1);
		for(String s:al1){
			System.out.println(s);
		
		}

	}

}
