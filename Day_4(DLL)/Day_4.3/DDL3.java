

 class DLL3 {
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
            //new_node.prev=null;
            //new_node.next=null;
            if(head!=null){
               head.prev=new_node;
            }
            head=new_node;
        }
    
    public static void main(String args[]){
        DLL3 L1=new DLL3();
        L1.head=new Node(50);
        L1.insert(40);
        L1.insert(30);
        L1.insert(20);
        L1.insert(10);
    }

 }
