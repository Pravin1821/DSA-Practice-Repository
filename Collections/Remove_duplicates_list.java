import java.util.*;
class Node{
	int val;
	Node next;
	Node(int val)
	{
		this.val=val;
		this.next=null;
	}
}
class LinkedList{
	Node head;
	void add(int data)
	{
		Node nnode=new Node(data);
		if(head==null)
		{
			head=nnode;
			return;
		}
		Node cur=head;
		while(cur.next!=null)
			cur=cur.next;
		cur.next=nnode;
	}
	void display(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
		System.out.println();
	}
}	
public class Remove_duplicates_list{
	/*public static void removeDuplicates(Node head)
	{
		if(head==null)	return;
		Node cur=head;
		while(cur!=null && cur.next!=null)
		{
			if(cur.val==cur.next.val)
				cur.next=cur.next.next;
			else
				cur=cur.next;
		}
	}*/
	public static Node reverseList(Node head) {
        if(head==null || head.next==null)
            return head;
        Node newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;  
    } 
	public static void main(String [] args)
	{
		Scanner  scan=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		for(int i=0;i<7;i++)
			ll.add(scan.nextInt());
		ll.display();
		Node n=reverseList(ll.head);
		ll.display(n);
	}
}
