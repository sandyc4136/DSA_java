

 class DLL5{
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
        }
        void append(int new_data){
           Node new_node= new Node(new_data);
           Node last=head;
           new_node.next=null;
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
    public static void main(String args[]){
        DLL5 L1=new DLL5();
        L1.head=new Node(50);
        L1.insert(40);
        L1.insert(30);
         L1.insert(20);
        // L1.insert(10);
        L1.display(L1.head);
        L1.append(60);
        L1.display(L1.head);
    }

 }