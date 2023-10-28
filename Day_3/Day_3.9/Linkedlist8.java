class Linkedlist8{
	 
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

	void insert(int new_data)
	{
		
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
	}
	
	
void append(int new_data)
{
	//new node is created
	Node new_node = new Node(new_data);
	//check list is empty ? 
	if(head == null)
		{
			head = new_node;
			return;
		}
	//if list is not empty
	new_node.next = null;//condition for last node in the list
	
	Node last = head;//traverse ke liya new reference create kiya hai
	//last.next: last node tak le jayega
	while(last.next != null)
	{
		last = last.next;// shifting to next node
	}
	last.next = new_node;// connect to new node
	return;
}

void insertAfter(Node prev_node,int new_data)
{
	//check list is empty ?
	if(prev_node == null)
	{
		System.out.println("Empty list !!!");
		return;
	}
	//if list is not empty
	Node new_node = new Node(new_data);
	new_node.next = prev_node.next;
	prev_node.next = new_node;
}

void deleteNode(int key)//19
{
	Node temp = head, prev = null;
	/*  if(temp != null && temp.data == key)
	 {
	 	head = temp.next;
		return;
	 } 
     */

    // OR 

    if(head==null){
        return;
    }
    if(temp.data==key){
        head=temp.next;
        return;
    }
	//Last or intermediate
	while(temp != null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}
	if(temp == null)
	return;
	prev.next = temp.next;
	
	
}
void deletenode(int position)
{
	if(head == null)
		return;
	Node temp=head, prev=null;
	//Deletion at the begining
	
    if(position == 0)
	{
		head=temp.next;
		return;
	}
    
	//Deletion at the intermediate node
	for(int i=0;temp != null && i<position-1;i++)
	{
		temp=temp.next;
	}
	if(temp == null || temp.next == null )
		return;
	prev = temp.next.next;
	temp.next = prev;
	
}

	
	public static void main(String args[]){
		
		Linkedlist8 L1 = new Linkedlist8();
		L1.head = new Node(9);
		
		L1.display();
		L1.insert(7);
		System.out.println();
		//L1.display();
		
		L1.display();
		L1.insert(5);
		System.out.println();
		//L1.display();
		
		L1.display();
		L1.insert(10);
		System.out.println();
		//L1.display();
		
		
		L1.insert(15);
		System.out.println();
		L1.display();
		
		L1.append(23);
		System.out.println();
		L1.display();
		
		L1.append(33);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head.next, 53);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head, 63);
		System.out.println();
		L1.display();
		
		L1.insertAfter(L1.head.next.next, 53);
		System.out.println();
		L1.display();
		
		L1.deleteNode(53);
		System.out.println();
		L1.display();

        L1.deletenode(1);
        System.out.println();
        L1.display();
	
	}
}
