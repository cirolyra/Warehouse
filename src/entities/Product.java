package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double TotalInStock() {
		return quantity * price;
	}
	
	public void AddProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return ""
				+name
				+", $ "
				+String.format("%.2f", price) 
				+", "
				+quantity
				+" units. Total: $ "
				+ String.format("%.2f", TotalInStock());
	}
}

