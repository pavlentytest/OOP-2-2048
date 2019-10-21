package ru.samsungitacademy;

public class Cat extends Animal {

    Cat(String n) {
        // Вызов конструктора Animal
        super(n);
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
