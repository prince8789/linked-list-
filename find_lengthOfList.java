
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class find_lengthOfList {
        public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(25);
        Node e = new Node(28);
        Node f = new Node(79);
        Node g = new Node(7);
        Node h = new Node(987);
        Node i = new Node(7);
        Node j= new Node(256);

        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        
        System.out.println(Count(a));
        System.out.println(Count_Recursive(a));
    }
    //iterative 
    public static int Count(Node head){
        int length =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        return length;
    }


    //recursive
public static int Count_Recursive(Node head){
    if(head == null){
        return 0;
    }
    return 1 + Count_Recursive(head.next);
}


}
