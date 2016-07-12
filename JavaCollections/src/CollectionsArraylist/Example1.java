package CollectionsArraylist;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add("four");
		al.add("Five");
		
		
		System.out.println("Currently the array list has following elements:"+al);
		
		al.add(0,"zero");//adding object at index 0
		al.add(2, "nine");//adding object at index 2
		System.out.println("Current array list is:"+al);//printing arraylist after insertions at specific locations 
		
		al.remove(2);//removing object at index2
		System.out.println("After removal a element at specific index :"+al);

	}

}
