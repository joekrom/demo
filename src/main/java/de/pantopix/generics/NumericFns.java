package de.pantopix.generics;

public class NumericFns<T extends Integer> {

    T number;

    public NumericFns(T number){
        this.number = number;
    }

    public double square(){
        return number.intValue() * number.intValue();
    }

}
