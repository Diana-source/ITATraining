import java.util.Map;

public class HashMapDemo {
	
	
	public static void main (String[] args) {
		
		
		Map mp = new HashMap();
		mp.put("Name", "Aravinda"); 
		mp.put("A-Details",new ArrayList());
		mp.put("Address", "adsfasdf asdasdf");
		
		System.out.println(mp.get("Name"));
		System.out.println(mp.get("A-Details"));
		
		
	}
	

}
