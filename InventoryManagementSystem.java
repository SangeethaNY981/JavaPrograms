package maps;
import java.util.HashMap;
//key value pair
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
	
	  public static void main(String[] args) {
	        // Create a map to represent the inventory
	    	while(true) {
	    	Scanner sc=new Scanner(System.in);
	        Map<String, Integer> inventory = new HashMap<>();

	        // Add some products and their quantities to the inventory
	        inventory.put("Laptop", 10);
	        inventory.put("Smartphone", 20);
	        inventory.put("Tablet", 15);
	        inventory.put("Headphones", 30);

	        
	        // Simulate a customer purchasing products
	        System.out.println("enter product to purchase");
	        String productToPurchase =sc.nextLine(); 
	        System.out.println("enter quantity"); 
	        int quantityToPurchase=sc.nextInt();

	        // Check if the product is available
	        if (inventory.containsKey(productToPurchase)) {
	            int availableQuantity = inventory.get(productToPurchase);

	            if (availableQuantity >= quantityToPurchase) {
	                // Update the inventory after the purchase
	                inventory.put(productToPurchase, availableQuantity - quantityToPurchase);
	                System.out.println("Purchase successful! Remaining " + productToPurchase + "s: " + (availableQuantity - quantityToPurchase));
	            } else {
	                System.out.println("Sorry, not enough " + productToPurchase + "s in stock.");
	            }
	        } else {
	            System.out.println("Product not found in the inventory.");
	        }
	    }
	}
}

