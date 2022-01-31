package company.devices;

public class Car  extends Device{
    public Double enginePower;
    public String color;
    public Double value;
    public Car(String producer, String model,Integer yearOfProduction,Double enginePower, String color, Double value) {
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.model=model;
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
        return
        this.enginePower.compareTo(xCar.enginePower) == 0 &&
        this.color == xCar.color &&
        this.value.compareTo(xCar.value) == 0;
    }
    public void turnOn() {
        this.mode = "on";
        System.out.println("wrum wrum");
    }
    public String asString() {
        return this.enginePower + " " + this.color+" "+this.value;
    }
    
}