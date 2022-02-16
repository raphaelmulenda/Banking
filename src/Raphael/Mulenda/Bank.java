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

    public boolean addBranch(String branchName){
        Branch checkedBranch = findBranch(branchName);
        if (checkedBranch == null){
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
            System.out.println(branchName + " has been haded to database");
            return true;

        }
        System.out.println(branchName + " Exist database");
        return false;

    }



    private Branch findBranch(String branchName){
        for (Branch branches : this.branches){
            if (branches.getName().equals(branchName)){
                return branches;
            }
        }
        return null;
    }
}
