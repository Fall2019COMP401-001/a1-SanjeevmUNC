package a1;

import java.util.Scanner;

public class A1Jedi 
{
	//Establish a scanner to obtain input
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// Get the number of items that are present in the store
		int total_store_items = scan.nextInt();
				
		// Calls function that gets the name of the items in store
		String[] name_of_all_items = new String[total_store_items];
		double[] price_of_all_items = new double[total_store_items];
				
		// Creates catalog for all the names and prices paired
		for (int i = 0; i < total_store_items; i++)
		{
			String item_name = scan.next();
					
			// Place it in the respective array box
			name_of_all_items[i] = item_name;
					
			// Obtain the item price
			double item_price = scan.nextDouble();
							
			// Place it in the respective array box
			price_of_all_items[i] = item_price;
		}

		// Gets the amount of customers
		int total_customers = scan.nextInt();	
					
		String[] full_names = new String[total_customers];
			
		int[] num_per_item = new int[total_store_items];

		for (int i = 0; i < total_customers; i++) 
			{
				full_names[i] = GetPersonName();
				num_per_item[i] = GetTotalItems(name_of_all_items, total_customers);			
			}
	}
	public static String GetPersonName() {
		
		// obtain first name
		String first_name = scan.next();
		
		// obtain last name
		String last_name = scan.next();
		
		// full name
		String full_name = first_name + " " + last_name;
		
		return full_name;
		
	}

	public static int GetTotalItems(String[] name_of_all_items, int total_customers) 
	{		
		int num_per_item_per_customer = 0; 
		
		//get num of items bought
		int num_of_items = scan.nextInt();
				
		for (int c = 0; c < num_of_items; c++)
		{
			// collect quantity of items
			int quantity = scan.nextInt();
			
			// collect name of item
			String item_name = scan.next();
			
			// finds the index of the item name that has the same index as the item		
			int index = 0;
			
			for (int z = 0; z < name_of_all_items.length; z++)
			{
				if (item_name.equals(name_of_all_items[z]))
				{
					index = z;
					num_per_item_per_customer = quantity + num_per_item_per_customer;
				}
			}
		}
		return num_per_item_per_customer;
	}
	
}

