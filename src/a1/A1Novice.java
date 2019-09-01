package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		String [] customer = new String [count];
		
		for (int i = 0; i < count; i++) {
			char customer_first = scan.next().charAt(0);
			String customer_last = scan.next();
			double total = 0;
			int items_bought = scan.nextInt();
			String[] items = new String [items_bought];
			for (int x = 0; x < items.length; x++) {
				int amount = scan.nextInt();
				items[x] = scan.next();
				double cost = scan.nextDouble();
				 total = total + (amount * cost); 
				
			}
			customer [i] = customer_first + "." + " " + customer_last + ":" + " " + String.format("%.2f",total);
			System.out.println(customer[i]);
			
		}
		scan.close();
		
	}
}
