package linkedlistExcersise;


public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() {
		//implement
		if(header.next==null) {
			
			return null;
		}
		String removed=header.next.value;
		Node first=header.next.next;
		
		header.next=first;
		first.previous=header;
		return removed;
	}
	public String deletelast() {
		
		if(header.next==null) {
			
			return null;
		}
		Node last=header.next;
		
		 while(last.next!=null) {
			 
			 last=last.next;
		 }
		  String removed=last.value;
		 Node newlast=last.previous;
	
		 newlast.next=null;
		 
		return removed;
	}
	
	public void addFirst(String data) {
		
		Node newnode=new Node();
		if(header.next==null) {
			newnode.value=data;
			header.next=newnode;
			newnode.previous=header;
			
		}
		else {
			
			
			Node first=header.next;
			header.next=newnode;
			newnode.previous=header;
			newnode.next=first;
			first.previous=newnode;
			newnode.value=data;
		}
	}
	
	public void myAddlast(String data) {
		
		  Node newnode=new Node();
		  if(header.next==null) {
			  
			  header.next=newnode;
				newnode.previous=header;
			  newnode.value=data;
			  
		  }
		  else {
			  
			   Node last=header.next;
			   while(last.next!=null) {
				   
				   last=last.next;
			   }
			last.next=newnode;
			  newnode.previous=last;
			  newnode.value=data;
			  
		  }
		
	}
	
	public boolean isEmpty() {
		//implement
		return true;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.myAddlast("Bob");
		list.myAddlast("Harry");
		list.myAddlast("Steve");
	//String deleted = list.deletelast();
	//System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
