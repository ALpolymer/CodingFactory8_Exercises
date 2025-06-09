package gr.aueb.cf.ch18;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        NodeGeneric<Integer> intNode = new NodeGeneric<>();
        NodeGeneric<String> stringNode = new NodeGeneric<>();
        var doubleNode = new NodeGeneric<Double>();



    }

    public static <T> void printArray(T[] arr){
        for(T item : arr){
            System.out.println(item);
        }
    }


    public static void print(NodeGeneric<?> node){
        System.out.println(node.getItem());
    }

    public static void print2(NodeGeneric<? extends Number> node){
        System.out.println(node.getItem());
    }
}
