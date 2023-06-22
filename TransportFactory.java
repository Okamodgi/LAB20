package com.company;

public class TransportFactory {
    public Transport createTransport(String type) {
        if (type.equals("truck")) {
            return new Truck();
        } else if (type.equals("ship")) {
            return new Ship();
        } else if (type.equals("plane")) {
            return new Plane();
        } else {
            throw new IllegalArgumentException("Неизвестный тип транспорта");
        }
    }
}
