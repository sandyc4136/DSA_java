

 class DLL4 {
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
            new_node.prev=null;
            new_node.next=head;
            
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
                System.out.println(n.data+"---> ");
                p=n;
                n=n.next;
            }
            System.out.println("----------------------------");
            System.out.println("Backward direction:");
            while(p != null)
            {
                System.out.println(p.data+"---> ");
                p=p.prev;
            }
        }
    public static void main(String args[]){
        DLL4 L1=new DLL4();
        L1.head=new Node(50);
        L1.insert(40);
        L1.insert(30);
         L1.insert(20);
        // L1.insert(10);
        L1.display(L1.head);
    }

 }