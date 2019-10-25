package structures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	
	public static void main(String[] args) {
	      
		playWithLinekList();
		 	
	        }
	 
	private static void playWithLinekList() {
		
	 LinkedList<Integer> Liste = new LinkedList<Integer>(); 
	 ListIterator<Integer> iterator = Liste.listIterator();
	 
	 System.out.println("Liste chaînée : ");
	 Liste.add(3);
	 Liste.add(1);
	 Liste.add(2);
	 Liste.add(4);
	 
	iterator = Liste.listIterator();
	 
	while( iterator.hasNext() ) {
		System.out.println(iterator.next());
	}

}
}
