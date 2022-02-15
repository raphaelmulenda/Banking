package Raphael.Mulenda;
/**
 * Created by Raphael Mulenda on 15/Feb/2022.
 */
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initCash) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initCash);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
