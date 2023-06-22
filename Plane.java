package com.company;

public class Plane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Самолет доставляет груз по воздуху");
    }
}
