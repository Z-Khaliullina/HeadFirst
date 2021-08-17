package ru.otus;

import java.util.*;

public class Collections {


    public static void main(String[] args){
        Collection<String> c=new ArrayList<>();
        c.add("First");
        c.add("Second");
        c.add("First");
        System.out.println(c.size());
        //c.remove("First");
        //System.out.println(c.size());

        //Iterator<String> iterator=c.iterator();
        //while (iterator.hasNext()){
        //    String next = iterator.next();
        //    System.out.println(next);



        System.out.println(c.contains("Second"));

        List<String> list= (List<String>) c;
        list.add(0,"Very first");
        System.out.println(list);

        for(String s: c){
            System.out.println(s);
        }


        System.out.println(list.indexOf("Very first"));
        //System.out.println(list.get(0));
        int index=5;
        if(index<list.size()){
            System.out.println(list.get(index));

        }

    }
}
