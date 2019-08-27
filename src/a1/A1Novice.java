package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Novice 
{
	public static void main(String[] args) 
	{
		// Establish scanner object to collect input
		Scanner scan = new Scanner(System.in); //how do i get this to apply to the stuff in the methods
		
		// Request number of customers to establish an array
		int count = scan.nextInt();
		
		// Run method creating an array for it
		GetInfo(count);
		
		scan.close();
	}
	public static String[] GetInfo(int count) 
	{
		// Creates array of all customer info based on input
		String customer_info[] = new String[count];

		//Establishes scanner to collect input
		Scanner scan = new Scanner(System.in);

		// Places full name and number of items into array
		for (int i = 0; i < customer_info.length; i++) 
		{
			// Collect first and last name
			String first_name = scan.next();
			String last_name = scan.next();
			
			// Collect number of items
			double items = scan.nextDouble();
			
			GetItems(items);

			// Place all the items into an Array
			customer_info[i] = first_name + " " + last_name + " " + Double.toString(items);
			
		}
		// Close scanner
		scan.close();
		return customer_info;
		

	}
	public static double GetItems(double items) 
	{
		//Establishes scanner to collect input
		Scanner scan = new Scanner(System.in);
		
		//Establishes array to hold items you shopped for
		String[] shopping_list = new String[(int) items];
		
		//Establish counter variable for total cost
		double total_price = 0;

		//Collects information regarding all the items purchased
		for (int i = 0; i < shopping_list.length; i++) 
		{			
			//grab details regarding items
			int quantity = scan.nextInt();
			String item_name = scan.next();
			double price = scan.nextDouble();
			
			total_price = total_price + price;
			
		scan.close();
		}
	return total_price;

		
	}
	public static String PrintValues(double total_price, String first_name, String last_name)
	{
		String.format("%.2f", total_price);
		String total_output = first_name + last_name + total_price;
		System.out.println(total_output);
		return total_output;
	}
}

