package arraylist;
import java.util.Set;
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class learnset {

	public static void main(String[] args) {
	//Set<Integer> set=new HashSet<>();
	Set<Integer> set=new LinkedHashSet<>();
	
	set.add(10);
	set.add(26);
	set.add(15);
	set.add(14);
	
	System.out.println(set);
	set.remove(15);
	System.out.println(set);
	System.out.println(set.contains(100));
	System.out.println(set.isEmpty());
	System.out.println(set.size());
	set.clear();
	System.out.println(set);
	}

}
