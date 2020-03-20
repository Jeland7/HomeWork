
/*
 SmartNumber.java computes property value of number */


public class SmartNumber {

	//declare a constructor
	public SmartNumber() {
		System.out.println("???");
		System.out.println();
	}
	
	//compute whether the number is even . Return true if number is even, otherwise returns false
	public boolean isNumberEven(int number){
		//declare a variable store whether the number is even
		boolean isEven = false;
		int remainder = number % 2;
		
		if(remainder == 0) {
			isEven = true;
		}
		return isEven;
	}
	
}
