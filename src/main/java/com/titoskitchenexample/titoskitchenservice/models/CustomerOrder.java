package com.titoskitchenexample.titoskitchenservice.models;

import java.util.ArrayList;

public class CustomerOrder {
    private String name;
    private String address;
    private String postcode;
    private String phoneNumber;
    private ArrayList<Dessert> order;

    public CustomerOrder(String name, String address, String postcode, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
        ArrayList<Dessert> order = new ArrayList<>();
    }
}
