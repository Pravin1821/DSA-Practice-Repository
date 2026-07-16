import java.util.*;
public class Huffman
{
    static class Node implements Comparable<Node>{
        char c;
        int cost;
        Node left, right;
        Node(char c,int cost)
        {
            this.c=c;
            this.cost=cost;
        }
        Node(int cost,Node left,Node right)
        {
            this.cost = cost;
            this.left = left;
            this.right = right;
        }
        public int compareTo(Node temp)
        {	
            return this.cost-temp.cost;
        }
    }
    public static void print(Node root, String s)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            System.out.println(root.c+" : "+s);
            return;
        }
        print(root.left,s+"0");
        print(root.right,s+"1");
    }
    public static Node build(char[] a,int[] f)
    {
        PriorityQueue<Node> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)
            pq.add(new Node(a[i],f[i]));
        while(pq.size()>1)
        {
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node(left.cost+right.cost, left, right);
            pq.add(newNode);
        }
        return pq.poll();
    }
    public static int totalCost(Node root, int depth)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return root.cost*depth;
        return totalCost(root.left, depth+1) + totalCost(root.right, depth+1);
    }
	public static void main(String[] args) {
		int[] f={5,9,12,13,16,45};
		char[] a={'A','B','C','D','E','F'};
		Node root = build(a,f);
		int tCost = totalCost(root,0);
		System.out.println("Total Cost: "+tCost);
		print(root,"");
	}
}