package structures;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueuesTest {
	
	 public static void main(String[] args) {
	      
		/* playWithQueue();*/
		 playWithStack();
		 playWithMaxPriorityQueue();
		 
		 System.out.println(maxCompare(4.0,6.0));
		 	
	        }
	 
	 private static void playWithQueue() {
		 
		 System.out.println("File :");
		 ArrayDeque<Double> file = new ArrayDeque<>();
		 
		 file.addLast(3.0);
		 file.addLast(1.0);
		 file.addLast(2.0);
		 file.addLast(4.0);
	 
	 for (double i : file) {
		 System.out.println(i);
	 }
 }
	 
private static void playWithStack() {
		 
		 System.out.println("Pile :");
		 ArrayDeque<Double> pile = new ArrayDeque<>();
		 
		 pile.addFirst(3.0);
		 pile.addFirst(1.0);
		 pile.addFirst(2.0);
		 pile.addFirst(4.0);
	 
	 for (double i : pile) {
		 System.out.println(i);
	 }
 }

private static void playWithMaxPriorityQueue( ) {
	 
	 System.out.println("File de priorité :");
	 PriorityQueue<Double> filePrio = new PriorityQueue<>(QueuesTest::maxCompare);
	 
	 filePrio.add(3.0);
	 filePrio.add(1.0);
	 filePrio.add(2.0);
	 filePrio.add(4.0);
	 filePrio.add(0.0);
	 filePrio.add(18.0);
	 filePrio.add(12.0);

for (double i : filePrio) {
	 System.out.println(i);
}
}
	
  private static int maxCompare(Double x ,Double y) {
	  
	 return Double.compare(y, x);
	  
  }

}
