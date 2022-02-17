package de.neuefische.ordershop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepo {
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public Optional<Order> getOrderWithId(String id) {
        for (Order order : orders){
            if (order.getId().equals(id)){
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }

    public void addOrder(Order order) {
       orders.add(order);
    }
}
