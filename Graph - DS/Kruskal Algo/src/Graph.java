import java.util.*;
public class Graph {
    private int ver;
    private int[] parent;
    private List<Edge> graph = new ArrayList<>();
    Graph(int ver)
    {
        this.ver = ver;
        parent = new int[ver];
        for(int i=0;i<ver;i++)
            parent[i]=i;
    }
    private class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int weig;

        Edge(int src, int dest, int weig) {
            this.src = src;
            this.dest = dest;
            this.weig = weig;
        }

        @Override
        public int compareTo(Edge temp) {
            return this.weig - temp.weig;
        }
    }
    public void add(int src,int dest, int weig)
    {
        graph.add(new Edge(src,dest,weig));
    }
    public void kruskal()
    {
        Collections.sort(graph);
        List<Edge> res = new ArrayList<>();
        int cost = 0;
        for(Edge cur : graph)
        {
            if(union(cur.src,cur.dest)) {
                res.add(cur);
                cost+=cur.weig;
                if(res.size()==ver-1)
                    break;
            }
        }
        System.out.println();
        for(Edge cur : res)
            System.out.println(cur.src+" "+cur.dest+" "+cur.weig);
        System.out.println("Minimum cost : "+cost);
    }
    private boolean union(int u,int v)
    {
        int du = find(u);
        int dv = find(v);
        if(du==dv)
            return false;
        parent[du] = dv;
        return true;
    }
    private int find(int node)
    {
        if(node == parent[node])
            return node;
        return parent[node] = find(parent[node]);
    }
    public void print()
    {
        System.out.println();
        for(Edge cur: graph)
            System.out.println(cur.src+" "+cur.dest+" "+cur.weig);
    }
}
