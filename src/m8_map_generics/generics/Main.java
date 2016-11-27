package src.m8_map_generics.generics;

import src.m8_map_generics.maps.Task;

public class Main {
    public static void main(String[] args) {
        //generic class example
        //MyClass myClass = new MyClass(); - bad practice
        MyClass<Foo, Boo> myClass = new MyClass<>();

        //foo example
        Foo foo = new Foo();
        Foo foo2 = myClass.doSomething(foo);
        if(foo2 != null) System.out.println("success");

MyClass<Task,Boo> myClass1 = new MyClass<>();

        Task task = new Task("Task1");
        myClass1.doSomething(task);
        //boo example
        Boo boo = new Boo();

        myClass.test(boo);


        //---------------------------------------------

        /*MyClassWithObject myClassWithObject = new MyClassWithObject();
        Boo fooObj = new Boo();
        Foo fooObj2 = (Foo) myClassWithObject.doSomething(fooObj);*/
    }
}
