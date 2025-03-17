package com.ecom.product_service;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;

@RestController

@RequestMapping("/products")

public class ProductController {

    

    private List<String> productList = new ArrayList<>();

    public ProductController() {

        // Sample Amazon products

        productList.add("Amazon Echo");

        productList.add("Fire TV Stick");

        productList.add("Kindle Paperwhite");

    }

    @GetMapping

    public List<String> getProducts() {

        return productList;

    }

    @PostMapping("/add")

    public String addProduct(@RequestBody String productName) {

        productList.add(productName);

        return productName + " added successfully!";

    }

    @DeleteMapping("/delete")

    public String deleteProduct(@RequestBody String productName) {

        if (productList.remove(productName)) {

            return productName + " removed successfully!";

        } else {

            return productName + " not found!";

        }

    }

}

