package de.neuefische.ordershop;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ShopService shopService;

    public ProductController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return shopService.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        shopService.addProduct(product);
    }

    @GetMapping("/search")
    public Optional<Product> search(@RequestParam String searchValue){
        return shopService.getProductByName(searchValue);
    }
}
