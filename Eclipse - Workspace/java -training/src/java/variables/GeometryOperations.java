package java.variables;

public class GeometryOperations {
	
	public static void main(String[] args) {

		AdditionUsingMethods aObj = new AdditionUsingMethods();
		
		
		int sum1 = aObj.addition(10,  20);
		System.out.println("Printing from main - "+ sum1);
		int sum2 = aObj.addition(15  , 25);
		System.out.println("Printing from main -" + sum2);
		int sum3 = aObj.addition(35,  20);
		System.out.println("Printing from main -" + sum3);
		
		aObj.substraction(20, 10);
		
		aObj.multiplication(15, 5);
		
	
		
		
		
	}
}
