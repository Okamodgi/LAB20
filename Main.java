public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport truck = factory.createTransport("truck");
        truck.deliver();

        Transport ship = factory.createTransport("ship");
        ship.deliver();

        Transport plane = factory.createTransport("plane");
        plane.deliver();
    }
}