package designPatterns.factoryPattern;

public class Car implements Vehicle{

    @Override
    public String getType() {
        return "car";
    }
}