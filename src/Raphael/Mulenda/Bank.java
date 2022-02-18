package Raphael.Mulenda;

import java.util.ArrayList;

/**
 * Created by Raphael Mulenda on 15/Feb/2022.
 */

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch checkedBranch = findBranch(branchName);
        if (checkedBranch == null) {
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
            //System.out.println(branchName + " has been haded to database");
            return true;

        }
        //System.out.println(branchName + " Exist in database");
        return false;

    }

    public boolean addCustomer(String branchName, String customerName, double initCash) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initCash);

        }
        else {System.out.println("Branch does not exist in database");
        return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double newCash) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            if (branch.addCustomerTransaction(customerName, newCash)) {
                System.out.println("Transaction Successful");
                return true;
            }
        }
        System.out.println("Branch does not exist in database");
        return false;
    }


    private Branch findBranch(String branchName) {
        for (Branch checkedBranch : this.branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }


    public boolean listCustomer(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customers = branch.getCustomers();
            System.out.println("Customer details for branch " + branch.getName());
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
                if (showTransaction) {
                    System.out.println("Transactions");
                    System.out.println("[" + (i + 1) + "]" + " Amount: " + customers.get(i).getTransactions());

                }


            }
            return true;

        }
        return false;
    }
}

