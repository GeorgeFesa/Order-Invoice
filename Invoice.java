package ex7;

import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("How many different products do you want to order?");
		int diffProductsInTotal = in1.nextInt();
		product.setDiffProductsInTotal(diffProductsInTotal);
		
		for(int i = 0; i<diffProductsInTotal; ++i) {
			System.out.print("\nPlease enter the product's name: ");
			product.setName(input.nextLine());
			System.out.print("Please enter the product's quantity: ");
			product.setQuant(in1.nextInt());
			System.out.print("Please enter the product's price: ");
			product.setPrice(in2.nextDouble());
		}
		
		System.out.print("\nPlease enter your address: ");
		String shipAddress = input.nextLine();
		
		System.out.print("Please pay for the products: ");
		double payReceived = in2.nextDouble();
		
		if(product.totalPrice()>payReceived) {
			double amountStillDue = product.totalPrice() - 
					                    payReceived;
			System.out.println("\nThe operation completed unsuccessfully");
			System.out.println("You need " + amountStillDue + " euros more");
		}
		else {
			double change = payReceived - product.totalPrice();
			System.out.println("\nThe operation completed successfully");
			System.out.println("You have " + change + " euros change");
			System.out.println("Shipping the products to " + shipAddress);
		}
	}

}
