package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> elements = new HashSet<>();
        elements.add("ELEMENT KPRBC");
        elements.add("ELEMENT YPBTM");
        elements.add("ELEMENT AADXU");
        elements.add("ELEMENT RXCGJ");
        elements.add("ELEMENT WYMVD");
        elements.add("ELEMENT WFGEJ");
        elements.add("ELEMENT TYGBS");
        elements.add("ELEMENT MAPTK");
        elements.add("ELEMENT GJXVE");
        elements.add("ELEMENT BAFGL");
        return elements;
    }

    public static Set<String> createTreeSet() {
        Set<String> elements2 = new TreeSet<>();
        elements2.add("ELEMENT KPRBC");
        elements2.add("ELEMENT YPBTM");
        elements2.add("ELEMENT AADXU");
        elements2.add("ELEMENT RXCGJ");
        elements2.add("ELEMENT WYMVD");
        elements2.add("ELEMENT WFGEJ");
        elements2.add("ELEMENT TYGBS");
        elements2.add("ELEMENT MAPTK");
        elements2.add("ELEMENT GJXVE");
        elements2.add("ELEMENT BAFGL");
        return elements2;

    }

    private static void printSet(Set<String> customSet) {
        for(String element: customSet){
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        boolean addedtoHashSet = addElementToSet(hashSet, "ELEMENT AAA");
        boolean addedtoTreeSet = addElementToSet(treeSet, "ELEMENT AAA");

        System.out.println("Añadido a HashSet: " + addedtoHashSet);
        System.out.println("Añadido a TreeSet: " + addedtoTreeSet);

        System.out.println("\nContenido de HashSet: ");
        printSet(hashSet);
        System.out.println("\nContenido de TreeSet: ");
        printSet(treeSet);
    }

}
