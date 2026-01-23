package linked_list;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
    }
}

public class reverse_Linked_list {
    public static void display_reverse(Node head){
        if(head == null){
            return;
        }
        display_reverse(head.next);
        System.out.print(head.data+" ");
    }
     public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(25);
        Node e = new Node(28);


        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display_reverse(a);

     }
    
}
