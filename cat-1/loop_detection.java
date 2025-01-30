import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current != null){
            current = current.next;
        }
        current.next = new Node(data);
    }


}
public class loop_detection {
    
}
