package de.pantopix.factoryDemo;

public class ShapeFactory {
    // use getShape method to get the object
    public static Shape getShape(String shapetype){
        if (shapetype == null){
            return null;
        }
        if (shapetype.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapetype.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapetype.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
