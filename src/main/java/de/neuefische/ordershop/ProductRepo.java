package de.neuefische.ordershop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        for (Product product : products){
            if (product.getName().equals(searchValue)){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
