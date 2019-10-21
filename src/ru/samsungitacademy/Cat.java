package ru.samsungitacademy;

public class Cat extends Animal {

    public static String color = "Black";
    public static final String BBB = "BBB";

    Cat(String n) {
        // Вызов конструктора Animal
        super(n);
        this.age = 100;

       // this.name
    }
    Cat() {
        super("");
    }
    // переопределение метода
    // override
    @Override
    public void makeSound() {
        System.out.println("Myau!!!");
    }
    // перегрузка
    // overload
    public void makeSound(String s) {
        System.out.println(s);
    }

}
