package com.company;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static class Animal {

        public void feed() {

            System.out.println("Animal.feed()");
        }
    }

    public static class Pet extends Animal {

        public void call() {

            System.out.println("Pet.call()");
        }
    }

    public static class Cat extends Pet {

        public void meow() {

            System.out.println("Cat.meow()");
        }
    }


    public static <T> String[] convertToStringArray(T[] arrayFrom) {
        String[] arrayTo = new String[arrayFrom.length];

        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[i] = arrayFrom[i].toString();
        }

        return arrayTo;
    }

    public static void iterateAnimals(List<? extends Animal> animals) {

        for (Animal animal : animals) {

            System.out.println("Еще один шаг в цикле пройден!");
        }
    }

    public static void main(String[] args) {
//        MyCollection myCollection = new MyCollection();
//        myCollection.add(10);
//        myCollection.add(99);
//        myCollection.add(111);
//        myCollection.add(234);
//        myCollection.add("sdhjfghjsf");
//
//        int sum = 0;
//        for (int i = 0; i < myCollection.getLength(); i++) {
//            System.out.println(myCollection.getItem(i));
//            sum += ((int) myCollection.getItem(i));
//        }
//
//        int result = ((int) myCollection.getItem(0)) + ((int) myCollection.getItem(1));
//        System.out.println("res = " + result);

//        MyCollection<Unit> myCollection = new MyCollection<>(Unit.class);
//
//        myCollection.add(new Warrior());
//        myCollection.add(new Warrior());
//        myCollection.add(new Warrior());
//
//        int sum = 0;
//        for (int i = 0; i < myCollection.getLength(); i++) {
//            System.out.println(myCollection.getItem(i));
//            //sum += myCollection.getItem(i);
//        }
//        System.out.println("sum = " + sum);
//
//        System.out.println("----");

//        List<Integer> list = new Stack<>();
//        list.add(234234);
//        list.add(34534);
//        for (int item : list) {
//            System.out.println(item);
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(12);
//        list.add(234);
//        list.add(456);
//        list.add(68);


//        Integer[] array = new Integer[]{10, 3254, 5786, 23};
//
//        String[] result = convertToStringArray(array);
//
//        int a = 5;


//        List<String> strings = new ArrayList<>();
//        strings.add("87678678");
//        strings.add("98798");
//        strings.add("98789789");
//
//        List<?> objects = strings;
//
//        for (int i = 0; i < objects.size(); i++) {
//            System.out.println(objects.get(i));
//        }

        List<Animal> cats = new ArrayList<>();
        cats.add(new Animal());
        cats.add(new Animal());
        cats.add(new Animal());
        cats.add(new Animal());

        iterateAnimals(cats);

//        var a = 10;
//        a = "dsfgf";
//
//        var b = new int[]{3, 54, 6, 5};
//        b[0] = 43;
    }
}
