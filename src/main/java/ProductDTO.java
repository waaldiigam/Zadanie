package main.java;

import main.java.ProductType;

public class ProductDTO {
    private String name;
    private String description;
    private ProductType type;
    private float price;
    private long counter;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public long incrementedCounter() {
        this.counter += 1;
        return counter;
    }
}
