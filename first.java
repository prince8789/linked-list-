package linked_list;
class Node{
    int data;
    Node next;
    Node(){

    }
    Node(int data ){
        this.data = data;
    }
}
public class first {
    public static void main(String[] args) {
        Node a = new Node();
        a.data = 5;
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(25);
        Node e = new Node(28);


        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(a.next.data);


        
    }
    
}
