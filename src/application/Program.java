package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.print("Product data: " + product);
		
		System.out.println();
		
		System.out.println("Enter the number of product to be add in stock: ");
		int num = sc.nextInt();
		product.AddProduct(num);
		System.out.println("Update data: " + product);
		
		System.out.println();
		
		System.out.println("Enter the number of product to be add in stock: ");
		num = sc.nextInt();
		product.RemoveProduct(num);
		System.out.println("Update data: " + product);
		
		sc.close();

	}

}
