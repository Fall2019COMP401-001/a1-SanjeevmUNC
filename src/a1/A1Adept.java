package a1;

import java.util.Scanner;

public class A1Adept 
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
		double[] total_spent = new double[total_customers];

		for (int i = 0; i < total_customers; i++) 
		{
			full_names[i] = GetPersonName();
			total_spent[i] = GetTotalSpent(name_of_all_items, total_customers, price_of_all_items);

		}

		double average = CalcAverage(total_spent, total_customers);
		double largest = FindLargestValue(total_spent);
		int largest_index = FindLargestValueIndex(total_spent);
		double smallest = FindSmallestValue(total_spent);
		int smallest_index = FindSmallestValueIndex(total_spent);
		
		System.out.println("Biggest: " + full_names[largest_index] + " (" + String.format("%.2f", largest) + ")");
		System.out.println("Smallest: " + full_names[smallest_index] + " (" + String.format("%.2f", smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
// THESE TWO GET CATALOG METHODS TURNED OUT TO BE USELESS
	public static String[] GetCatalogNames(int total_store_items)
	{
		// Creates an array of all the names in the store
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
		String full_name = first_name + " " + last_name;
		
		return full_name;
		
	}

	public static double GetTotalSpent(String[] name_of_all_items, int total_customers, double[] price_of_all_items) 
	{
		
		double total_cost = 0.0;
		
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
				}
			}
				
			double item_cost = price_of_all_items[index];
			
			total_cost = total_cost + (quantity * item_cost);
		}
		return total_cost;
	}
	
	public static double CalcAverage(double[] total_spent, int total_customers)
	{
		double average = 0.0;
		double total = 0.0;
		
		// adds them all up and divides
		for (int i = 0; i < total_spent.length; i++)
		{
			total = total + total_spent[i];
		}
		
		average = total / total_customers;
		
		return average;
	}
	public static double FindSmallestValue(double[] total_spent)
	{		
		double minimum = total_spent[0];
		
		for (int c = 0; c < total_spent.length; c++)
		{
			if (minimum > total_spent[c])
			{
				minimum = total_spent[c];
			}
		}
		return minimum;
	}
	public static int FindSmallestValueIndex(double[] total_spent)
	{
		int index_of_min = 0;
		
		double minimum = total_spent[0];
		
		for (int c = 0; c < total_spent.length; c++)
		{
			if (minimum > total_spent[c])
			{
				minimum = total_spent[c];
				index_of_min = c;
			}
		}
		
		return index_of_min;
	}
	public static double FindLargestValue(double[] total_spent)
	{	
		double maximum = total_spent[0];
		
		for (int c = 0; c < total_spent.length; c++)
		{
			if (maximum < total_spent[c])
			{
				maximum = total_spent[c];
			}
		}
		
		return maximum;
	}
	public static int FindLargestValueIndex(double[] total_spent)
	{
		int index_of_max = 0;
		
		double maximum = total_spent[0];
		
		for (int c = 0; c < total_spent.length; c++)
		{
			if (maximum < total_spent[c])
			{
				maximum = total_spent[c];
				index_of_max = c;
			}
		}
		
		return index_of_max;
	}
}	
	
	
		
		
		
		
		
	
	

	
