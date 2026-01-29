import java.util.*;
public class basiclLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    // find the length of linked list iterative 
    public static int length(Node head){
        int l =0;
        while(head!=null){
            l++;
            head = head.next;

        }
        return l;
    }
    public static void displayrecursive(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        displayrecursive(head.next);
    }
    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
        public static void displayreverse(Node head){
        if(head==null)return;
        displayreverse(head.next);
        System.out.print(head.data+" ");
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
       // Node temp =a;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp= temp.next;
        // }
        
        Display(a);  
        System.out.println();
        System.out.println();
        displayrecursive(a);
        System.out.println();
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println();
        System.out.print("the length of linked list is ");
        System.out.println(length(a));
        

    }
    
}
