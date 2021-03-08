package com.company.builder;

public interface Builder {
    public HouseBuilder buildWalls(int num);
    public HouseBuilder buildDoors(int num);
    public HouseBuilder buildWindows(int num);
    public HouseBuilder buildRoof(boolean is);
    public HouseBuilder buildGarage(boolean is);
    public HouseBuilder buildGarden(boolean is);
    public HouseBuilder buildPool(boolean is);
    public HouseBuilder buildStatues(boolean is);
}
