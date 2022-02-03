package de.pantopix.generics;

public class MyClass<T> {
    public T ob;

    public MyClass(T ob){
        this.ob = ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }

    /*how to instantiate

    MyClass<Integer> obj1 = new MyClass<>(10);
    MyClass<String> obj2 = new MyClass<>("coucou");
    MyClass<Double> obj1 = new MyClass<>(20.0);
    * */

}
