package de.neuefische.ordershop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Repository
public class ProductRepo {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Optional<Product> getProductByName(String searchValue) {

        Optional<Product> nameOfProduct = products.stream()
                .filter(n -> n.getName().equals(searchValue))
                .findFirst();

        return nameOfProduct;
    }

}
