public class pra {
    public static void main(String[] args){
        int x = 5;
        System.out.println(x++ + ++x);
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkediList { 
    Node head;
    
}