package company.creatures;

import company.Human;
import company.saleable;

public abstract class Animal implements saleable,Feedable {
    final String species;
    public String name;
    private Double weight;
    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species == "dog"){
            this.weight = 8.0;
        }else if (species =="cat"){
            this.weight = 3.0;
        }else{
            weight = 1.0; 
        }
    }
    public Animal(String species, String name,Double weight) {
        this.species = species;
        this.name = name;
        this.weight=weight;
    }
    public boolean equals(Object x) {
        if (this == x){
            return true;
        }  
        if (x == null || this.getClass() != x.getClass()){
            return false;
        }
        Animal xPet= (Animal) x;
        return  this.species == xPet.species &&
        this.name == xPet.name &&
        this.weight.compareTo(xPet.weight) == 0;
    }
    @Override
    public void feed() {
        if (this.weight <= 0)
            System.out.println(this.name+"RIP");
        else {
            weight += 1;
            System.out.println(this.name+ "Weight increased to " + this.weight + " kg");
        }
    }
    @Override
    public void feed(Double foodWeight) {
        if (this.weight <= 0)
            System.out.println(this.name+"RIP");
        else {
            weight += foodWeight;
            System.out.println(this.name+ "Weight increased to " + this.weight + " kg");
        }
    }

    public void takeForWalk() {
        if (this.weight <= 0)
            System.out.println(this.name+" is dead");
        else {
            weight -= 1;
            System.out.println(this.name+"Weight reduced to " + this.weight + " kg");
        }

    }
    protected void kill() {
        System.out.println("RIP");
        this.weight = 0.0;
    }
    public String toString(){
        return this.species + " " + this.name + " " + this.weight;
    }
    public void sell(Human seller, Human buyer, Double price){
        Double buyerCash = buyer.getCash();
        Double sellerCash = seller.getCash();
        Animal sellerPet = seller.getPet();
        System.out.println("Before transaction: Seller balance "+ sellerCash+", seller Pet "+sellerPet);
        System.out.println("Before transaction: Buyer balance "+buyerCash+", buyer Pet "+buyer.getPet());
        System.out.println("Starting transaction ...");
        
        System.out.println("checking that seller have this pet:");
        if (!this.equals(sellerPet)){
            System.out.println("Seller doesn't have this pet");
            return;
        }
        System.out.println("right, seller own this pet");
        System.out.println("checking that buyer have enough cash:");
     
        if (price > buyerCash){
            System.out.println("Buyer have not enough cash");
            return;
        }
        System.out.println("right, buyer have enough cash");
        System.out.println("processing transaction ...");
        seller.setCash(sellerCash+price);
        seller.setPet(null);
        buyer.setPet(sellerPet);
        buyer.setCash(buyerCash-price);
        System.out.println("transaction complete");
        System.out.println("After transaction: Seller balance "+ seller.getCash()+", seller Pet "+seller.getPet());
        System.out.println("After transaction: Buyer balance "+buyer.getCash()+", buyer Pet "+buyer.getPet());
    }
}