package ru.otus.javaFirst.DogsBark;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one=new Dog();
        one.size=5;

        Dog two=new Dog();
        two.size=75;

        Dog three=new Dog();
        three.size=17;

        one.bark(1);
        two.bark(2);
        three.bark(0);
    }
}
