package company.devices;
import company.Human;
import java.lang.Object;
public abstract class Car  extends Device implements Comparable<Car> {
    public Double enginePower;
    public String color;
    private static Double DEFAULT_CAR_VALUE=1000.0;
    public Car(String producer, String model,Integer yearOfProduction,Double enginePower, String color, Double value) {
        super(producer, model, yearOfProduction,value);
        this.color = color;
        this.enginePower = enginePower;
    
    }    
    public Car(String producer, String model,Integer yearOfProduction,Double enginePower, String color) {
        super(producer, model, yearOfProduction,DEFAULT_CAR_VALUE);
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
    public String toString() {
        return super.toString()+" "+this.enginePower+" "+this.color+" "+this.value;
    }
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        Double sellerCash =seller.getCash();
        Double buyerCash =buyer.getCash();
        System.out.println("Before transaction: Seller balance "+ sellerCash);
        System.out.println("Before transaction: Buyer balance "+buyerCash);
        System.out.println("Starting transaction ...");
        
        if(!seller.hasACar(this)){
            throw new Exception("Seller don't have this car");
        }
        if(!buyer.hasAFreePlace()){
            throw new Exception("Buyer have not enough place in garage");
        }
        if(buyerCash < price){
            throw new Exception("Buyer have not enough cash");
        }
        seller.removeCarFromGarage(this);
        buyer.setCar(this);
        buyer.setCash(buyerCash-value);
        seller.setCash(sellerCash+value);
        System.out.println("transaction complete");
        System.out.println("After transaction: Seller balance "+ seller.getCash());
        System.out.println("After transaction: Buyer balance "+buyer.getCash());
    }
    @Override
    public int compareTo(Car car) {
        return this.yearOfProduction -car.yearOfProduction;
    }
    public abstract void refuel();
}