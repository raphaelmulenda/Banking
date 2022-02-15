package Raphael.Mulenda;

import java.util.ArrayList;

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
}
