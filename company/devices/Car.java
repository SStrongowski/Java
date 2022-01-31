package company.devices;

public class Car {
    public String producer;
    public String model;
    public Double enginePower;
    public String color;
    public Double value;

    public Car(String producer, String model, Double enginePower, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
        this.value=value;
    }
    public boolean equals(Object x) {
        if (this == x){
            return true;
        }  
        
        if (x == null || this.getClass() != x.getClass()){
            return false;
        }
        Car xCar= (Car) x;
        return this.producer == xCar.producer && 
        this.model == xCar.model &&
        this.enginePower.compareTo(xCar.enginePower) == 0 &&
        this.color == xCar.color &&
        this.value.compareTo(xCar.value) == 0;
    }
    public String toString() {
        return producer + " " + model + " " + + enginePower + " " + color+" "+value;
    }
}