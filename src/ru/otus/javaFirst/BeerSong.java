package ru.otus.javaFirst;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";

        while (beerNum>0) {
            if (beerNum == 1) {
                word = "бутылка";
            }


            System.out.println(beerNum + " "+ word  + " пива на стене");
            System.out.println(beerNum + " "+ word  + " пива");
            System.out.println("Возьми одну, пусти по кругу.");

            beerNum=beerNum-1;
            if(beerNum>0){
                System.out.println(beerNum + " "+ word  + " пива на стене");
            }
                else {
                System.out.println("Нет бутылок пива на стене");
                }
    }

//        beerNum--;
//         if (beerNum>0) {
//            if (beerNum == 1) {
//                word = "бутылка";
//            }
//        }
//            System.out.println(beerNum + " "+ word  + " пива на стене");
//            System.out.println(beerNum + " "+ word  + " пива");
//            System.out.println("Возьми одну, пусти по кругу.");
//            beerNum--;
//
//            System.out.println(beerNum-- + " "+ word  + " пива на стене");
//            System.out.println(" ");


//
//
//
//        else {
//            System.out.println("Нет бутылок пива на стене");
//        }


//        while (beerNum > 0) {
//
//            System.out.print(beerNum + " " + word + " пива на стене, ");
//            System.out.println(beerNum + " " + word + " пива.");
//            System.out.print("Возьми одну, пусти по кругу, ");
//            beerNum--;
//
//
//            if (beerNum == 1) {
//                word = "бутылка";
//            }
//
//            if (beerNum > 0) {
//                System.out.println(beerNum + " " + word + " пива на стене.");
//                System.out.println();
//            }
//
//            else {
//                System.out.println("Нет бутылок пива на стене");
//                System.out.println();
//                System.out.println("Нет бутылок пива на стене, нет бутылок пива. Пойди в магазин и купи еще, 99 бутылок пива на стене.");
//            }
//        }
    }
}
