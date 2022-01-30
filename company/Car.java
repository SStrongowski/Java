package company;

public class Car {
    public String producer;
    public String model;
    public Double enginePower;
    public String color;

    public Car(String producer, String model, Double enginePower, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
    }
}