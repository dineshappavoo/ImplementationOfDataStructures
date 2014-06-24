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
		Node n=node;
		Node newNode=new Node(data);
		node=newNode;
		if(n!=null)
		{
			node.next=n;
		}
		
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
