package com.company.factory;

public class Ship implements Transport {
    @Override
    public String deliver(){
        return "Deliver by ship";
    }
}
