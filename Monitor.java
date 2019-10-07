package com.prashant;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;  //Resolution is going to be a class
    //this is the composition, Resolution class is the part of the monitor

   public Monitor(String model,String manufacturer,int size,Resolution nativeResolution){
       this.model = model;
       this.manufacturer = manufacturer;
       this.size = size;
       this.nativeResolution = nativeResolution;
   }

   //public method
    public void drawpixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at " + x + " , " + y + " in color " + color);
    }
    //Getters
    public String getModel(){
       return model;
    }
    public String getManufacturer(){
       return manufacturer;
    }
    public int getSize(){
       return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
