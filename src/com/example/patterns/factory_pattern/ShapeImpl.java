package com.example.patterns.factory_pattern;

public class ShapeImpl {
    String value;
    public ShapeImpl(String value){
        this.value=value;
    }
    public Shape getShape(){
        return switch (this.value) {
            case "SQUARE" -> new Square();
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
