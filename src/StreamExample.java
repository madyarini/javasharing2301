import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

// example of short circuit in stream operations
public class StreamExample {
  public static void main(String[] args) {
    List<Product> newArrivals = Arrays.asList(
        new Product("RB blush", 50),
        new Product("holiday lipgloss", 120),
        new Product("travel moisturizer", 20),
        new Product("makeup palette", 200),
        new Product("luminous foundation", 180),
        new Product("bold mascara", 150),
        new Product("makeup wipes", 20),
        new Product("green eyeshadow", 40),
        new Product("blue eyeshadow", 35)
    );
    List<String> names = newArrivals.stream().filter(product -> {
      System.out.println("filtering: "+product.getName());
      return product.getPrice() < 100;
    }).map(product -> {
      System.out.println("mapping: "+product.getName());
      return product.getName();
    }).limit(3).collect(toList());

    System.out.println("\n------ results --------");
    System.out.println(names);

    Optional<Product> aCheapProduct = newArrivals.parallelStream()
        .filter(product -> {
          System.out.println("filtering: "+product.getName());
          return product.getPrice() < 100;
        }).findAny();
    System.out.println(aCheapProduct.get().getName());
  }
}

class Product {
  private String name;
  private int price;

  Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  String getName() {
    return name;
  }

  int getPrice() {
    return price;
  }
}
