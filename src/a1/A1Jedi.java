package a1;

import java.util.Scanner;

public class A1Jedi
{
	//Establish scanner to collect input
	static Scanner scan = new Scanner(System.in);
	
	public static String GetPersonName() {

		
		// obtain first name
		String first_name = scan.next();
		
		// obtain last name
		String last_name = scan.next();
		
		// full name
		String full_name = first_name + " " + last_name;
		
		return full_name;
		
	}
	public static void main(String[] args)
	{
		// Get number of items present in store
		int total_store_items = scan.nextInt();

		// Creates arrays that hold the name and price of all items
		// This array is sized based upon the number of total items
		String[] name_of_all_items = new String[total_store_items];
		double[] price_of_all_items = new double[total_store_items];
		
		// Collect and place all names and prices into the catalog arrays
		for (int i = 0; i < total_store_items; i++)
		{
			// Gets item name
			String item_name = scan.next();
					
			// Place it in the respective array box
			name_of_all_items[i] = item_name;
					
			// Gets item price
			double item_price = scan.nextDouble();
							
			// Place it in the respective array box
			price_of_all_items[i] = item_price;
		}
		
		//Collect the amount of customers
		int total_customers = scan.nextInt();
		
		// Takes in all the names and puts them into this array
		String[] full_names = new String[total_customers];
		int[] num_of_items = new int[total_store_items];
		
		int quantity_of_item;
		int index;
		int[] num_of_people_bought_x_item = new int[total_store_items];
		
		for (int i = 0; i < total_customers; i++)
		{
			// Placed names into array 
			full_names[i] = GetPersonName();
			
			// Get number of items they bought
			int num_of_items_customer_bought = scan.nextInt();
			
			
			for (int c = 0; c < num_of_items_customer_bought; c++)
			{
				// Quantity of items here
				quantity_of_item = scan.nextInt();
				
				String item_name = scan.next();
				
				for (int z = 0; z < name_of_all_items.length; z++)
				{
					if (item_name.equals(name_of_all_items[z]))
					{
						index = z;
						num_of_items[z] = num_of_items[z] + quantity_of_item;
						num_of_people_bought_x_item[z] = num_of_people_bought_x_item[z] + 1;
					}
				
				}		
			}
		
		}
		for (int i = 0; i < total_store_items; i++)
		{
			if (num_of_items[i] == 0)
			{
				System.out.println("No customers bought " + name_of_all_items[i]);
			}
			else 
			{
				System.out.println(num_of_people_bought_x_item[i] + " customers bought " + num_of_items[i] + " " + name_of_all_items[i]);
			}
		}
	}
	
}

