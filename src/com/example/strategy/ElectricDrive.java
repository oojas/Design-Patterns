package com.example.strategy;
public class ElectricDrive implements DriveStratergy {
    @Override
    public void drive(){
        System.out.println("Electric Drive");
    }
}
