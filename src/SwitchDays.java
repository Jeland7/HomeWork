/** Home Work:
 Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
 Day        Message
 Monday:	Evening classes at 19:00
 Tuesday:   No classes
 Wednesday:	Evening classes at 19:00
 Thursday:  No classes
 Friday:	No classes
 Saturday:	Whole day Labs :)
 Sunday:	It's finally Sunday! : default:   check your input mate/fella/gal
 */
import java.util.Scanner;
public class SwitchDays {
    public static void main(String args[]) {
        // declare a variable to store the day entered by the user
    	String day;
    	
    	// prompt the user to enter a day of the week
    	System.out.println("Please enter a day of the week to see whether there are any classes scheduled for that day");
        // declare a variable named scan to be able to work with objects of type Scanner
    	Scanner sc = new Scanner(System.in);
    	// create a Scanner object to read input from the keyboard
    	day = sc.nextLine();
    	
    	// read the string provided by the user
        // we know that Java is case sensitive, therefore let's convert the word provided by the user to lower case so that the program works independent of the way the user writes the word e.g. Monday, monDAY, MoNdAy
        // toLowerCase() is a method declared in the class String. The method converts all the characters in a given string to lower case
        day = day.toLowerCase();
        
        switch (day) {
//note: a switch statement accepts a constant expression/variable of type String only starting with Java version 7; in earlier versions the compiler shows an "incompatible types" error.
            case "monday": 
            case "wednesday":
            	System.out.println("Evening classes at 19:00"); 
            	break;
            case "tuesday": 
            case "thursday": 
            case "friday": 
            	System.out.println("No classes"); 
            	break;
            case "saturday": 
            	System.out.println("Whole day Labs :)"); 
            	break;
            case "sunday": 
            	System.out.println("It's finally Sunday!"); 
            default:
            	System.out.println("Check your input bro"); 
            	break;
        
        } //end of switch
    }//end of main
}//end of class

