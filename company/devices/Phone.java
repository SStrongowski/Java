package company.devices;
import company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
public class Phone  extends Device{
    final public Double screenSize;
    final public String operatingSystem;
    private static Double DEFAULT_PHONE_VALUE=300.0;
    public Phone(String producer,  String model ,Integer yearOfProduction,Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction,DEFAULT_PHONE_VALUE);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }
    public String toString() {
        return this.screenSize + " " + this.operatingSystem;
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
    private static String DEFAULT_VERSION="latest-stable";
    private static String DEFAULT_SERVER_ADDRESS="google.com";
    private static String DEFAULT_PROTOCOL="https";
    public void installApp(String  appName){
        installApp(appName,DEFAULT_VERSION,DEFAULT_SERVER_ADDRESS);
    }
    public void installApp(String  appName, String version ){
        installApp(appName,version,DEFAULT_SERVER_ADDRESS);
    }
    public void installApp(String  appName, String version, String serverAddress ){
        try{
            URL url = new URL(DEFAULT_PROTOCOL, serverAddress, "/"+appName+"/"+version);
            installApp(url);
        }catch(MalformedURLException e){
            System.out.println(e);
        }
    }
    public void installApp(List<String> appNames){
        for (String appName :appNames){
            installApp(appName);
        }
    }
    public void installApp(URL url ){
        System.out.println("App installed from "+url);
    }
}