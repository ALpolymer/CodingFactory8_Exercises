package gr.aueb.cf.ch18.singly_linked_list;

public class SingleList<T> {
    private Node<T> head  = null;

    public void insertFirst(T t){
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
    }

    public void insertLast(T t){
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if(isEmpty()){
            insertFirst(t);
            return;
        }

        Node<T> n;
        for(n = head; n.getNext() != null; n = n.getNext()){

        }

        n.setNext(tmp);
    }

    public Node<T> removeFirst(){
        if (isEmpty()) return null;

        Node<T> node = head;
        head = head.getNext();

        return node;
    }

//    public Node<T> removeLast(){
//        if(isEmpty() || head.getNext() == null){
//            return removeFirst();
//        }
//
//        Node<T> n;
//
//        for(n = head; n.getNext().getNext() == null; n = n.getNext()) {
//        }
//
//        Node<T> nodeToReturn = n.getNext();
//        n.setNext(null);
//        return nodeToReturn;
//        }
//    }



    public boolean isEmpty(){
        return head == null;
    }
}
