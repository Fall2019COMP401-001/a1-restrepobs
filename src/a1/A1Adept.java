package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_items = scan.nextInt();
		String[] items = new String [number_of_items];
		double[] items_price = new double [number_of_items];
		
		
		for (int i = 0; i < number_of_items; i++) {
			items[i] = scan.next();
			items_price[i] = scan.nextDouble();
		}
				int number_of_customers = scan.nextInt();
				String[] customer_first_names = new String[number_of_customers];
				String[] customer_last_names = new String [number_of_customers];
				double [] total_array = new double [number_of_customers];
				for(int x = 0; x < number_of_customers; x++) {
					customer_first_names[x] = scan.next();
					customer_last_names[x] = scan.next();
					int number_of_items_bought = scan.nextInt();
					for (int a = 0; a < number_of_items_bought; a++) {
						int items_bought = scan.nextInt();
						String item = scan.next();
						for (int b = 0; b < number_of_items; b++) {
							if (item.equals(items[b])) {
								total_array[x] +=   (items_price[b] * items_bought);
							}
						}
					}
					
				}
				
					
				double min = findValueMin (total_array);
				double max = findValueMax (total_array);
				double average = sum(total_array) / number_of_customers;
				for (int m = 0; m < number_of_customers; m++) {
					if (total_array[m] == (max)) {
						System.out.println("Biggest: " + customer_first_names[m] + " " + customer_last_names[m] + " "+ "("+ String.format("%.2f",max) + ")" );
					}
				}
				for (int m = 0; m < number_of_customers; m++) {
					if(total_array[m] == min) {
						System.out.println("Smallest: " + customer_first_names[m] + " " + customer_last_names[m] + " " + "(" + String.format("%.2f",min) +")");
					}
				}
				System.out.println("Average: " + String.format("%.2f",average) );
		
		scan.close();
	} 
	
	static double findValueMin (double[] vals) {
		double cur_min = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		return cur_min;
	}
	static double findValueMax (double[] vals) {
		double cur_max = vals[0];
		for (int i =1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	} 
	
	static double sum (double[] vals) {
		double sum = 0;
		for (int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
 