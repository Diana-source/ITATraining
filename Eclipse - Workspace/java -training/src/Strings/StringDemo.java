package Strings;

public class StringDemo {
	
	
	public static void main(String[] args) {
		
		
		String str = "abc";
		String str1 = new String("abc");
		
		System.out.println("Value of a String" + str + "and hashcode is " + str.hashCode());
		System.out.println("Value of a String" + str + "and hashcode is " + str.hashCode());
		
		
		str1.concat("pqr");
		System.out.println(str1.hashCode());
		
			
	}	

}
