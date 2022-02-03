package de.pantopix.generics;

public class MyClass<T, V> {
    public T ob;
    public V ob2;

    public MyClass(T ob,V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    /*how to instantiate

    MyClass<Integer> obj1 = new MyClass<>(10);
    MyClass<String> obj2 = new MyClass<>("coucou");
    MyClass<Double> obj1 = new MyClass<>(20.0);
    * */

}
