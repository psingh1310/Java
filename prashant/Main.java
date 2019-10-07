package com.prashant;

public class Main {
    public static void main(String[] args) {
        VolkswagenPolo polo = new VolkswagenPolo(36);
      //  polo.steer(45);
       // polo.accelerate(30);
       // polo.accelerate(60);

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","HP","240",dimensions);


       // Monitor theMonitor = new Monitor("HP1247B","HP",15,nativeResolution);
        Monitor theMonitor = new Monitor("HP1247B","HP",15,new Resolution(2540,144));
                          //it created the instance of the class without using the variable

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","ASUS",
                4, 6,"V2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard); //we created the PC class by passing
           //the three objects

        //how we access the methods in monitor class
        //pc object --> monitor getter --> method name
        thePC.getMonitor().drawpixelAt(1500,1200,"red");
        thePC.getMotherBoard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
