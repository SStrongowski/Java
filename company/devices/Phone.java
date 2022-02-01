package company.devices;
import company.Animal;
import company.Human;
public class Phone  extends Device{
    final public Double screenSize;
    final public String operatingSystem;

    public Phone(String producer,  String model ,Integer yearOfProduction,Double screenSize, String operatingSystem) {
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.model=model;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }
    public boolean equals(Object x) {
        if (this == x){
            return true;
        }  
        if (x == null || this.getClass() != x.getClass()){
            return false;
        }
        Phone xPhone= (Phone) x;
        return  this.producer == xPhone.producer &&
        this.yearOfProduction == xPhone.yearOfProduction&&
        this.model == xPhone.model &&
        this.screenSize.compareTo(xPhone.screenSize) == 0 &&
        this.operatingSystem == xPhone.operatingSystem;
    }
    public String asString() {
        return this.operatingSystem + " " + this.screenSize ;
    }
    @Override
    public void turnOn() {
        this.mode = "on";
        System.out.println(this.model+" starting...");
    }
    public void sell(Human seller, Human buyer, Double price){
        Double buyerCash = buyer.getCash();
        Double sellerCash = seller.getCash();
        Phone sellerPhone = seller.getPhone();
        System.out.println("Before transaction: Seller balance "+ sellerCash+", seller Phone "+sellerPhone);
        System.out.println("Before transaction: Buyer balance "+buyerCash+", buyer Phone "+buyer.getPhone());
        System.out.println("Starting transaction ...");
        
        System.out.println("checking that seller have this phone:");
        if (!this.equals(sellerPhone)){
            System.out.println("Seller doesn't have this phone");
            return;
        }
        System.out.println("right, seller own this phone");
        System.out.println("checking that buyer have enough cash:");
     
        if (price > buyerCash){
            System.out.println("Buyer have not enough cash");
            return;
        }
        System.out.println("right, buyer have enough cash");
        System.out.println("processing transaction ...");
        seller.setCash(sellerCash+price);
        seller.setPhone(null);
        buyer.setPhone(sellerPhone);
        buyer.setCash(buyerCash-price);
        System.out.println("transaction complete");
        System.out.println("After transaction: Seller balance "+ seller.getCash()+", seller Phone "+seller.getPhone());
        System.out.println("After transaction: Buyer balance "+buyer.getCash()+", buyer Phone "+buyer.getPhone());
    }
}