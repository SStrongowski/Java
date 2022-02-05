package company;

import java.time.LocalDateTime;

public class Transaction implements Comparable<Transaction> {
    private Human seller;
    private Human buyer;
    private Double price;
    private  LocalDateTime date;
    public Transaction(Human seller, Human buyer, Double price) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.date = LocalDateTime.now();
    }
    @Override
    public int compareTo(Transaction tx) {
        return this.date.compareTo(tx.date);
    }
    public Human getBuyer() {
        return buyer;
    }
    public Human getSeller() {
        return seller;
    }
    public String toString() {
        return "\nseller: " + this.seller + "\nbuyer: " + this.buyer+ "\nprice: " + this.price + "\ntransaction date: " + this.date.toString();
    }
}
