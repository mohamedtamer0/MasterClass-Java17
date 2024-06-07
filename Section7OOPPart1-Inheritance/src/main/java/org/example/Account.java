package org.example;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() {
        System.out.println("Hello From Constructors!");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Hello From Constructors With Parameters");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount
                + " made. New balance is $ " + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance
                    + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount
                    + " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


    public static void main(String[] args) {
        Account account = new Account("12345", 1000.00, "Tamer", "mohamedtamerdev@gmail.com",
                "02121212");
        account.withdrawFunds(100.0);
        account.depositFunds(250);
        account.withdrawFunds(50);
    }
}
