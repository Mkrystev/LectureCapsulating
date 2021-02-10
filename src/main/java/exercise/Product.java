package exercise;

import lombok.Getter;

@Getter

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product can not be empty!");
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost can not be negative!");
        }
        this.cost = cost;
    }


}
