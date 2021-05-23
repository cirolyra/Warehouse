package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);

		System.out.println("Product data: " + product);

		System.out.println();

		System.out.print("Enter the number of product to be add in stock: ");
		int num = sc.nextInt();
		product.AddProduct(num);
		System.out.println("Update data: " + product);

		System.out.println();

		System.out.print("Enter the number of product to be add in stock: ");
		num = sc.nextInt();
		product.RemoveProduct(num);
		System.out.println("Update data: " + product);

		sc.close();

	}

}
