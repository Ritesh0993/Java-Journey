package designPatterns.factoryPattern;

public class FactoryTest {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        System.out.println(car !=null ? car.getType():"unknown Vehicle");
    }
}
