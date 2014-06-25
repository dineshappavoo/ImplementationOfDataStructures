/**
 * 
 */
package linkedlist;

/**
 * @author Dany
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		LinkedList lList=new LinkedList();
		lList.insertFirst(4);
		lList.insertFirst(10);
		lList.insertFirst(15);
		lList.insertFirst(54);
	
		lList.insertLast(234);
		lList.insertLast(3543);
		lList.insertLast(64);


		lList.traverseList();
		
	}
	
	

}
