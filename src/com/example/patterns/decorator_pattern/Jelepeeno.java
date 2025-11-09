package com.example.patterns.decorator_pattern;

public class Jelepeeno extends Toppings{
    BasePizza pizza;
    public Jelepeeno(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost()+30;
    }
}
