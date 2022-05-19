package datastructure;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("jack");
		set.add("john");
		set.add("dave");
		set.add("david");
		set.add("sam");
		set.add("jack");
		
		//a set takes a different order
		//a set does not accept duplication
		
		
		System.out.println(set);
	}

}
