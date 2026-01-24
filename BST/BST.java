import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int val)
	{
		data=val;
		left=right=null;
	}
}
public class BST{
	public static Node Insert(Node root,int val)
	{
		if(root==null)
			return new Node(val);
		if(val<root.data)
			root.left=Insert(root.left,val);
		else
			root.right=Insert(root.right,val);
		return root;
	}
	public static Node GetSucc(Node root)
	{
		Node cur=root.right;
		while(cur!=null && cur.left!=null)
			cur=cur.left;
		return cur;
	}
	public static Node Delete(Node root, int val)
	{
		if(root==null) return null;
		if(val<root.data)
			root.left=Delete(root.left,val);
		else if(val>root.data)
			root.right=Delete(root.right,val);
		else{
			if(root.left==null) return root.right;
			if(root.right==null) return root.left;
			Node cur=GetSucc(root);
			root.data=cur.data;
			root.right=Delete(root.right,cur.data);
		}
		return root;
	}
	public static ArrayList<ArrayList<Integer>> LevelOrder(Node root) //BFS
	{
		if(root == null)	return new ArrayList<>();
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int i=0;
		while(!q.isEmpty())
		{
			int len=q.size();
			al.add(new ArrayList<>());
			for(int j=0;j<len;j++)
			{
				Node cur=q.poll();
				al.get(i).add(cur.data);
				if(cur.left!=null)
					q.add(cur.left);
				if(cur.right!=null)
					q.add(cur.right);
			}
			i++;
		}
		return al;
	}
	public static void inOrder(Node root,ArrayList<Integer> al) //DFS
	{
		if(root==null)	return;
		inOrder(root.left,al);..................
		al.add(root.data);
		inOrder(root.right,al);
	}
	public static void preOrder(Node root,ArrayList<Integer> al) //DFS
	{
		if(root==null)	return;
		al.add(root.data);
		preOrder(root.left,al);
		preOrder(root.right,al);
	}
	public static void postOrder(Node root,ArrayList<Integer> al) //DFS
	{
		if(root==null)	return;
		postOrder(root.left,al);
		postOrder(root.right,al);
		al.add(root.data);
	}
	public static int searchVal(Node root,int val)
	{
		if(root==null)
			return -1;
		if(root.data==val)
			return val;
		else if(val<root.data)
			return searchVal(root.left,val);
		else 
			return searchVal(root.right,val);
	}
	public static int Depth(Node root)
	{
		if(root==null) return 0;
		return 1+Math.max(Depth(root.left),Depth(root.right));
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		Node root=null;
		root=Insert(root,50);
		root=Insert(root,30);
		root=Insert(root,70);
		root=Insert(root,20);
		root=Insert(root,40);
		root=Insert(root,60);
		root=Insert(root,80);
		//ArrayList<Integer> al=new ArrayList<>();
		//inOrder(root,al);
		//preOrder(root,al);
		//postOrder(root,al);
		//System.out.print(Depth(root));
		ArrayList<ArrayList<Integer>> al=LevelOrder(root);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}
		