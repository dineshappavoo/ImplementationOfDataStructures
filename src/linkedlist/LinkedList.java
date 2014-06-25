/**
 * 
 */
package linkedlist;

/**
 * @author Dinesh Appavoo
 *
 */
public class LinkedList {

	public Node first,last;
	
	public LinkedList()
	{
		//first=new Node();
		//last=new Node();

	}
	
	public void insertFirst(int data)
	{	
		Node f=first;
		Node newNode=new Node(data);
		first=newNode;
		/*if(f!=null)
		{
			first.next=f;
		}else
		{
			last=newNode;
		}*/
		
		if (f == null)
			last = newNode;
		else
		{
			f.prev = newNode;
			first.next=f;
		}
		
	}
	
	public void insertLast(int data)
	{
		Node l=last;
		Node newNode=new Node(data);
		last=newNode;
		if(l==null)
		{
			first=newNode;
		}
		else
		{
			l.next=newNode;
			newNode.prev=l;
			
		}
		
		
		//node=n;
	}
	
	public void traverseList()
	{
		Node n=first;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
				
	}
}
