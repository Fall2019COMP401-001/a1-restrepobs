package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_items = scan.nextInt();
		String[] items = new String [number_of_items];
		double[] items_price = new double [number_of_items];
		int[] customers_that_bought = new int [number_of_items];
		int[] amount_of_item_bought= new int [number_of_items];
		
		
		for (int i = 0; i < number_of_items; i++) {
			items[i] = scan.next();
			items_price[i] = scan.nextDouble();

		}
		
				int number_of_customers = scan.nextInt();
				String[] customer_first_names = new String[number_of_customers];
				String[] customer_last_names = new String [number_of_customers];
				for(int x = 0; x < number_of_customers; x++) {
					customer_first_names[x] = scan.next();
					customer_last_names[x] = scan.next();
					int number_of_items_bought = scan.nextInt();
					int [] multiples = new int [number_of_items];
					for (int a = 0; a < number_of_items_bought; a++) {
						int items_bought = scan.nextInt();
						String item = scan.next();
						for (int b = 0; b < number_of_items; b++) {
							if (item.equals(items[b])) {
								amount_of_item_bought[b] += items_bought;
								multiples[b] += 1;
								if (multiples[b]==1) {
									customers_that_bought[b] +=1;
								}
							}
						
						}
						
					}
					
				}  
		for (int i = 0; i < number_of_items; i++) {
			if (amount_of_item_bought[i] == 0) {
				System.out.println("No customers bought "  + items[i]);
			}
			else {
			System.out.println(customers_that_bought[i]+ " customers bought " + (amount_of_item_bought[i])+ " " + items[i]);
		}
		}
				
					
				
		
		scan.close();
		
	}
	
}
