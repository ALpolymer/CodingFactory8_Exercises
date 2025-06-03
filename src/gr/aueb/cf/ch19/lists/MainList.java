package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        //Create
        cities.add("Athens");
        cities.add("New York");
        cities.add("London");

        //Read
        String city = cities.get(0);
        System.out.println("City: " + city);

        //Update
        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1){
            cities.set(nyPosition , "NY");
        } else {
            System.out.println("New York does not exist");
        }

        //Remove
        if (cities.contains("Athens")){
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist");
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        Iterator<String> iter = cities.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        cities.removeIf(c -> c.equals("London"));
        cities.forEach(System.out::println);
    }


}
