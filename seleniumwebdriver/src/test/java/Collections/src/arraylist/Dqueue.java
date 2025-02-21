package arraylist;
import java.util.ArrayDeque;

public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayDeque<Integer > dq=new ArrayDeque<>();
	//adding elements in first,last
	dq.offer(10);
	dq.offer(20);
	dq.offerFirst(50);
	dq.offerLast(40);
	System.out.println(dq);
	
	//check peek elements in first ,last
	
	System.out.println("peek element: "+dq.peek());
	//first element peek
	System.out.println("first peek elemennt "+dq.peekFirst());
	//last element peek
	System.out.println("last peek element "+dq.peekLast());
	//remove the first element
	System.out.println("first element removed "+dq.pollFirst());
	//remove the last element
	System.out.println("last element removed "+dq.pollLast());
	//remove the element normally which is removed first
	System.out.println("remove the element "+dq.poll());
	System.out.println(dq);

	}

}
