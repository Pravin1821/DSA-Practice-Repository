import java.util.*;
public class Main{
    static int v;
    static int[][] edges;
    static DisjointSet ds;
    public static void hasCycle(int n,int[][] edges)
    {
        for(int[] edge:edges)
        {
            if(ds.union(edge[0],edge[1]))
            {
                System.out.println("Cycle Detected : "+edge[0]+" "+edge[1]);
                return;
            }
        }
        System.out.println("No Cycle Detected");
    }
    public static int getConnectedComp(int n,int[][] edges)
    {
        int components = v;
        for(int[] edge:edges)
        {
            if(!ds.union(edge[0],edge[1]))
                components--;
        }
        return components;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        v=scan.nextInt();
        ds = new DisjointSet(v);
        int n = scan.nextInt();
        edges = new int[n][2];
        for(int i=0;i<n;i++)
        {
            edges[i][0] = scan.nextInt();
            edges[i][1] = scan.nextInt();
        }
        //hasCycle(n,edges);
        System.out.println("Number of Connected-components = "+getConnectedComp(n,edges));
    }
}