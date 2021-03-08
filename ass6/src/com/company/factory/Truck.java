package com.company.factory;

public class Truck implements Transport {
    @Override
    public String deliver(){
        return "Deliver by truck";
    }
}
