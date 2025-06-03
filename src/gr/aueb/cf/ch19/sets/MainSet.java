package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Orange");

        if (bag.contains("Apple")){
            bag.remove("Apple");
        } else {
            System.out.println("Apple does not exist");
        }

        bag.forEach(System.out::println);
    }
}
