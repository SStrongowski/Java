package company.devices;

import company.saleable;
import company.Human;
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
    public Car(String producer, String model,Integer yearOfProduction,Double enginePower, String color) {
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.model=model;
        this.color = color;
        this.enginePower = enginePower;
    }
    public boolean equals(Object x) {
        if (this == x){
            return true;
        }  
        
        if (x == null || this.getClass() != x.getClass()){
            return false;
        }
        Car xCar= (Car) x;
        return  this.producer == xCar.producer &&
        this.yearOfProduction == xCar.yearOfProduction&&
        this.model == xCar.model &&
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
    public void sell(Human seller, Human buyer, Double price){
        Double buyerCash = buyer.getCash();
        Double sellerCash = seller.getCash();
        Car sellerCar = seller.getCar();
        System.out.println("Before transaction: Seller balance "+ sellerCash+", seller Car "+sellerCar);
        System.out.println("Before transaction: Buyer balance "+buyerCash+", buyer Car "+buyer.getCar());
        System.out.println("Starting transaction ...");
        
        System.out.println("checking that seller have this car:");
        if (!this.equals(sellerCar)){
            System.out.println("Seller doesn't have this car");
            return;
        }
        System.out.println("right, seller own this car");
        System.out.println("checking that buyer have enough cash:");
     
        if (price > buyerCash){
            System.out.println("Buyer have not enough cash");
            return;
        }
        System.out.println("right, buyer have enough cash");
        System.out.println("processing transaction ...");
        seller.setCash(sellerCash+price);
        seller.setCar(null);
        buyer.setCar(sellerCar);
        buyer.setCash(buyerCash-price);
        System.out.println("transaction complete");
        System.out.println("After transaction: Seller balance "+ seller.getCash()+", seller Car "+seller.getCar());
        System.out.println("After transaction: Buyer balance "+buyer.getCash()+", buyer Car "+buyer.getCar());
    }
}