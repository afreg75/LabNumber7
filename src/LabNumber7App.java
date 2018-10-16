import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LabNumber7App {

	public static void main(String[] args) {
		//The Program will validate different types of inputs. 
		Scanner scnr = new Scanner (System.in);
		
			
		System.out.println("Please enter your name."); // Prompts the user to enter Name
		String userInput = scnr.next();
				
		if (isValidName(userInput)) {  //Runs name validation
		System.out.println("Is Valid");
		}else {
		System.out.println("Is not valid");
		}
		
		System.out.println("Please enter a valid email address"); // Prompts user for email address 
		String userEmail = scnr.next();
		
		if(isValidEmail(userEmail)) { // Runs Valid email method validation for User email is entered in correct format
			System.out.println("Is Valid");
		}else {
			System.out.println("Is not valid");
		}
		System.out.println("Please enter a valid phone number"); // Prompts user for phone number 
		String userPhone = scnr.next();
		
		if(isValidPhone(userPhone)) {  // Runs phone method validation user phone number is entered in correct format
			System.out.println("Phone is valid");
		}else {
			System.out.println("Phone is not valid");
		}
			
		System.out.println("Please enter a valid date dd/mm/yyyy");  // Prompts user for Date
		String date = scnr.next();
		
		if (dateEntered(date)) {  // Runs date method validation, is entered in correct format
			System.out.println("Is Valid");
		} else
			System.out.println("Is not valid");
	}
			
		static private boolean isValidName(String userName) { //Method for for Valid Name
			boolean isValid = true;

				if (userName.matches("[A-Z][a-z]{0,30}$")){
					
				return isValid; 
				
				}else {
				
				return false;
				}
		}
		static private boolean dateEntered(String userDate) { //Method for Valid Date
			boolean isValid = true;
				
				
				if (userDate.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$")){
					
				return isValid; 
				
				}else {
				
				return false;
				}
		}
				 private static boolean isValidEmail(String userEmail) { // Method for Valid Email
				        boolean isValidEmail = true;
				        
				        if (userEmail.matches("([a-zA-Z0-9_\\.\\-\\+]{5,30})+\\@(([a-zA-Z0-9\\-]{5,10})+\\.)+([a-zA-Z0-9]{2,4})+$")) {
				        	
				                  return isValidEmail;
				        }  else {
				                return false;
		}
				 }
				 private static boolean isValidPhone(String userPhone) {    
				        boolean isValidPhone = true;
				        
				        if (userPhone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")){
				        	
				                  return isValidPhone;
				        }  else {
				                return false;
		}
								
}
}
