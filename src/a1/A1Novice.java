package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Novice 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		//Establishes scanner to collect input
		
		// Collects number of users
		int count = scan.nextInt();
		
		//Set values of GetInfo to customer_info array
		//String[] dem_info = GetDemographicInfo(count);
		//int[] item_info = GetItemInfo(count);
		//double[] total_prices = GetItems(item_info);
		//PrintValues(count, total_prices, dem_info);
		
		//make huge for loop and put everything there, iteration each person
		for (int i = count; i > 0; i--) 
		{
			String dem_info = GetDemographicInfo(count);
			int item_info = GetItemInfo(count);
			double total_price = GetItemPrice(item_info);
			System.out.println(dem_info + String.format("%.2f", total_price));
		}
	}
	
	public static String GetDemographicInfo(int count) 
	{		
		String first_name;
		String last_name; 
		char first_initial;
		
		// Creates array of all customer info based on input
		// String dem_info[] = new String[count];

		// Places full name and number of items into array
		//for (int i = 0; i < dem_info.length; i++) 
		//{
			// Collect first and last name
		first_name = scan.next();
		last_name = scan.next();
			
			// Collects first initial
		first_initial = first_name.charAt(0);

			// Place the items into an Array
		String dem_info = first_initial  + ". " + last_name + ": ";

		//}
		// Close scanner
		return dem_info;
	}
	
	public static int GetItemInfo(int count) 
	{
				
		int items;
		
		//int item_info[] = new int[count];
		
		items = scan.nextInt();
						
		return items;
}

	public static double GetItemPrice(int items) 
	{
		//double total_prices[] = new double[item_info.length];
		
		double total_price = 0.0;

		//Collects information regarding all the items purchased			
			
		for (int c = items; c > 0; c --) 
			
		{
				int quantity = scan.nextInt();
				String item_name = scan.next();
				double item_price = scan.nextDouble();
				
				total_price = (quantity * item_price) + total_price;
				
		}
		return total_price;
		
	}
		
	public static void PrintValues(int count, double[] total_prices, String[] dem_info) {
		
		for (int i = 0; i < count; i++) {
			
			// get total price
			double total_price = total_prices[i];
			
			// convert this to 2 decimal places
			String print_price = String.format("%.2f", total_price);
			
			// get dem info
			String print_info = dem_info[i];
			
			System.out.println(print_info + print_price);
			
		}
		
		
	}
}


		