package org.example.abstractDatatypes;

import java.util.*;

public class AbstractDatatypes {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Collection<Integer> c = new ArrayList<>();
        List<Integer> l = new LinkedList<>();
        Set<Integer> s = new TreeSet<>();
        // doesn't work -> Collection<Integer> c2 = new Collection<Integer>();

        // important methods:
        // add Items/Objects
        c.add(1); c.add(2); c.add(3);
        System.out.println("c: " + c);
        // add collections
        a.addAll(c);
        System.out.println("a: " + a);
        // add == true, if item has been added
        System.out.println(c.add(2));

        // clear entire collection
        a.clear();
        // delete objects (object, !not index!)
        c.remove(1);
        // delete multiple objects from collection
        a.removeAll(c);
        // remove == true, if item has been deleted
        System.out.println(c.remove(1));
        System.out.println(c);

        // return the size of a collection
        System.out.println(c.size());

        // convert collection to object-array
        Object[] field = c.toArray();

        // printing a collection
        System.out.println(c);

        // iterate over collection
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator: " + i);
        }

        // test if collection contains object
        System.out.println(c.contains(2));
        // or if contains a complete collection
        System.out.println(c.containsAll(a));



        // List exclusive methods
        l.addAll(c);
        // add at index
        l.add(/*index*/ 0, /*element*/ 4);
        // delete object at index
        l.remove(0);
        // print at index
        System.out.println("l object on index 1: " + l.get(1));
        // print index of an object
        System.out.println("l index of 2: " + l.indexOf(2));
        System.out.println("l binarySearch for 2: " + Collections.binarySearch(l, 2));
        System.out.println(l);
        // sort list
        Collections.sort(l);
        System.out.println("l - sorted: " + l);
    }

    public Collection<Integer> addZero(Collection<Integer> c){
        ArrayList<Integer> aL = (ArrayList<Integer>) c;
        aL.add(0);
        return aL;
    }

}
