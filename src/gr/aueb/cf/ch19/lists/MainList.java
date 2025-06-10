package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        //Create (add())
        cities.add("Athens");
        cities.add("New York");
        cities.add("London");

        //Read(get)
        String city = cities.get(0);
        System.out.println("City: " + city);

        //Update(set)/(indexOf())
        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1){
            cities.set(nyPosition , "NY");
        } else {
            System.out.println("New York does not exist");
        }

        //Delete(remove)/(contains())
        if (cities.contains("Athens")){
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist");
        }

        //size()
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String s : cities) {
            System.out.println(s);
        }

        //removeIf()
        cities.removeIf(c -> c.equals("London"));
        //forEach()
        cities.forEach(System.out::println);

    }


}
