package structures;

import java.util.HashMap;
import java.util.HashSet;

public class DictionnaireTest {

		
		public static void main(String[] args) {
			playWithHashSet();
			playWithHashMap();
		        }
		
	private static void playWithHashSet() {
		
		 HashSet<Integer> Ensemble = new HashSet<Integer>(); 		
		 
		 System.out.println("Ensemble : ");
		 Ensemble.add(3);
		 Ensemble.add(1);
		 Ensemble.add(2);
		 Ensemble.add(4);
		
		 
		for ( Integer i : Ensemble) {
			System.out.println(i);
		}
		
	}
	
	private static void playWithHashMap() {
		
		 HashMap<String,Integer> Ensemble = new HashMap<String,Integer>(); 		
		 
		 System.out.println("Ensemble : ");
		 Ensemble.put("trois",3);
		 Ensemble.put("un",1);
		 Ensemble.put("deux",2);
		 Ensemble.put("quatre",4);
		
		 
		 System.out.println(Ensemble);

		
	}
}
