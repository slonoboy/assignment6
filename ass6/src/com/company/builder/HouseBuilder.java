package com.company.builder;

public class HouseBuilder implements Builder{
    int walls;
    int doors;
    int windows;
    boolean roof;
    boolean garage;
     boolean garden;
     boolean statues;
     boolean pool;


    public HouseBuilder(int walls, int doors, int windows){
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
    }
    @Override
    public HouseBuilder buildWalls(int num) {
        this.walls = num;
        return this;
    }

    @Override
    public HouseBuilder buildDoors(int num) {
        this.doors = num;
        return this;
    }

    @Override
    public HouseBuilder buildWindows(int num) {
        this.windows = num;
        return this;
    }

    @Override
    public HouseBuilder buildRoof(boolean is) {
        this.roof = is;
        return this;
    }

    @Override
    public HouseBuilder buildGarage(boolean is) {
        this.garage = is;
        return this;
    }

    @Override
    public HouseBuilder buildGarden(boolean is) {
        this.garden = is;
        return this;
    }

    @Override
    public HouseBuilder buildPool(boolean is) {
        this.pool = is;
        return this;
    }

    @Override
    public HouseBuilder buildStatues(boolean is) {
        this.statues = is;
        return this;
    }

    public House build() {
        House house =  new House(this);
        return house;
    }
}
