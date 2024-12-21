package shoppingcartsys;

import exception.NotCorrectCount;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Integer, Integer> countchecker;
    private Map<Integer, Product> productHashMap;

    public ShoppingCart() {
        countchecker = new HashMap<>();
        productHashMap = new HashMap<>();
    }

    public void addProduct(Product product, int count) {
        if (count > 0) {
            countchecker.put(product.getId(), count);
            productHashMap.put(product.getId(), product);
            System.out.println("Product added your cart successfully!!!");
        } else {
            throw new NotCorrectCount("Count must be 1>:");
        }
    }

    public void remove(Integer productId) {
        if (productHashMap.containsKey(productId)) {
            countchecker.remove(productId);
            productHashMap.remove(productId);
            System.out.println(productId + " ID product removed!");
        }
    }

    public Product getProductInfo(String productId) {
        return productHashMap.get(productId);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Integer productId : productHashMap.keySet()) {
            Product product = productHashMap.get(productId);
            int quantity = countchecker.get(productId);
            total += product.getPrice() * quantity;
        }
        return total;
    }

    public void showInfo() {
        if (countchecker.isEmpty()) {
            System.out.println("Your cart is empty");
        } else {
            for (Integer productId : productHashMap.keySet()) {
                Product product = productHashMap.get(productId);
                int quantity = countchecker.get(productId);
                System.out.println("Product ID: " + product.getId() + ", " + "Product Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity: " + quantity);
            }
        }
    }
}

