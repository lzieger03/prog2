package org.example.generics;

class BlackBox1 {
    private Object o;

    public void set(Object o){
        this.o = o;
    }
    public Object get(){
        return this.o;
    }
}

public class BlackBoxObject {
    public static void main(String[] args) {
        BlackBox1 b1 = new BlackBox1();
        b1.set(3);
        // die 3 ist ein Integer nicht int
        Integer i = (Integer) b1.get();
        System.out.println(i);
    }
}
