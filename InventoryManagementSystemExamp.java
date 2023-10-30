package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystemExamp {

	public static void main(String[] args) {
		  // Create a map to represent the inventory
    	while(true) {
    	Scanner sc=new Scanner(System.in);
        Map<String, Integer> Showroom = new HashMap<>();

        // Add some products and their quantities to the inventory
        Showroom.put("Honda", 25);
        Showroom.put("Maruthi", 33);
        Showroom.put("bmw", 5);
        Showroom.put("Ford", 12);
        Showroom.put("Toyota", 45);
      
        // Simulate a customer purchasing products
        System.out.println("enter product to purchase");
        String productToPurchase =sc.nextLine(); 
        System.out.println("enter quantity"); 
        int quantityToPurchase=sc.nextInt();

        // Check if the product is available
        if (Showroom.containsKey(productToPurchase)) {
            int availableQuantity = Showroom.get(productToPurchase);

            if (availableQuantity >= quantityToPurchase) {
                // Update the inventory after the purchase
            	Showroom.put(productToPurchase, availableQuantity - quantityToPurchase);
                System.out.println("Purchase successful! Remaining " + productToPurchase + "s: " + (availableQuantity - quantityToPurchase));
            } else {
                System.out.println("Sorry, not enough " + productToPurchase + "s in stock.");
            }
        } else {
            System.out.println("Product not found in the Showroom.");
        }
    }
}
}


     
