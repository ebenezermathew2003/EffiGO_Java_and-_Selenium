package arraylist;
import java.util.ArrayList;
import java.util.List;
public class addtoarraylist {

	public static void main(String[] args) {
	List<Integer> a1=new ArrayList<>();
	//adding the value to the list
	a1.add(10);
	a1.add(20);
	//adding the value using index
	a1.add(1, 25);
	//Checks the element is present
	System.out.println(a1.contains(25));
	//modify and set the value
	a1.set(1, 524);
	System.out.println("elements added" +a1);
	//iterate the elemets in the list using for loop
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
		
	}
	//iterate using for each loop
	for(Integer integer : a1) {
		System.out.println(integer);
		
	}
	//removing element using index
	a1.remove(0);
	//removing using the value
	a1.remove(Integer.valueOf(20));
	System.out.println(a1);
	//removing all elements 
	a1.clear();
	System.out.println(a1);

	}

}
