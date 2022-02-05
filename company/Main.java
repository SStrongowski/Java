package company;

import company.creatures.Animal;
import company.creatures.FarmAnimal;
import company.creatures.Pet;
import company.devices.Car;
import company.devices.Electic;
import company.devices.Lpg;
import company.devices.Phone;
import java.util.Arrays;
import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;
public class Main {

    public static void main(String[] args) throws MalformedURLException, Exception {

    Animal dog = new Pet("dog", "Dżekuś");
    dog.feed();
    dog.takeForWalk();

    Animal cat = new Pet("cat", "Bambik");
    cat.feed();
    for (int i=0; i<6;i++){
        cat.takeForWalk();
    }
    Car passeratti = new Electic("vw", "passat", 1990 ,90.0, "czarna strzala",1000.0);
    Human me =new Human("Sebastian","Strongowski",10.0, 4,null,dog);
    //me.setCar(passeratti);
    me.changeSalary(-100.0);
    me.changeSalary(2999.99);
    me.getSalary();
  
    Car anotherPassat = new Lpg("vw", "passat", 1995 ,90.0, "czarna strzala",1000.0);
    System.out.println( passeratti==anotherPassat);
    System.out.println( passeratti.equals(anotherPassat));
    System.out.println(passeratti);
    System.out.println(me);
    System.out.println(dog);
    Phone phone = new Phone("xiaomi","12 extra trubo +",2020, 6.0,"android");
    phone.turnOn();
    passeratti.turnOn();

    Human someone =new Human("Sebastian","Strongowski",1000.2,phone);
 
   
    System.out.println("--------------------------------------------------------");
    phone.sell(me, someone, 1000.0);
    System.out.println("--------------------------------------------------------");
    phone.sell(someone,me, 1000.0);
    System.out.println("--------------------------------------------------------");
    dog.sell(me,someone, 1000.0);
    System.out.println("--------------------------------------------------------");

    FarmAnimal cow = new FarmAnimal("cow", "basia");
    cow.feed(10.0);
    dog.feed();
    cow.beEaten();
    URL url = new URL("http", "fajneapki.com", "apka.exe");
    List<String> appNameList = Arrays.asList("MiniMargo", "Messenger", "Snapchat");
    phone.installApp("PhotoMath");
    phone.installApp("Chrome", "85.0.1");
    phone.installApp("FajnaApka", "9.0", "www.fajneapki.pl/");
    phone.installApp(appNameList);
    phone.installApp(url);
    System.out.println("--------------------------------------------------------");
    System.out.println(passeratti);
    System.out.println(anotherPassat);
    System.out.println("--------------------------------------------------------");
    System.out.println(me.getCash());
    Human idkWhoIsHe=new Human("Seba","Strongowski",1023123.0, 6);
    Car anotherPassat2 = new Lpg("vw", "passat", 1995 ,90.0, "czarna strzala",1000.0);
    Car anotherPassat3= new Lpg("vw", "passat", 1995 ,90.0, "czarna strzala",1000.0);
    idkWhoIsHe.setCar(anotherPassat3);
    System.out.println("--------------------------------------------------------");
    System.out.println(anotherPassat3.getTransactions());
    anotherPassat3.sell(idkWhoIsHe, me, 500.0);
    System.out.println("--------------------------------------------------------");
    System.out.println(anotherPassat3.getTransactions());
    anotherPassat3.sell(me, idkWhoIsHe, 500.0);
    me.setCar(anotherPassat2);
    try{
        anotherPassat3.sell(me, idkWhoIsHe, 500.0);
    }catch(Exception e){
        System.out.println(e);
    }
    System.out.println(anotherPassat3.wasOwner(me));
    System.out.println(anotherPassat3.transactionTookPlace(me, idkWhoIsHe));
    System.out.println(anotherPassat2.transactionTookPlace(me, idkWhoIsHe));
    System.out.println(anotherPassat3.howManyTransactions());
    }
}