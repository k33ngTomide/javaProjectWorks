package Assignments.Array;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    private String storeName = "STANDARD GROCERIES STORE";
    private String branch = "MAIN BRANCH";
    private String storeAddress = "497, C-WAY, LAGOS STATE, NIGERIA.";
    private String telephone = "+334228127223";
    private LocalDate date = LocalDate.now();
    private String customerName;
    private String cashierName;
    private ArrayList<String> itemsBought = new ArrayList<>();
    private ArrayList<Double> itemPrice = new ArrayList<>();
    private ArrayList<Integer> itemPieces = new ArrayList<>();
    private double discount;
    private double subTotal;
    private double customerBillTotal;
    private double amountPaid;
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CheckOutApp checkOutApp = new CheckOutApp();
        checkOutApp.StartInfoInput();
        checkOutApp.billPage();
        checkOutApp.receipt();
    }

    public String getStoreName() {
        return storeName;
    }

    public String getBranch() {
        return branch;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public String getCustomerName() {
        return customerName;
    }


    public LocalDate getDate() {
        return date;
    }

    public double getDiscount() {
        return discount;
    }



    public void StartInfoInput(){

        System.out.println("What is the Customer's name? ");
        String userInput = scan.nextLine();
        if(userInput.matches("\\D*")) {customerName = userInput; itemNameInput();}
        else{
            System.out.println("This is not a valid name, Input a valid name");
            StartInfoInput();
        }
    }

    private void moreItems(){
        System.out.println("Add more Items?");
        String userInput = scan.nextLine();
        boolean isYes = "yes".equalsIgnoreCase(userInput);
        boolean isNo = "no".equalsIgnoreCase(userInput);
        if (isYes) {itemNameInput();}
        else if(isNo){ cashierInfo();}
        else {
            System.out.println("Invalid Input, " +
                    "\nEnter Yes (if there are more items) or " +
                    "\nNo (if there is no more item)");
            moreItems();
        }
    }

    private void cashierInfo() {
        System.out.println("What is your name?");
        String userInput = scan.nextLine();
        if(userInput.matches("\\D*")) {cashierName = userInput; discountGiven();}
        else{
            System.out.println("This is not a valid name, Input a valid name");
            cashierInfo();
        }
    }

    private void discountGiven() {
        System.out.println("How much discount will customer get?");
        String discount = scan.nextLine();

        if(discount.matches("^(0|[1-9]\\d*)(\\.\\d+)?$")) {
            if (Double.parseDouble(discount) >= 0 && Double.parseDouble(discount) < 100) {
                this.discount = Double.parseDouble(discount);
            } else {
                System.out.println("Invalid discount, try again");
                discountGiven();
            }
        } else {
            System.out.println("Invalid discount, try again");
            discountGiven();
        }
        System.out.println();
    }

    private void itemNameInput(){

        System.out.println("What did the user buy?");
        String userInput = scan.nextLine();

        if(userInput.matches("\\D*")) {
            itemsBought.add(userInput);
            piecesInput();
        } else {
            System.out.println("Input invalid");
            itemNameInput();
        }
    }

    private void piecesInput() {
        System.out.println("How many pieces");
        String pieces = scan.nextLine();

        if(pieces.matches("^(0|[1-9]\\d*)")) {
            if (Integer.parseInt(pieces) > 0) {
                itemPieces.add(Integer.parseInt(pieces));
                priceInput();
            } else {
                System.out.println("Invalid Input, pieces can not be less than 0, try again");
                piecesInput();
            }
        }
        else{
            System.out.println("Invalid, input the number of pieces bought");
            piecesInput();
        }
    }

    private void priceInput() {
        System.out.println("How much per unit?");
        String productPrice = scan.nextLine();
        if(productPrice.matches("^(0|[1-9]\\d*)")) {
            if (Double.parseDouble(productPrice) > 0) {
                itemPrice.add(Double.parseDouble(productPrice));
                moreItems();
            } else {
                System.out.println("Invalid input, input the product price");
                priceInput();
            }
        } else {
            System.out.println("Invalid input, input the product price");
            priceInput();
        }
    }

    public void billPage(){
        headingInfo();
        doubleDesign();
        System.out.printf("%10s %10s %10s %10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        singleDesign();
        listPrinting();
        singleDesign();
        subtotal();
        doubleDesign();
        billTotal();
        doubleDesign();
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + customerBillTotal);
        doubleDesign();

        customerPay();

    }

    private void headingInfo() {
        System.out.println(storeName + "\n"+ branch + "\n" +
                "Location: " + storeAddress + "\nTEL: " + telephone +
                "\nDate: " + date + "\nCashier: " + cashierName +
                "\nCustomer name: " + customerName);
    }

    private void listPrinting() {
        for (int index = 0; index < itemsBought.size(); index++) {
            double total = itemPieces.get(index) * itemPrice.get(index);
            subTotal += total;
            System.out.printf("%10s %10d %10.2f %10.2f%n",
                    itemsBought.get(index), itemPieces.get(index), itemPrice.get(index),  total);
            
        }
    }

    private void restore(){
        subTotal = 0;
    }

    private void subtotal(){
        System.out.printf("%10s %10.2f %n%10s%10.2f %n%10s%10.2f %n", "Sub Total: " ,
                subTotal, "Discount: ", ((discount/100)*subTotal), "VAT @ 17.50%: ", ((subTotal/100)*17.5));
    }

    private void billTotal(){
        double bill = subTotal - ((discount/100)*subTotal) + ((subTotal/100)*17.5);
        customerBillTotal = bill;
        System.out.printf("%20s%10.2f%n", "Bill Total: ", bill);
    }

    private static void doubleDesign() {
        System.out.println("=".repeat(50));
    }
    private static void singleDesign() {
        System.out.println("-".repeat(50));
    }

    private void customerPay(){
        System.out.println("How much did the customer give you?");
        String userInput = scan.nextLine();
        if(userInput.matches("^(0|[1-9]\\d*)(\\.\\d+)?$")) {
            if (Double.parseDouble(userInput) >= customerBillTotal) {
                amountPaid = Double.parseDouble(userInput);
            } else {
                System.out.println("Customer must give you an amount more than or equal to " + customerBillTotal);
                customerPay();
            }
        } else{
            System.out.println("Amount can contain only numbers and decimal point");
            customerPay();
        }
        System.out.println();
    }

    public void receipt(){
        restore();
        headingInfo();
        doubleDesign();
        System.out.printf("%10s %10s %10s %10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        singleDesign();
        listPrinting();
        singleDesign();
        subtotal();
        doubleDesign();
        billTotal();
        amountCustomerPaid();
        doubleDesign();
        System.out.println("\t\t\tTHANK YOU FOR YOUR PATRONAGE");
        doubleDesign();

    }

    private void amountCustomerPaid() {
        double balance = (amountPaid-customerBillTotal);
        System.out.printf("%20s%10.2f %n%20s%10.2f%n", "Amount Paid: ", amountPaid,
                "Balance: ", balance);
    }
}
