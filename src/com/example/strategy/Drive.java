package com.example.strategy;
public class Drive {
    private  DriveStratergy driveStratergy;

    public Drive(DriveStratergy driveStratergy){
        this.driveStratergy = driveStratergy;
    }

    public void drive(){
        this.driveStratergy.drive();
    }
}
