import java.util.*;
public class basiclLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data in linked list");
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node(sc.nextInt());
        Node d = new Node(sc.nextInt());
        Node e = new Node(sc.nextInt());
        a.next=b;
        b.next =c;
        c.next=d;
        d.next= e;
        Node temp =a;
        for(int i =0;i<5;i++){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    
}
