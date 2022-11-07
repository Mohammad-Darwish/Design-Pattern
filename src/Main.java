import opcl.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (old):");
        productFilter.filterByColor(products, Color.GREEN)
            .forEach(product -> System.out.println(" - " + product.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN))
            .forEach(product -> System.out.println(" - " + product.name + " is green"));

        System.out.println("Large blue items");
        bf.filter(products, new AndSpecification<>(
            new ColorSpecification(Color.BLUE),
            new SizeSpecification(Size.LARGE)
        )).forEach(product -> System.out.println(" - " + product.name + " is Blue"));



    }
}