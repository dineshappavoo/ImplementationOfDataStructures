/**
 * 
 */
package treesandgraphs;

/**
 * @author Dany
 *
 */
public class TreeNode {

	
	public TreeNode left;
	public TreeNode right;
	public int data;
	
	public TreeNode(int data)
	{
		this.data=data;
	}
	
	public void insert(TreeNode root, int data)
	{
		if(root==null)
			return;
		if(data<=root.data)
		{
			if(data==root.data)
			{
				TreeNode node=root.left;
				TreeNode newNode=new TreeNode(data);
				newNode.left=node;
				root.left=newNode;				
			}else
			{
				if(root.left==null)
				{
					TreeNode newNode=new TreeNode(data);
					root.left=newNode;
				}else
				insert(root.left, data);

			}
		}else if(data>root.data)
		{
			if(root.right==null)
			{
				TreeNode newNode=new TreeNode(data);
				root.right=newNode;
				
			}else
				insert(root.right, data);
		}
	}
	
	public void doInOrderTraversal(TreeNode root)
	{
		if(root==null)
			return;
		doInOrderTraversal(root.left);
		System.out.println(root.data);
		doInOrderTraversal(root.right);
	}
	
}
