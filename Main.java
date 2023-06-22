
public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport truck = factory.createTransport("Машина");
        truck.deliver();

        Transport ship = factory.createTransport("Лодка");
        ship.deliver();

        Transport plane = factory.createTransport("Лайнер");
        plane.deliver();
    }
}