package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Novice 
{
	public static void main(String[] args) 
	{
		//Establishes scanner to collect input
		Scanner scan = new Scanner(System.in);
		
		// Collects number of users
		int count = scan.nextInt();
		
		//Set values of GetInfo to customer_info array
		String[] dem_info = GetDemographicInfo(count);
		int[] item_info = GetItemInfo(count);
		double[] total_prices = GetItems(item_info);
		
	}
	
	public static String[] GetDemographicInfo(int count) 
	{
		Scanner scan = new Scanner(System.in);
		
		String first_name;
		String last_name; 
		char first_initial;
		
		// Creates array of all customer info based on input
		String dem_info[] = new String[count];

		// Places full name and number of items into array
		for (int i = 0; i < dem_info.length; i++) 
		{
			// Collect first and last name
			first_name = scan.next();
			last_name = scan.next();
			
			// Collects first initial
			first_initial = first_name.charAt(0);

			// Place the items into an Array
			dem_info[i] = first_initial  + ". " + last_name + ": ";

		}
		// Close scanner
		scan.close();
		return dem_info;
	}
	
	public static int[] GetItemInfo(int count) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int items;
		
		int item_info[] = new int[count];
		
		for (int i = 0; i < item_info.length; i++) 
		{
			items = scan.nextInt();
			
			item_info[i] = items;
			
		}
		scan.close();
		return item_info;
	}

	public static double[] GetItems(int item_info[]) 
	{
		double total_prices[] = new double[item_info.length];
		
		double total_price = 0.0;

		//Establishes scanner to collect input
		Scanner scan = new Scanner(System.in);
				
		//Collects information regarding all the items purchased
		for (int i = 0; i < total_prices.length; i++) 
		{			
			int num_items = item_info[i];
			
			for (int c = num_items; c > 0; num_items --) 
			{
				
				int quantity = scan.nextInt();
				String item_name = scan.next();
				double item_price = scan.nextDouble();
				
				total_price = (quantity * item_price) + total_price;
				
				total_prices[c] = total_price;
			}
		}
		scan.close();
		return total_prices;
	}
		
	public static void PrintValues(int count, double[] total_prices, String[] dem_info) {
		
		for (int i = 0; i < count; i++) {
			
			// get total price
			double total_price = total_prices[i];
			
			// convert this to 2 decimal places
			String print_price = String.format("%.2f", total_price);
			
			// get dem info
			String print_info = dem_info[]
			
			// some print statement here
		}
		
		
	}
	public static String PrintValue1s(int count, double[] total_prices, String[] dem_info, int item_info[])
	{
		for (int i = 0; i < count; i++) 
		{
			String.format("%.2f", total_price);
			String dem = dem_info[i];
			String item = item_info[i];
			
			String total_output = dem_info + 

		
		String total_output = first_initial + last_name + total_price;
		System.out.println(total_output);
		return total_output;
		}

		
	}
}

		