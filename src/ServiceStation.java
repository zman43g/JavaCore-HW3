public class ServiceStation {
    public void check(Transport transport) {
        if (transport.getClass() == Car.class) {
            ((Car) transport).check();
        }
        if (transport.getClass() == Truck.class) {
            ((Truck) transport).check();
        }
        if (transport.getClass() == Bicycle.class) {
            ((Bicycle) transport).check();
        }
    }

}


