import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args)
     {
    	 
    	 Set set = new HashSet();
    	 set.add(123);
    	 set.add("abc");
    	 set.add(456);
    	 set.add(123);
    	 set.add("pqr");
    	 printSet(set);
    	 
    	 
    	 set.remove(123);
    	 printSet(set);
    	 
     } 	 
    	 
    	 System.out.println(set.size());
    	 
    	 private static void printSet(Set set) {
		// TODO Auto-generated method stub
		
	}

		Iterator it = set.iterator();
    	 
    	 while(it.hasNext())
    	 { 
    		 
    		 System.out.println(it.next());
    		 
    	 }
     }
	
}
