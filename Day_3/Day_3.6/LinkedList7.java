
class LinkedList7{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void insert(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data + "---->");
            n=n.next;
        }
    }
    void append(int new_data){
        Node new_node=new Node(new_data); // new node is created
        if(head==null){ //checking if the node is empty
            head=new_node;
        }
        // if the list is not empty
        new_node.next=null; // make the new node as last node in the list
        Node tail=head; // make a pointer to traverse till the last node
        while(tail.next!=null){
            tail=tail.next; // shifting to the next node
        }
        tail.next=new_node;
        return;
    }

    public static void main(String args[]){
        LinkedList7 L5= new LinkedList7();
        L5.head=new Node(5);

        L5.display();
        L5.insert(10);
        System.out.println();


         L5.display();
        L5.insert(15);
        System.out.println();

         L5.display();
        L5.insert(20);
        System.out.println();

         L5.display();
        L5.insert(25);
        System.out.println();

        L5.append(0);
        L5.display();
        System.out.println();

        L5.append(-5);
        L5.display();
        System.out.println();
    }
}
