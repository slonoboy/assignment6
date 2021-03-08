package com.company.builder;

public class House {
    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;
    private boolean garden;
    private boolean statues;
    private boolean pool;

    House(HouseBuilder builder){
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roof = builder.roof;
        this.garage = builder.garage;
        this.garden = builder.garden;
        this.statues = builder.statues;
        this.pool = builder.pool;
    }

    public String toString(){
        return "Your house looks like: " + this.doors + " doors, " +  this.walls + " walls, " +  this.windows + " windows, " +  this.roof + " roof, " +  this.garage + " garage, " +  this.garden + " garden, " +  this.statues + " statues, " +  this.pool + " pool";
    }
}
