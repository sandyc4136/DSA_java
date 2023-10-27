class Linkedlist3{
	
	Node head;//instance
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	void display()
	{
	Node n = head;
	while(n!= null)
	{
		System.out.print(n.data+ "---> ");
		n=n.next;
	}
	}

	
	
	public static void main(String args[]){
		
		Linkedlist3 L1 = new Linkedlist3();
		L1.head = new Node(5);
		Node second = new Node(7);
		Node third = new Node(9);
		
		L1.head.next = second;
		second.next = third;
		
		L1.display();
	
	}
}