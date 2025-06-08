package gr.aueb.cf.ch17.callbacks;

public class Main3 {
    public static void main(String[] args) {
        doPrint(() -> sayHelloWorld()); //lambda
        doPrint(() -> sayHelloCoding()); //lambda

        doPrint(Main3::sayHelloWorld); // method reference
        doPrint(Main3::sayHelloCoding); // method reference
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    public static void sayHelloCoding(){
        System.out.println("Hello Coding");
    }
}
