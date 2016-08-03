package com.amir.business;

import java.io.Serializable;

// implements Serializable as we  pass this class between different application layers.
public class Product implements Serializable {

    private String description;
    private Double price;

    public void setDescription(String s) {
        description = s;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Double d) {
        price = d;
    }

    public Double getPrice() {
        return price;
    }

}