

public class TransportFactory {
    public Transport createTransport(String type) {
        if (type.equals("Машина")) {
            return new Truck();
        } else if (type.equals("Лодка")) {
            return new Ship();
        } else if (type.equals("Лайнер")) {
            return new Plane();
        } else {
            throw new IllegalArgumentException("Неизвестный тип транспорта");
        }
    }
}
