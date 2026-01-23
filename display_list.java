package linked_list;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class display_list {
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
        

        
        Display(a);
        Node head = a;
        System.out.println();
        Display_Rec(a);
        System.out.println();
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        



        
    }
    // display list by recursion 
    public static void Display_Rec(Node head){
        if(head == null){
            return ;
        }
        System.out.print(head.data+" ");
        Display_Rec(head.next);
    }





    //display list by function 
    public static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    
}
