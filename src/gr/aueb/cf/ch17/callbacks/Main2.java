package gr.aueb.cf.ch17.callbacks;

public class Main2 {
    public static void main(String[] args) {
        doPrint(() -> System.out.println("Hello world!"));
    }

    public static void doPrint(Printable printable){
        printable.print();
    }
}
