package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Toms adventure", "Book", 102));
        products.add(new Product(2L, "Barbie", "Toys", 100));
        products.add(new Product(3L, "Tom and Jerry", "Book", 87.2));
        products.add(new Product(4L, "Mercedes", "Toys", 650));
        products.add(new Product(5L, "Blue train", "Book", 119.4));

        List<Product> filtr = products.stream()
                .filter(product -> "Book".equals(product.getCategory()) & product.getPrice() > 100).toList();
        System.out.println(filtr);
        System.out.println("*************************************************************");
      List<Double> cav= products.stream()
                .filter(product -> "Toys".equals(product.getCategory())).map(print->print.getPrice()-print.getPrice()*0.9).toList();
        System.out.println(cav);
    }
}
