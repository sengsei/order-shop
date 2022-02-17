package de.neuefische.ordershop;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ShopServiceTest {

    @Test
    void testGetProducts() {
        List<Product> products = List.of(new Product(), new Product());

        ProductRepo dbMockProduct = mock(ProductRepo.class);
        OrderRepo dbMockOrder = mock(OrderRepo.class);

        when(dbMockProduct.getProducts()).thenReturn(products);

        ShopService service = new ShopService(dbMockProduct, dbMockOrder);

        List<Product> result = service.getProducts();

        assertEquals(products, result);
    }

    @Test
    void testGetProduct() {
        Product product = new Product();
        ProductRepo dbMockProduct = mock(ProductRepo.class);
        OrderRepo dbMockOrder = mock(OrderRepo.class);
        when(dbMockProduct.getProductByName("Klaus")).thenReturn(Optional.of(product));

        ShopService shopService = new ShopService(dbMockProduct, dbMockOrder);
        Optional<Product> result = shopService.getProductByName("Klaus");

        assertEquals(Optional.of(product), result);
    }

    @Test
    void testCreateProduct(){
        Product product = new Product();
        ProductRepo dbMockProduct = mock(ProductRepo.class);
        OrderRepo dbMockOrder = mock(OrderRepo.class);
        ShopService shopService = new ShopService(dbMockProduct, dbMockOrder);
        shopService.addProduct(product);

        verify(dbMockProduct).addProduct(product);
    }

    @Test
    void testGetProductsByName(){
        Product p1 = new Product();
        p1.setName("Phone");

        ProductRepo dbMockProduct = mock(ProductRepo.class);
        OrderRepo dbMockOrder = mock(OrderRepo.class);
        ShopService shopService = new ShopService(dbMockProduct, dbMockOrder);



    }

}