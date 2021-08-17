package ru.otus.javaFirst.DogsBark;

public class Dog {
    int size;
    String name;

    void bark(int numOfBark){
        while (numOfBark>0) {
            if (size > 60) {
                System.out.println("Гав! Гав! Гав!");
            } else if (size > 14) {
                System.out.println("Вуф, вуф!");
            } else {
                System.out.println("Тяф, тяф");
            }
            numOfBark--;
        }
    }
}
