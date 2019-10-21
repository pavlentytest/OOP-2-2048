package ru.samsungitacademy;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        barsik.makeSound();
        barsik.makeSound("dfgdfga");

        Animal murka = new Animal("Murka");
        murka.makeSound();

        System.out.print(1);
        System.out.print("Stroka");
    }
}
