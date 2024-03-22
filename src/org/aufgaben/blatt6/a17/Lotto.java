package org.aufgaben.blatt6.a17;

import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    private static Set<Integer> zahlen = new TreeSet<>();

    private static Integer ziehung(){
        return 1 + ((int) (Math.random() * 49));
    }
    public static void main(String[] args) {
        while(zahlen.size() < 7){
            zahlen.add(ziehung());
        }
        System.out.println(zahlen);
    }
}
