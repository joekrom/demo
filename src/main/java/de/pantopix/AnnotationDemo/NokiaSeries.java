package de.pantopix.AnnotationDemo;

@Smartphone
public class NokiaSeries {
    // this class is a smartphone since it is surrounded with annotation @smartphone , which is a created interface
    String model ;
    int size;

    public NokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
