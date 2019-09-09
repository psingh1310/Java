package com.prashant;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal",1,1,5,10);
	Dog dog = new Dog("puff",7,12,2,4,24,1,"long Silky");
	Fish fish = new Fish("common crap", 2,3,2,2,2);
	//feature of inheriting class method eat is not defined in dog but inherited from Animal
        dog.eat();
      dog.walk();
        // dog.run();
        fish.swim(10);
    }
}
