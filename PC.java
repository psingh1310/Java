package com.prashant;
//class consist of Case Monitor and MotherBoard
//in java if we use we use extend keyword we can inherite one class at time
//here we are inheriting three class at a time(HAS A relationship)
public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    //constructor
    public PC(Case theCase,Monitor monitor,MotherBoard motherBoard){
        this.theCase  = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    //getters
    public Case getTheCase(){
        return theCase;
    }
    public Monitor getMonitor(){
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
