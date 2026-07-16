import java.util.*;
public class Graph {
    private int ver;
    private Map<Integer,List<Integer>> graph = new HashMap<>();
    Graph(int ver)
    {
        this.ver = ver;
        for(int i=1;i<=ver;i++)
            graph.put(i,new ArrayList<>());
    }
    public void add(int src,int dst)
    {
        graph.get(src).add(dst);
    }
    public void dfs(int src)
    {
        Set<Integer> vis = new HashSet<>();
        dfsR(src,vis);
    }
    public int getConnectedCom()
    {
        int count = 0;
        Set<Integer> vis = new HashSet<>();
        for(int i=1;i<=ver;i++)
        {
            if(!vis.contains(i)) {
                dfsR(i,vis);
                count++;
            }
        }
        return count;
    }
    private void dfsR(int src,Set<Integer> vis)
    {
        //System.out.println(src+" ");
        vis.add(src);
        for(int i:graph.get(src))
        {
            if(!vis.contains(i))
                dfsR(i,vis);
        }
    }
    private boolean detectCycle(int src,int parent,Set<Integer> vis)
    {
        vis.add(src);
        for(int adj : graph.get(src))
        {
            if(!vis.contains(adj)){
                if(detectCycle(adj,src,vis))
                    return true;
            }
            else if(adj!=parent)
                return true;
        }
        return false;
    }
    public boolean hasCycle()
    {
        Set<Integer> vis = new HashSet<>();
        return detectCycle(1,-1,vis);
    }
}
