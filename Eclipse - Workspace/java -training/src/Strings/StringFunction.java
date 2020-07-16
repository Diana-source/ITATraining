package Strings;

public class StringFunction {

	public static void main(String[] args) {

		System.out.println("------Welcome to Strings");
		String str = ("Hello All How are you doing");

		String str1 = "Name=Aravinda;Age=35;Phone=123456";

		System.out.println(str.charAt(0));

		System.out.println(str.indexOf("H", str.indexOf("H") + 1));

		System.out.println(str.lastIndexOf("H"));
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		System.out.println(str.substring(6, 12));
		System.out.println(str1.substring(str1.indexOf("=")+1, str1.indexOf(";")));
		
		String[] details = str1.split(";");
		
		System.out.println(details[0].split("=")[1]);
		String[] usernamedetails = details[0].split("=");
		System.out.println(details[1]);
		System.out.println(details[2]);
		
		System.out.println(str1.contains("All"));
		
		String str3 = "Aravinda";
		System.out.println(str3.length());
		System.out.println(str3.equals("Aravinda"));
				
	}

}
