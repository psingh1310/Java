package com.prashant;

public class vipCustomer {
    String customerName;
    double creditLimit;
    String emailAddress;

    public vipCustomer(){
        this("Default Name", 5000.0,"default@gmail");
    }

    public vipCustomer(String customerName, double creditLimit) {
        this(customerName,creditLimit,"unknown@gmail");
       /* this.customerName = customerName;
        this.creditLimit = creditLimit;*/
    }

    public vipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
