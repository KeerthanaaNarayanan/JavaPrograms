package com.company;

public class InheritanceMain {
    public static void main(String[] args){
        Dog dog = new Dog("ponky", 5, 5, 2, 4, 1, 20, "Long silky");
        dog.eat();
        Animal animal = new Animal("Monkey", 1, 1, 5, 2);
        animal.eat();
    }
}
