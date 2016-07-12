package CollectionsArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example5_howToLoopArrayLists {

	public static void main(String[] args) {
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("one");
		al1.add("Two");
		al1.add("Three");
		al1.add("four");
		al1.add("Five");
		al1.add("six");
		
		System.out.println("Arraylist al1 before compare :"+al1);
		
		System.out.println("Priting array list by for  loop");
		//for loop
		for(int i=0;i<al1.size();i++){
			System.out.println(al1.get(i));
		}
		
		System.out.println("Priting array list by for each loop");
		
		//for each loop
		
		for(String s:al1)
			System.out.println(s);
		
		System.out.println("Priting array list by while loop");
		
		
		int count=0;
		while(al1.size()>count){
			System.out.println(al1.get(count));
			count++;
		}
		
		
		
		
		
		System.out.println("Priting array list by Iterator");
		
		Iterator<String> itr= al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
