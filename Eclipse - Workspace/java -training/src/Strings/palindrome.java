package Strings;

public class palindrome {

	public static void main(String[] args) {
		String str1 = "Hello!";
		String str2 = "MOM";

		palidndrome(str1);
		palidndrome(str2);

	}

public static void palidndrome(String str)
{
	String revStr = reverseString(str);
	if (str.equalsIgnoreCase(revStr)) {
		System.out.println("Given String is Palindrome");
	}
	else {
		System.out.println("Given String is not a Palindrome");
	}
}

private static String reverseString(String str) {
	// TODO Auto-generated method stub
	return null;
}

}