package company;
public class Main {

    public static void main(String[] args) {

    Animal dog = new Animal("dog", "Dżekuś");
    dog.feed();
    dog.takeForWalk();

    Animal cat = new Animal("cat", "Bambik");
    cat.feed();
    for (int i=0; i<6;i++){
        cat.takeForWalk();
    }
    Human me =new Human("Sebastian","Strongowski","+48123456789");

    me.changeSalary(-100.0);
    me.changeSalary(2999.99);
    me.getSalary();
    Car passeratti = new Car("vw", "passat",90.0, "czarna strzała",1000.0);
    me.canIBuyThisCar(passeratti);

    me.changeSalary(331.0);
    me.canIBuyThisCar(passeratti);
    
    me.changeSalary(2221.0);
    me.canIBuyThisCar(passeratti);
    
    me.changeSalary(1.0);
    me.canIBuyThisCar(passeratti);
    }
    
}