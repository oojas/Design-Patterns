package com.example.patterns.decorator_pattern;

public class Mushroom extends Toppings{
    BasePizza pizza;
   public Mushroom(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost()+15;
    }
}
