package gr.aueb.cf.ch16.abstract_classes;

import java.sql.SQLOutput;

public class Cat extends Animal {

    public Cat(){
        //super(); (Γίνεται αυτόματα)
    }

    @Override
    public void speak() {
        System.out.println("Cat says meow!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat ate all her food!");
    }
}
