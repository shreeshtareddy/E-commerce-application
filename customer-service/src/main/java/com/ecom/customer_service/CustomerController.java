package com.ecom.customer_service;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;

@RestController

@RequestMapping("/customers")

public class CustomerController {

    private List<String> customerList = new ArrayList<>();

    public CustomerController() {

        // Sample Amazon customers

        customerList.add("John Doe");

        customerList.add("Jane Smith");

        customerList.add("Alice Brown");

    }

    // Get all customers

    @GetMapping

    public List<String> getCustomers() {

        return customerList;

    }

    // Add a new customer

    @PostMapping("/add")

    public String addCustomer(@RequestBody String customerName) {

        customerList.add(customerName);

        return "Customer '" + customerName + "' added successfully!";

    }

    // Delete a customer

    @DeleteMapping("/delete")

    public String deleteCustomer(@RequestBody String customerName) {

        if (customerList.remove(customerName)) {

            return "Customer '" + customerName + "' removed successfully!";

        } else {

            return "Customer '" + customerName + "' not found!";

        }

    }

}



