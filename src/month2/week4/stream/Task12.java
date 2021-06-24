package month2.week4.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task11 {
    public static void main(String[] args) {
        Product product=new Product(1l, "book", "Books", 150.0);
        Product product1=new Product(2l, "book2", "Books", 100.0);
        Product product2=new Product(3l, "toy", "Baby", 200.0);
        Order order=new Order();
        List<Product> products = order.products;
        products.add(product);
        products.add(product1);
        products.add(product2);
        List<Product> baby = products.stream().filter(x -> x.getCategory().equals("Baby")).collect(Collectors.toList());
        baby.stream().forEach(x->x.setPrice(x.getPrice()-x.getPrice()*0.1));
        baby.forEach(x-> System.out.println(x.getPrice()));


    }
}
