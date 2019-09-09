package com.prashant;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight,
                int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    public void swim(int speed){
      moveMuscles();
      moveBackFin();
        System.out.println("fish.swim method is called");
      super.move(speed); //calling the parent method
    }
}
