package baloghbotond_webshop.webshop2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfProducts {
    List<Product> products;

    public ListOfProducts() {
        Product product1 = new Product("Nike shoes", "For indoor football", 60, 14);
        Product product2 = new Product("Nike pro shoes", "For Nike sponsored players", 90, 4);
        Product product3 = new Product("Adidas shoes", "Adidas shoes for practice", 55, 20);
        Product product4 = new Product("Puma gloves", "Best equipment for goalkeepers", 30, 10);

        products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAvailable() {
        return products.stream()
                .filter(product -> product.getQty() > 0)
                .collect(Collectors.toList());
    }

    public List<Product> getCheapest() {
        return products.stream()
                .sorted((a, b) -> a.getPrice() > b.getPrice() ? 1 : -1)
                .limit(1)
                .collect(Collectors.toList());
    }

    public List<Product> getNike() {
        return products.stream()
                .filter(x -> x.getName().toLowerCase().contains("nike") || x.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
    }

    public String getAverageStock() {
        double average = products.stream()
                .mapToDouble(Product::getQty).average().getAsDouble();
        average = (double) Math.round(average * 100) / 100;

        return "Average stock: " + average;
    }

    public String getMostExpensive() {
        List<Product> availableMostExpensive = products.stream()
                .filter(x -> x.getQty() > 0)
                .sorted((a, b) -> a.getPrice() > b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());

        return "Most expensive available product: " + availableMostExpensive.get(0).getName();
    }

    public List<Product> getSearch(String search) {
        return products.stream()
                .filter(x -> x.getName().toLowerCase().contains(search) || x.getDescription().toLowerCase().contains(search))
                .collect(Collectors.toList());
    }
}
