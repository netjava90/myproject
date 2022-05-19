package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		
     ArrayList<Integer> list = new ArrayList<>();
     //bonding issue solved (we can add any value that we want)
     list.add(52);
     list.add(74);
     list.add(86);
     list.add(96);
     list.add(34);
  

     //print list
     System.out.println(list);
     
     //print (index 3)
     System.out.println(list.get(3));
     
     //add 0 to index 1 (use add)
     list.add(1, 0);
     System.out.println(list);
     
     //set 1 to index 0 (replace)(override an existing value) 
     list.set(0, 1);
     System.out.print(list);
     
     //loop
     for (int i = 0; i < list.size(); i++) {
    	 System.out.println(list.get(i));
    	 
    	 //remove using index
    	 list.remove(0);
    	 System.out.println(list);
    	
     }
     //solve the multiple type in array.
     List<Object> list1 = new ArrayList<>();
     list1.add(12);
     list1.add(1,4645);
     list1.add('$');
     list1.add(false);
     list1.add("work");
   System.out.println(list1);
	}
}
