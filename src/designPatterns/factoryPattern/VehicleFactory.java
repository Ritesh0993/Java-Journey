package designPatterns.factoryPattern;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("bike".equalsIgnoreCase(type)) {
            return new Bike();
        } else {
            return null;
        }
    }
}
