package com.example.patterns.strategy_pattern;
public class ElectricDrive implements DriveStratergy {
    @Override
    public void drive(){
        System.out.println("Electric Drive");
    }
}
