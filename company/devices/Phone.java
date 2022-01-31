package company.devices;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }
    public String toString() {
        return producer + " " + model + " " + operatingSystem + " " + screenSize ;
    }
}