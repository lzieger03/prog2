package org.example.generics;

class BlackBox2<T extends Comparable<T>> {
    private T o;

    public void set(T o){
        this.o = o;
    }
    public T get(){
        return this.o;
    }
}

public class BlackBoxGenerics {
    public static void main(String[] args) {
        BlackBox2<Integer> b2 = new BlackBox2<>();
        b2.set(3);
        Integer i = b2.get();
        System.out.println(i);
    }
}
