package ru.otus.javaFirst.DrumKit;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d=new DrumKit();
        d.playSnare();
        d.snare=false;
        d.playTopHat();
//Для чего эта часть кода???
        if (d.snare==true){
            d.playSnare();
        }
    }
}
