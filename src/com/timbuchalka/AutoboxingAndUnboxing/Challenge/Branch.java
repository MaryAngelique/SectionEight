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


}
