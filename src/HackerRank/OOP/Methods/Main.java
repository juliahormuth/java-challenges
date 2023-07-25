package HackerRank.OOP.Methods;

import static HackerRank.OOP.Methods.Animal.sound;

public class Main {
    public static void main (String [] args) {
        Cat cat = new Cat();
        // can be called only with an instance
        System.out.println(cat.sound());

        // static method can be called without an instance
        System.out.println(sound());
    }
}
