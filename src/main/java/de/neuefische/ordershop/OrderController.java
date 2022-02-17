package de.neuefische.ordershop;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final ShopService shopService;

    public OrderController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<Order> getOrders(){
        return shopService.getOrders();
    }

    @GetMapping("{id}")
    public Optional<Order> getOrderWithId(@PathVariable String id){
        return shopService.getOrderWithID(id);
    }

    @PostMapping("addOrder")
    public void addOrder(@RequestBody Order order){
        shopService.addOrder(order);
    }


}
