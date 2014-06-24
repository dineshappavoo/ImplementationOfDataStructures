/**
 * 
 */
package linkedlist;

/**
 * @author Dinesh Appavoo
 *
 */
public class LinkedList {

	public Node node;
	
	public LinkedList()
	{
		node=new Node();
	}
	
	public void insert(int data)
	{		
		Node n=this.node;
		if(n==null)
		{
			n=new Node(data);
			return;
		}
		while(n.next!=null)
		{
			n=n.next;
		}
		node=new Node(data);
	}
	
	public void traverseList()
	{
		Node n=this.node;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
				
	}
}
