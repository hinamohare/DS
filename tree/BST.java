package tree;
import java.math.*;
import queue.Queue;
 class Node {
	public int data;
	public Node left = null;
	public Node right = null;
	public Node(int input, Node left, Node right)
	{
		data = input;
		this.left = left;
		this.right = right;
	}
	public Node(int input)
	{
		data = input; 
	}
}
public class BST {

	Node root;
	public BST()
	{
		root = null;
	}
	public void insertNode(int input)
	{
		Node newnode = new Node(input);
		if(root == null)
		{
			root = newnode;
		}
		else
		{
			Node current = root;
			Node trailcurrent= null;
			while(current!=null)
			{
				trailcurrent = current;
				if(current.data > input)
					current = current.left;
				else
					current = current.right;
			}
			if( trailcurrent.data > input)
				trailcurrent.left = newnode;
			else
				trailcurrent.right = newnode;
		}
	}
	public int countNodes()
	{
		return getNodeCount(root);
	}
	public int getNodeCount(Node root){
		if (root == null)
			return 0;
		else 
			return (1 +  getNodeCount(root.left) + getNodeCount(root.right));
	}
	public int getTreeHeight()
	{
		return treeHeight(root);
	}
	public int treeHeight(Node root)
	{
		if (root == null)
		{
			return 0;
		}
		else
		{	
			return (1+ Math.max(treeHeight(root.left),treeHeight(root.right)));
		}
	}
	public void printlevelOrderTraversal()
	{
		Queue q = new Queue();
		if (root == null)
			{
				System.out.println("The tree is empty");
				return;
			}
		System.out.println("Printing tree nodes in level order");
		q.enqueue(root);
		while(!q.isempty()){
			Node temp =  (Node) q.dequeue();
			
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				q.enqueue(temp.left);
			if(temp.right!=null)
				q.enqueue(temp.right);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST t = new BST();
		t.insertNode(5);
		t.insertNode(-17);
		t.insertNode(16);
		t.insertNode(3);
		t.insertNode(11);
		t.insertNode(15);
		t.insertNode(1);
		t.printlevelOrderTraversal();
		
	}

}
