import java.util.Scanner;

/* 
 SmartNumberApp.java uses the instantiable class to determine the property of a number entered by the user*/
public class SmartNumberApp {
	public static void main(String[] args) {
		//declare a local variable to store the users input
		int n;
		
		//declare boolean variable to store the property of a number
		boolean property;
		
		//create an object of type SmartNumber
		SmartNumber number = new SmartNumber();
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		n = myScanner.nextInt();
		
		property = number.isNumberEven(n);
		System.out.println("is " + n + " even? " + property);
		
		
	}
	
}
