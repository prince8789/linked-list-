public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    public static Node Head;
    public static Node tail;

    public void addFirst(int data){
        //step 1 create new node
        Node newnode = new Node(data);

        if(Head==null){
            Head = tail = newnode;
            return;
        }

        // step 2 new node -> head
        newnode.next = Head;

        //step 3 change head
        Head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(Head == null){
            Head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print(){
        if(Head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        
        
    }
    
}
