package tree;
import java.util.*;

public class tree {
    
    static class Node{
        int data;
        Node left,right;
        Node(int item){
            data = item;
            left = right = null;

        }
    }

    class BinaryTree{
        Node root;
        
    }
}
Stack<Integer> s = new Stack<Integer>();
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int[] arr = new int[n];

