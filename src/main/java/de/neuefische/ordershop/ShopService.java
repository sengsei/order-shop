package de.neuefische.ordershop;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public List<Product> getProducts() {
        return productRepo.getProducts();
    }

    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    public List<Order> getOrders() {
        return orderRepo.getOrders();
    }

    public Optional<Order> getOrderWithID(String id) {
        return orderRepo.getOrderWithId(id);
    }

    public void addOrder(Order order) {
        orderRepo.addOrder(order);
    }

    public Optional<Product> getProductByName(String searchValue) {
        return productRepo.getProductByName(searchValue);
    }
}
