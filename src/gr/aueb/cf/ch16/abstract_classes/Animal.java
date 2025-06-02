package gr.aueb.cf.ch16.abstract_classes;

//Μια abstract class μπορεί να περιέχει abstract μεθόδους
// Οι abstract classes υπάρχουν για να κληρονομούνται
public abstract class Animal {

    private long id;
    private String name;

    public Animal(){

    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " Name: " + name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    //abstract method
    // Αναγκαστικά πρέπει να γίνει override στην υποκλάση γιατί δεν έχει σώμα
    public abstract void speak();
}
