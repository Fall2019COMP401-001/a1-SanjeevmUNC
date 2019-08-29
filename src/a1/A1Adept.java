package a1;

import java.util.Scanner;

public class A1Adept {
	
	//Establish a scanner to obtain input
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// Get the number of items that are present in the store
		int total_store_items = scan.nextInt();
		
		// Calls function that gets the name of the items in store
		String[] name_of_all_items = GetCatalogNames(total_store_items);
		double[] price_of_all_items = GetCatalogPrices(total_store_items); 
		
		// Gets the amount of customers
		int total_customers = scan.nextInt();	
				
		String[] full_names = new String[total_customers];
		double[] total_spent = new double[total_customers];

		for (int i = 0; i < full_names.length; i++) 
		{
			full_names[i] = GetPersonName();
		}
		for (int i = 0; i < total_spent.length; i++)
			total_spent[i] = SOME METHOD HERE
	}

	public static String[] GetCatalogNames(int total_store_items)
	{
		// Creates an array of all the names in the store
		String[] name_of_all_items = new String[total_store_items];

		// Obtains the item name and places it in the respective location
		for (int i = 0; i < total_store_items; i++) 
		{
			// Obtain the item name
			String item_name = scan.next();
			
			// Place it in the respective array box
			name_of_all_items[i] = item_name;
		}
		return name_of_all_items;
	}
	public static double[] GetCatalogPrices(int total_store_items) 
	{
		// Creates an array of all the items in the store
		double[] price_of_all_items = new double[total_store_items];
		
		for (int i = 0; i < total_store_items; i++)
		{
			// Obtain the item price
			double item_price = scan.nextDouble();
			
			// Place it in the respective array box
			price_of_all_items[i] = item_price;
		}
		return price_of_all_items;	
	}
	
	public static String GetPersonName() {
		
		// obtain first name
		String first_name = scan.next();
		
		// obtain last name
		String last_name = scan.next();
		
		// full name
		String full_name = first_name + last_name;
		
		return full_name;
		
	}

	public static double[] GetTotalSpent(String[] name_of_all_items, 
			double[] price_of_all_items) 
	{
		//get num of items bought
		int num_of_items = scan.nextInt();
		
		for (int c = num_of_items; c > 0; c--)
		{
			// collect quantity of items
			int quantity = scan.nextInt();
			
			// collect name of item
			String item_name = scan.next();
			
			int index = name_of_all_items.indexOf(item_name); //
			
			
			
			

		}
}

	}	
	
	
		
		
		
		
		
	
	

	
