package com.prashant;

public class BankAccount {

    private String accountnumber;
    private double balance = 0;
    private String customerName;
    private String email;
    private long phoneNumber;

    //constructor, we can have more than one constructor
    //we can call one constructor from other construcotr
    public BankAccount(){
        //calling constructor within the constructor
        //call to this most be first in the constructor body
        //before any statement
        this("BKIDII000", 300.25, "Nipu", "Kumar@com",
                79037);
        System.out.println("empty constructor called");
    }

    public BankAccount(String accountnumber, double balance, String customerName,
                       String email, long phoneNumber){
        System.out.println("BankAccount with parameters is called");
        //setPhoneNumber(phoneNumber); // we also initialize like this
        //do all initializations in main constructor
        //other constructors just call this major constructor
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        //updating account number and balance
        this("BIKK878",200.20,customerName,email,phoneNumber);

      /*  this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber; */
    }

    public void setAccountnumber(String accountnumber){
        this.accountnumber = accountnumber;
    }
    public String getAccountnumber(){
        return this.accountnumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(int fund){
       // fund = 8000;
        this.balance += fund;
        System.out.println("deposit of " + fund + "in the account " +
                "new balance is " + this.balance);
    }
    public void withdrewAmount(int withdrawal){
        //withdraw = 1000;
       /* balance = balance-withdraw;  */
        if(this.balance - withdrawal < 0){
            System.out.println("Only " + this.balance + " is in account " +
                    "withdrawal not possible");
        } else {
            this.balance-=withdrawal;
            System.out.println("withdrawal of " +withdrawal + " processed" +
                    "reamining balance equals " +this.balance);
        }

    }
}
