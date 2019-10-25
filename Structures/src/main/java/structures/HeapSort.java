package structures;

import java.util.ArrayDeque;
import java.util.*;


public class HeapSort {

	
	
	public static void main(String[] args) {
	      
		 Double[] array = {1.0, 8.0, 5.0,18.0,0.0};
		 sort(array);
		 
		 for (double i : array) {
			System.out.println(i);
		 }
		 	
	        }
	
	public static Double[] sort (Double[] array ) {		
		
		 System.out.println("Pile :");
		 ArrayDeque<Double> pile = new ArrayDeque<>();
		
		 Arrays.sort(array);
		 
		 for (Double i : array) {
			 pile.add(i);
		 }
		 
		 for (int i = 0; i < array.length ; i++) {
			 array[i] = pile.getFirst();
			 pile.remove();
		 }
		 
		 return array;
	}
	
	
	
	
	
	
}
