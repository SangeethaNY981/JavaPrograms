package collection;

import java.util.ArrayList;

class Product {
	private String name;
	private double price;
	
// constructor
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
		
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
public class ShoppingCart{
	public ShoppingCart(String string, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	     // Create an ArrayList to represent the shopping cart
        ArrayList<ShoppingCart> shoppingCart = new ArrayList<>();

        // Add products to the shopping cart
        //shoppingCart.add("mobile");
        shoppingCart.add(new ShoppingCart("Laptop", 899.99));
        shoppingCart.add(new ShoppingCart("Headphones", 79.99));
        shoppingCart.add(new ShoppingCart("Mouse", 19.99));

        // Print the contents of the shopping cart
        System.out.println("Shopping Cart Contents:");
        for (ShoppingCart product : shoppingCart) {
            System.out.println(product);
        }

        // Calculate the total cost of items in the shopping cart
        double totalCost = 0;
        for (ShoppingCart product : shoppingCart) {
            totalCost += product.price;
            
        }
        System.out.println("Total Cost: $" + totalCost);
       
    }

	}


