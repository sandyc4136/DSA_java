

 class Linkedlist10 {
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
            System.out.print(n.data + "--->");
            n=n.next;
        }
        
    }
    int count(){
        int count=0;
        Node n=head;
        while(n!=null){
            count++;
            n=n.next;
        }
        return count;
    }
    public static void main(String args[]){
        Linkedlist10 L1=new Linkedlist10();
        L1.head=new Node(10);
        L1.insert(20);
        L1.insert(30);
        L1.display();
        System.out.println();

        System.out.print("Total node count = "+ L1.count());

    }
}
