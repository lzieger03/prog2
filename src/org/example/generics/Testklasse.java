package org.example.generics;

public class Testklasse {

    // Generic Methods
    public static <T> boolean isEqual(T e1, T e2){
        return e1.equals(e2);
    }

    public static <T> T allwaysLeft(T e1, T e2){
        return e1;
    }

    // Wildcards
    public static void content(BlackBox2<?> b2){
        System.out.println(b2.get());
    }
    // Upper bound
    public static void content2(BlackBox2<? extends Number> b2){
        System.out.println(b2.get());
    }
    // Lower bound
    public static void content3(BlackBox2<? super Integer > b2){
        System.out.println(b2.get());
    }

    public static void main(String[] args) {
        System.out.println("Equals: Hallo, Welt: " + Testklasse.isEqual("Hallo", "Welt"));
        System.out.println("Equals: Hallo, Hallo: " + Testklasse.isEqual("Hallo", "Hallo"));

        System.out.println("Left: Hallo, Welt: " + Testklasse.allwaysLeft("Hallo", "Welt"));
        System.out.println("Left: Welt, Hallo: " + Testklasse.allwaysLeft("Welt", "Hallo"));

        BlackBox2<Integer> b2 = new BlackBox2<>();
        b2.set(3);
        Testklasse.content(b2);
        Testklasse.content2(b2);
        Testklasse.content3(b2);
    }
}
