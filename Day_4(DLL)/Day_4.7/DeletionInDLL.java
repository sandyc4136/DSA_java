public class DeletionInDLL{
    Node head;
    static class Node{
        int data ;
        Node prev,next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
        void insert(int new_data){
            Node new_node=new Node(new_data);
            new_node.next=head;
            new_node.prev=null;
            
            
            if(head!=null){
               head.prev=new_node;
            }
            head=new_node;
        }
        
        void display(Node n)
        {
            Node p = null;
            System.out.println("Forward direction:");
            while(n != null)
            {
                System.out.print(n.data+"---> ");
                p=n;
                n=n.next;
            }
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("Backward direction:");
            while(p != null)
            {
                System.out.print(p.data+"---> ");
                p=p.prev;
            }
            System.out.println();
        }

        void append(int new_data){
           Node new_node= new Node(new_data);
           Node last=head;
           new_node.next=null; // last node in the list 
           if(head==null){
            new_node.prev=null;
            head=new_node;
            return;
           }
           while(last.next!=null){
            last=last.next;
           }
           last.next=new_node;
           new_node.prev=last;
           
        }
        void InsertAfter(Node prev_node, int new_data){
            if(prev_node==null){
                System.out.println("Node does not exist");
                return;
            }
            Node new_node=new Node(new_data);
            new_node.next=prev_node.next;
            prev_node.next=new_node;
            new_node.prev=prev_node;
            if(new_node.next!=null){
                new_node.next.prev=new_node;
            }
        }
        void deleteNode(Node n){
            // base condition
            if(head == null || n==null){
                return;
            }
            // deletion at the beginning
            if(head==n){
                head=head.next;
                //head.prev=null;
            }
            // deletion in between two elements
            if(n.next!=null){
                n.next.prev=n.prev;
            }
            if(n.prev!=null){
                n.prev.next=n.next;
            }
        }
    public static void main(String args[]){
        DeletionInDLL L1=new DeletionInDLL();
        // L1.head=new Node(50);
        L1.insert(40);
        L1.insert(30);
         L1.insert(20);
        // L1.insert(10);
        // L1.display(L1.head);
        L1.append(60);
        L1.display(L1.head);
        L1.InsertAfter(L1.head.next, 70);
        L1.display(L1.head);
        L1.deleteNode(L1.head.next);
        L1.display(L1.head);
    }

}