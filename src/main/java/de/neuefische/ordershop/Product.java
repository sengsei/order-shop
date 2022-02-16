package de.neuefische.ordershop;

import java.util.UUID;

public class Product {
    private String id;
    private String name;

    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
