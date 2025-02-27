package org.basics;

import java.util.Scanner;

abstract class Animal{
// this is abstract method and abstract class
    abstract public void Sound();
}
class Dog extends Animal{
    @Override
    public void Sound(){
        System.out.println("Bark");
    }
}

public class Abstract_class_n_methods {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String value = sc.next();
    System.out.println(value);
    Dog dog = new Dog();
    dog.Sound();
    }
}
