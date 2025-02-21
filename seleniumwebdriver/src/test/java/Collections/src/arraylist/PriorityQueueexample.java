package arraylist;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Comparator;

public class PriorityQueueexample {

public static void main(String[] args) {
PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
	
pq.offer(10);
pq.offer(12);
pq.offer(40);
pq.offer(8);
pq.offer(36);
System.out.println(pq);
pq.poll();
System.out.println(pq);
System.out.println(pq.peek());
	}

}
