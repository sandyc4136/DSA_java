

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
    boolean search(int x){
        Node temp=head;
        while(temp!=null){
        if(temp.data==x)
        return true;
        temp=temp.next;
        }
        return false;
    }

    /*int recursiveCount(Node n){
        // base case
        Node n=head;
        if(n==null)
        return 0;
        return 1+recursiveCount(n.next);
    }*/

    Node reverse(){
        Node current =head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            // System.out.print(prev.data + " ---> ");
        }
        head=prev;
        return head;
    }
    public static void main(String args[]){
        Linkedlist10 L1=new Linkedlist10();
        L1.head=new Node(10);
        L1.insert(20);
        L1.insert(30);
        L1.display();
        System.out.println();
        System.out.println("Total node count = "+ L1.count());
        System.out.println("30 present in the list - "+ L1.search(30));
        //System.out.print("Total node count = "+ recursiveCount(head));
        L1.reverse();
        L1.display();
    }
}
