package com.prashant;

public class Main {

    public static void main(String[] args) {
        //passing value to the constructor
      BankAccount prashantAccount = new BankAccount();/*("BKID123456",
      8000, "kumar", "singh@com",839010); */

        System.out.println(prashantAccount.getBalance());
        System.out.println(prashantAccount.getAccountnumber());

   /*  prashantAccount.setAccountnumber("BKID154789246"); */
     /*System.out.println("Account number is " + bank.getAccountnumber()); */
    /*    prashantAccount.setBalance(0.00);
        prashantAccount.setCustomerName("kumar");
        prashantAccount.setEmail("psingh1310@gmail.com");
        prashantAccount.setPhoneNumber(839010); */

      prashantAccount.withdrewAmount(100);
      prashantAccount.depositFunds(800);
      prashantAccount.withdrewAmount(100);
      prashantAccount.depositFunds(200);

      BankAccount kumarAccount = new BankAccount("Kumar",
              "kumar@123",12345);
        System.out.println(kumarAccount.getAccountnumber() + " Name " +
                kumarAccount.getCustomerName());
    }
}
