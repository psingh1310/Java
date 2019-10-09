package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating a blank array of size 10...");
        SingleDimensionalArray sda = new SingleDimensionalArray(10);
        System.out.println("Printing the array");
        sda.traverseArray();
        System.out.println();
        System.out.println();

        System.out.println("Inserting values into the array");
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(3,30);
        sda.insert(4,40);
        sda.insert(5,50);
        sda.insert(6,60);
        sda.insert(7,70);
        sda.insert(8,80);
        sda.insert(9,90);
        sda.insert(1,100);
        sda.insert(11,110);

        System.out.println("Accessing the cell number .... ");
        sda.accessingCell(8);
        System.out.println();

        System.out.println("Searching element in the array....");
        sda.searchAnArray(40);
        System.out.println();
        System.out.println();

        System.out.println("Deleting an element from the array");
        System.out.println("Before Deleting:");
        sda.traverseArray();
        sda.deleteValueFromTheArray(7);
        System.out.println("After Deleting: ");
        sda.traverseArray();
    }
}
