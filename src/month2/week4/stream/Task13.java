package month2.week4.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task12 {
    public static void main(String[] args) {

        Product product=new Product(1l, "book", "Books", 150.0);
        Product product1=new Product(2l, "book2", "Books", 100.0);
        Product product2=new Product(3l, "toy", "Baby", 200.0);
        Order order=new Order();
        List<Product> products = order.products;
        products.add(product);
        products.add(product1);
        products.add(product2);

        List<Product> books = products.stream().filter(x -> x.getCategory().equals("Books")).collect(Collectors.toList());

        Optional<Product> min = books.stream().min(Comparator.comparingDouble(x -> x.getPrice()));
        Product product3 = min.get();
        System.out.println(product3.getName());
    }
}
