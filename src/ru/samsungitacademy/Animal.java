package ru.samsungitacademy;

public class Animal {
    private String name="";
    Animal(String n) {
        this.name = n;
    }
    public void makeSound() {
        System.out.println(this.name + " say buuuuu!");
    }
}
