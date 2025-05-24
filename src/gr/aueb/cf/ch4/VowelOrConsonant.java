package gr.aueb.cf.ch4;
import java.util.Scanner;


public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;

        System.out.println("Παρακαλώ δώστε ένα ελληνικό γράμμα:");
        letter = Character.toUpperCase(scanner.next().charAt(0));

        System.out.println(letter);
        switch (letter){
            case ('Α'), ('Ε'), ('Η'), ('Ι'), ('Ο'), ('Υ'), ('Ω') -> System.out.printf("To %c είναι φωνήεν", Character.toLowerCase(letter));
            default -> System.out.printf("To %c είναι σύμφωνο", Character.toLowerCase(letter));
        }
    }
}
