package Raphael.Mulenda;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Raphael Mulenda on 15/Feb/2022.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name,double initCash){
        if (findCustomer(name) ==null){
            Customer newCustomer = new Customer(name,initCash);
            this.customers.add(newCustomer);
            System.out.println("New Customer added Successfully");
            return true;
        }
        System.out.println(name + " exist in contacts");
        return false;

    }
    public boolean addCustomerTransaction(String name, double newTransaction){
        if (findCustomer(name)!=null){
            Customer theCustomer = findCustomer(name);
            assert theCustomer != null;
            theCustomer.addTransaction(newTransaction);
            return true;
        }
        System.out.println(name + " does not exist in customers directory");
        return false;
    }

    private  Customer findCustomer(String customerName){
        Iterator<Customer> lc = this.customers.iterator();
        while(lc.hasNext()){
            if (lc.next().getName().equals(customerName)){
                return lc.next();
            }

        }
        return null;

    }
}
