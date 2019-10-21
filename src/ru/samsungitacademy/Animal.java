package ru.samsungitacademy;

public class Animal {
    // private - доступен только внутри класса (его объекта)
    // public - доступен для всех классов
    // protected - внутри класса (его объекта) и в наследниках
    private String name="";
    protected int age;
    Animal(String n) {
        this.name = n;
        this.age = 0;
    }
    public void makeSound() {
        System.out.println(this.name + " say buuuuu!");
    }
}
