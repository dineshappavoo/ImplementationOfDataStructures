/**
 * 
 */
package treesandgraphs;

/**
 * @author Dany
 *
 */
public class TreeNodeTest {

	public static void main(String[] args) {

		new TreeNodeTest().testTreeNode();
	}
	
	public void testTreeNode()
	{
		TreeNode root=new TreeNode(18);
		root.insert(root, 14);
		root.insert(root, 25);
		root.insert(root, 15);
		root.doInOrderTraversal(root);
	}

}
