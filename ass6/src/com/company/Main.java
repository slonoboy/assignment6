package com.company;


import com.company.builder.House;
import com.company.builder.HouseBuilder;
import com.company.factory.Logistics;
import com.company.factory.Transport;
import com.company.singleton.Database;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("select * from project"); // from singleton

        System.out.println();

        Logistics l = new Logistics();
        Transport truck1 = l.planDelivery("truck");
        System.out.println(truck1.deliver());

        Transport ship1 = l.planDelivery("ship");
        System.out.println(ship1.deliver());

        House dom = new HouseBuilder(2, 3, 5).buildGarage(true).buildPool(true).build();
        System.out.println(dom);
    }
}
