package com.prashant;

public class VolkswagenPolo extends Car{
    private int roadServiceMonths;

    //code reusebility
    public VolkswagenPolo(int roadServiceMonths)
    {
        super("VolkswagenPolo", "4Wd", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    //method to accelerate the vehicle
    public void accelerate(int rate){
                     //rate difference of spped
        int newVelocity = getCurrentVelocity() + rate;
           if (newVelocity == 0){
               stop();
               changeGear(1);
           } else if(newVelocity > 1 && newVelocity < 10){
                   changeGear(1);
        }  else if (newVelocity > 10 && newVelocity < 20){
               changeGear(20);
           } else if(newVelocity > 20 && newVelocity < 60){
               changeGear(3);
           } else if (newVelocity > 60 && newVelocity < 80){
               changeGear(4);
           } else if (newVelocity > 80 && newVelocity < 120){
               changeGear(5);
           } else {
               changeGear(6);
           }

           if (newVelocity > 0){
               changeVelocity(newVelocity,getCurrentDirection());
           }
    }
}
