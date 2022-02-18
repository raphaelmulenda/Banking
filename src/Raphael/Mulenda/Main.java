package Raphael.Mulenda;

import java.util.Scanner;

/**
 * Created by Raphael Mulenda on 15/Feb/2022.
 */

public class Main {
private static  Scanner scanner = new Scanner(System.in);
private static  Bank bank = new Bank("Bank le Palmier");

    public static void main(String[] args) {
	// write your code here
        boolean bankOpen = true;
        int selectedServices =0;
        displayService();
        while (bankOpen){
            System.out.println("Select a Service (0-> to Show Options): ");
            selectedServices = scanner.nextInt();
            switch (selectedServices) {
                case 0 -> displayService();
                case 1 -> addNewBranch();
                case 2 -> addNewCustomer();
                case 3 -> addNewTransaction();
                case 5 -> {
                    System.out.println("GoodBay!");
                    bankOpen = false;
                }
            }
        }


    }
    public static void displayService(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To show available Services.");
        System.out.println("\t 1 - To Add  New Branch.");
        System.out.println("\t 2 - To Add  New Customer.");
        System.out.println("\t 3 - To Add New Transaction.");
        System.out.println("\t 4 - To Display All Customers & Transaction.");
        System.out.println("\t 5 - To quit.");
    }

    public static void addNewBranch(){
        System.out.println("Enter a Branch Name: ");
        String branchName = scanner.nextLine();
        scanner.nextLine();
        if (bank.addBranch(branchName)){
            System.out.println(branchName + "The Branch has been added to database");
        }
        else {
            System.out.println(branchName + "The entered branch exist in database");
        }
    }

    public static void addNewCustomer(){
        System.out.println("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter Initial Cash: ");
        double initCash = scanner.nextDouble();

        if (bank.addCustomer(branchName,customerName,initCash)){
            System.out.println("");
        }

    }

    public static void addNewTransaction(){
        System.out.println("Enter Branch Name: ");
        String branchName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter Initial Cash: ");
        double initCash = scanner.nextDouble();

        if (bank.addCustomerTransaction(branchName,customerName,initCash)){
            System.out.println("");
        }
    }
}
