package com.example.strategy_pattern;
public class NormalDrive implements DriveStratergy {
    @Override
    public void drive(){
        System.out.println("Normal Drive");
    }
}
