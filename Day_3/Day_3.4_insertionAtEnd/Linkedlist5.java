

class Linkedlist5 {
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
    void appendAtEnd(){}
    public static void main(String args[]){
        Linkedlist5 L5= new Linkedlist5();
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
    }
}
