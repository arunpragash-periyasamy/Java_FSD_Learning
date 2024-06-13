package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(24);
        list.add(32);
        list.add(12);
        list.add(56);
        list.add(8);

        System.out.println("Iterator ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println("Printing the values from the list iterator");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());

        }

        System.out.println("Previous values from the list iterator");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // different methods in the array list.

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("custordapple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("green apple");
        System.out.println(fruits);


        fruits.remove("pineapple"); // remove the object by the value
        fruits.remove(1); // remove the object by the index
        System.out.println(fruits);

        ArrayList<String> updatedFruits = new ArrayList<>();
        updatedFruits.add("Melon");
        updatedFruits.add("Watermelon");
        updatedFruits.add("Grapes");
        updatedFruits.addAll(2, fruits);
        System.out.println(updatedFruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
