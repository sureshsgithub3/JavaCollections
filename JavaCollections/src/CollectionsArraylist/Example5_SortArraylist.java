package CollectionsArraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Example5_SortArraylist {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("one");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		al1.add("Five");
		al1.add("six");
		
		//before sort
		System.out.println("Before sorting");
		
		for(String s:al1){
			System.out.println(s);
		
		}
		
		//sorting arrayList al1
		Collections.sort(al1);
		
		System.out.println("after sorting");
		
		for(String s:al1){
			System.out.println(s);
		
		}
		
		
	}

}
