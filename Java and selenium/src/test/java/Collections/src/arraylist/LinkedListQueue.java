package arraylist;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> q1= new LinkedList<>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		q1.offer(40);
		q1.offer(50);
		
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.peek());
		
	}

}
