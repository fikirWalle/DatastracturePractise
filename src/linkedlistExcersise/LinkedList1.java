package linkedlistExcersise;

public class LinkedList1
{ 
    Node head;  
  

    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    
    void deleteNode(int key) 
    { 
       
        Node temp = head, prev = null; 
  
      
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
 
        while (temp != null && temp.data != key) 
      { 
           prev = temp; 
          temp = temp.next; 
       } 
        
             
       
  
        
        if (temp == null) return; 
 

        prev.next = temp.next; 
    } 
  
   
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
  
   
        
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    public void deleteNodmine(int key) {
    	
    	 Node prev=null;
    	   if (head==null) {
    		   return;
    	   }
    	   
    	   while(head!=null&&head.data!=key) {
    		   
    		   
    		  prev=head;
    		  head=head.next;
    	   }
    	
    	   if (head == null) return; 
    	   
    	   prev.next=head.next;
    	   
    }
    
    public void addnodemine(int x) {
    	
    	   Node newnode= new Node(x);
    	   
    	  
    		   
    		   newnode.next=head;
    		   head=newnode;
    	   
    	
    }
    
    public int countlength() {
    	
    	 Node first=head;
    	int count=0;
    	while(first!=null) {
    		 count++;
    		
    		first=first.next;
    	}
    	return count;
    }
    
    public void printlistmine() {
    
    	   Node first=head;
    	  while(first!=null) {
    		  
    		  System.out.print(first.data);
    		  
    		  first=first.next;
    	  }
    	
    }
  
    public boolean Searchelement(Node head, int x) {
    	
    	boolean isfound=false;
    	   if(head==null)return false;
    	   Node first=head;
    	   
    	   while(first!=null) {
    		   if(first.data==x) {
    			   isfound=true;
    			   return isfound;
    			   
    		   }
    		   first=first.next;
    		   
    	   }
    	
    	
    	
		return isfound;
    	}
   
  
    public static void main(String[] args) 
    { 
    	LinkedList1 llist = new LinkedList1(); 
  
        llist.addnodemine(7); 
        llist.addnodemine(1); 
        llist.addnodemine(3); 
        llist.addnodemine(2); 
  
       // System.out.println("\nCreated Linked list is:"); 
       llist.printlistmine(); 
  
       llist.deleteNodmine(3); 
       
      System.out.println(" ");
       llist.printlistmine();
      int answer=llist.countlength();
      System.out.println();
      System.out.println(answer);
    boolean answer2=  llist.Searchelement(llist.head,3);
    System.out.println(answer2);
    } 
} 