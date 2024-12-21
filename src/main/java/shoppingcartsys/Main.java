package shoppingcartsys;

import exception.NotCorrectCount;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();


        cart.addProduct(new Product("Apple", 1.5), 3);
        cart.addProduct(new Product("Banana", 1), 5);
        cart.addProduct(new Product("Orange", 1.5), 3);
        cart.addProduct(new Product("Watermelon", 3), 1);
        System.out.println("----------------------------------------------------------");
        cart.showInfo();
        System.out.println("----------------------------------------------------------");
        System.out.println("Total Price: " + cart.getTotalPrice()+"₼");
        System.out.println("----------------------------------------------------------");
        cart.remove(1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Total Price: " + cart.getTotalPrice()+"₼");
        System.out.println("----------------------------------------------------------");
        cart.remove(3);
        System.out.println("----------------------------------------------------------");
        cart.showInfo();
    }
}



