package org.aufgaben.blatt6.a18;

import java.util.*;

public class Aufgabe18 {
    public static <T> TreeSet<T> duplikat(Collection<T> c){
        TreeSet<T> ts = new TreeSet<>();

        Iterator<T> itC = c.iterator();

        while(itC.hasNext()){
            if(ts.add(itC.next()) == false){
                System.out.println("Ein Duplikat wurde erkannt!");
            }
        }

        return ts;
    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1); test.add(3); test.add(4); test.add(2); test.add(3); test.add(6);
        test.add(5); test.add(8); test.add(9); test.add(7); test.add(10); test.add(6);

        System.out.println(duplikat(test));
    }
}
