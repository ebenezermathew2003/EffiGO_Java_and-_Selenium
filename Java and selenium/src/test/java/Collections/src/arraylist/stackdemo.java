package arraylist;
import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
	Stack<String> names=new Stack<>();	
	//elements adding to stack
	names.push("Ramesh");
	names.push("Suresh");
	names.push("Gnanesh");
	names.push("Ganesh");
	System.out.println(names);
	//check the peak element in the stack
	System.out.println(names.peek());
	//removes the top element
	names.pop(); 
	
	System.out.println(names);
	
	System.out.println(names.peek());

	}

}
