package ru.otus.javaFirst;

public class PhaseOMatic {
    public static void main(String[] args) {
        String[] wordListOne={"круглосуточный","трех-звенный","30000-футовый","взаимный","обоюдный выигрыш","фронтэнд","на основе веб-технологий","проникающий","умный","шесть сигм","метод критического пути","проникающий"};
        String[] wordListTwo= {"уполномоченный","трудный","чистый продукт","ориентированный","центральный","распределительный","кластеризированный","фирменный","нестандартный ум","позиционированный","сетевой","сфокусированный","использованный с выгодой","выровненный","нацеленный на","общий","совместный","ускоренный"};
        String[] wordListThree={"процесс","пункт разгрузки","выход из положения","тип структуры","талант","подход","уровнь завоеванного внимания","портал","период времени","обзор","образец","пункт следования"};

        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;

        int rend1=(int) (Math.random()*oneLength);
        int rend2=(int) (Math.random()*twoLength);
        int rend3=(int) (Math.random()*threeLength);

        String phrase=wordListOne[rend1]+" "+wordListTwo[rend2]+" "+wordListThree[rend3];

        System.out.println("Все что нужно - это "+ phrase);
    }

}
