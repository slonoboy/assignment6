package com.company.factory;

public class Logistics {
    public Transport planDelivery(String transport){
        Transport t = createTransport(transport);
        return t;
    }

    public Transport createTransport(String transport){
        if (transport.equalsIgnoreCase("truck")){
            return new Truck();
        }
        else return new Ship();
    }
}
