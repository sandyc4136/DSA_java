class NodeStructure{
    Node head;
    
    static class Node{
        int data;
        Node prev,next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
    public static void main(String args[]){
        NodeStructure DL1=new NodeStructure();
        DL1.head=new Node(5);
        System.out.println(DL1.head.data);
        System.out.println(DL1.head.next);
    }
}
