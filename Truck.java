package com.company;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Грузовик доставляет груз по дороге");
    }
}
