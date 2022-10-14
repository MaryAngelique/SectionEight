package com.timbuchalka.AutoboxingAndUnboxing.Challenge;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {

        if(findCustomer(customerName) == null) {

            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }

        return false;
    }



}
