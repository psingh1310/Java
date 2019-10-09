package com.company;

import java.util.function.DoubleToIntFunction;

public class SingleDimensionalArray {
    int arr[] = null;

    //constructor
    public SingleDimensionalArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;   // -ive value or blank we can say that
        }
    }

    //print the array
    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e){
            System.out.println("Array no longer exits !");  //try catch so that the if the value not
                                   //then array does not end abruptly it show some message
        }
    }

    //Insert value into the array
    public void insert(int location,int valueToBeInsert){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInsert;
                System.out.println("Successfully inserted " + valueToBeInsert + " at location " + location);
            } else {
                System.out.println("The cell is already occupied by the another value");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array !");
            //for -ive location and array location more than size of array
        }
    }

    //Access a particular element of an array
    public void accessingCell(int cellNumber){
        try {
            System.out.println(arr[cellNumber]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index to access the array !");
        }
    }

    //Search for an element in an Array
    public void searchAnArray(int valueToSearch){
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is Found");
                System.out.println("Index of " + valueToSearch + " is " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not Found" );
    }

    //delete element in the array
    public void deleteValueFromTheArray(int deleteElementFromThisCell){
        try {
            arr[deleteElementFromThisCell] = Integer.MIN_VALUE;
            //assigning some minimum value
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Can't delete the value as the cell" +
                    " provided in input is not found");
        }
    }
}
