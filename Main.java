package com.prashant;

public class Main {

    public static void main(String[] args) {
	vipCustomer customer_one = new vipCustomer();
        System.out.println(customer_one.getCustomerName());

    vipCustomer customer_two = new vipCustomer("Bob",10000.00);
        System.out.println(customer_two.getCustomerName());

    vipCustomer customer_three = new vipCustomer("Tim",70000.00,
            "tim@fab");
        System.out.println(customer_three.getCustomerName());
    }
}
