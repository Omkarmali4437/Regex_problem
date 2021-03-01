package myPackage;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex {
	boolean validName;
	String firstName;
	String lastName;
	String phonenumber;
	String password;
	
	Scanner sc = new Scanner(System.in);

	public void validateFirstName()
	{
		System.out.println("Enter First Name (It should start with Capital Letter and have atleast 3 letters)");
		firstName = sc.next();

		validName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
		System.out.println(validName);
		if(validName == true)
		{
			System.out.println("First Name is valid");
		}
		else
		{
			System.out.println("First Name is not valid");	
		}
	}
	
	public void validateLastName()
	{
		System.out.println("Enter Last Name (It should start with Capital Letter and have atleast 3 letters)");
		lastName = sc.next();

		validName = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
		if(validName == true)
		{
			System.out.println("Last Name is valid");
		}
		else
		{
			System.out.println("Last Name is not valid");
		}

	}
	
	public void validateEmail()
	{
		ArrayList<String> emails = new ArrayList<String>();
		System.out.println("Enter email addressess to validate");
		for(int i=0;i<2;i++)
		{
			emails.add(sc.next());
		}
		
		String regex = "^[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-])*@[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)*$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails)
		{
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}
	}
	
	public void validatePhonenumber()
	{
		System.out.println("Enter phone number to validate");
		phonenumber=sc.nextLine();
		String regex = "^[0-9]{2} [0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phonenumber);
	    System.out.println(phonenumber +" : "+ matcher.matches());
	}
	
	public void validatePassword()
	{
		System.out.println("Enter password(Minimum 8 characters)");
		password=sc.nextLine();
		String regex ="^(?=.*[A-Z]).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
	    System.out.println(password +" : "+ matcher.matches());
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to a User registration problem using Reges");
		
		Regex user = new Regex();

		//user.validateFirstName();
		//user.validateLastName();
		//user.validateEmail();
		//user.validatePhonenumber();
		user.validatePassword();
	}

}
