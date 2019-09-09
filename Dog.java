package com.prashant;

public class Dog extends Animal {
    //extra methods for the dog class than the animal class
   private int eyes;
   private int legs;
   private int teeth;
   private int tail;
   private String coat;

    public Dog(String name, int size, int weight,int eyes,int
            legs,int teeth,int tail,String coat) {
        //constructor for the dog class calls the other class
        super(name, 1, 1, size, weight);
        //super means call the constructor that is for the class that we are extending from or
        //inheriting from

        this.eyes=eyes;
        this.legs=legs;
        this.teeth = teeth;
        this.tail=tail;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chew() method is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat is called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk is called");
        super.move(5);  //call the method in the super class
    }
    public void run(){
        System.out.println("Dog.run is called");
        move(20);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs is called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }
}
