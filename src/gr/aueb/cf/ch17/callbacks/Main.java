package gr.aueb.cf.ch17.callbacks;

public class Main {
    public static void main(String[] args) {
        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });
    }

    public static void doPrint(Printable printable){
        printable.print();
    }
}
