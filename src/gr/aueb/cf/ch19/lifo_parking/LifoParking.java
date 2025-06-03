package gr.aueb.cf.ch19.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();

    public LifoParking(){

    }

    public List<String> getParking() {
        return List.copyOf(parking);
    }


    public void addCar(String carId) {
        parking.push(carId);
        System.out.println(LocalDateTime.now() + "Είσοδος, Αριθμός πινακίδας: " + carId);
    }

    public String removeCar(){
        String carId = parking.pop();
        System.out.println(LocalDateTime.now() + "Έξοδος, Αριθμός πινακίδας: " + carId);

        return carId;
    }
}
