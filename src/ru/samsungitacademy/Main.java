package ru.samsungitacademy;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        barsik.makeSound();
        barsik.makeSound("dfgdfga");
        System.out.println(barsik.age);
        // final поле
        Cat.BBB = "123123";
        System.out.println(Cat.color);

        Animal murka = new Animal("Murka");
        murka.makeSound();

        System.out.print(1);
        System.out.print("Stroka");
    }
}
