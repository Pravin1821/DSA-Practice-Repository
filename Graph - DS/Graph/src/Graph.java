import java.util.*;
public class Graph {
    private int v;
    private int[] p;
    Graph(int v)
    {
        this.v = v;
        p=new int[v];
        for(int i=0;i<v;i++)
            p[i]=i;
    }
    private Map<Integer,List<Integer>> gp = new HashMap<>();
    private void addNode(int src,int dst)
    {
        if(!gp.containsKey(src))
            gp.put(src,new ArrayList<>());
        gp.get(src).add(dst);
    }
    private void dfsRec(int src,Set<Integer> vis)
    {
        if(!gp.containsKey(src))
            return;
        vis.add(src);
        System.out.print(src+" ");
        for(int cur:gp.get(src))
        {
            if(!vis.contains(cur))
                dfsRec(cur,vis);
        }
    }
    public void add(int node1,int node2)
    {
        addNode(node1, node2);
        addNode(node2, node1);
    }
    public void dfsWithSrc(int src){
        Set<Integer> vis = new HashSet<>();
        dfsRec(src,vis);
        System.out.println();
    }
    public void dfsWithOutSrc(){
        Set<Integer> vis = new HashSet<>();
        for(int node:gp.keySet())
        {
            if(!vis.contains(node))
                dfsRec(node,vis);
        }
        System.out.println();
    }
    public int find(int x)
    {
        if(p[x]==x)
            return x;
        p[x]=find(p[x]);
        return p[x];
    }
    public void union(int x,int y)
    {
        int rootx = find(x);
        int rooty = find(y);
        p[rootx] = rooty;
    }
    public void displayP()
    {
        for(int i:p)
            System.out.print(i+" ");
    }
}
