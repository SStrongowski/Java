package company;

import company.devices.Car;
import company.devices.Phone;
public class Main {

    public static void main(String[] args) {

    Animal dog = new Animal("dog", "Dżekuś");
    // dog.feed();
    // dog.takeForWalk();

    // Animal cat = new Animal("cat", "Bambik");
    // cat.feed();
    // for (int i=0; i<6;i++){
    //     cat.takeForWalk();
    // }
   

    // me.changeSalary(-100.0);
    // me.changeSalary(2999.99);
    // me.getSalary();
  
    // Car anotherPassat = new Car("vw", "passat", 1990 ,90.0, "czarna strzala",1000.0);
    // System.out.println( passeratti==anotherPassat);
    // System.out.println( passeratti.equals(anotherPassat));
    // System.out.println(passeratti);
    // System.out.println(me);
    // System.out.println(dog);

    Phone phone = new Phone("xiaomi","12 extra trubo +",2020, 6.0,"android");
    // phone.turnOn();
    // passeratti.turnOn();
    Car passeratti = new Car("vw", "passat", 1990 ,90.0, "czarna strzala");
    Human me =new Human("Sebastian","Strongowski",10.0, passeratti,null,dog);
    Human someone =new Human("Sebastian","Strongowski",1000.2,phone);
    System.out.println("--------------------------------------------------------");
    passeratti.sell(me, someone, 1000.0);
    System.out.println("--------------------------------------------------------");
    phone.sell(me, someone, 1000.0);
    System.out.println("--------------------------------------------------------");
    phone.sell(someone,me, 1000.0);
    System.out.println("--------------------------------------------------------");
    dog.sell(me,someone, 1000.0);
    System.out.println("--------------------------------------------------------");
    

    }
    
}