package java.variables;

public class variabledemo {

	/*
	 * int number; number = 10;
	 */
	/*
	 * int number = 10;
	 *
	 */
	String name = "Aravinda";
	int age = 35;
	double weight = 75;
	double height = 5.7;
	long phoneNum = 1231231231;
	static String country = "INDIA";

	public static void test() {
		System.out.println("Accessing Global Variable" + country);

	}

	public static void main(String[] args) {
		test();
	}
}