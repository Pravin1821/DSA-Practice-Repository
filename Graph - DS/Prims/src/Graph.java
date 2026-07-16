import java.util.*;
public class Graph {
    private class Edge{
        char src, dest;
        int weg;
        Edge(char src,char dest,int weg)
        {
            this.src = src;
            this.dest = dest;
            this .weg = weg;
        }
    }
    private class Pair implements Comparable<Pair>{
        char node, parent;
        int cost;
        Pair(char node, int cost, char parent)
        {
            this.node = node;
            this.cost = cost;
            this.parent = parent;
        }

        public int compareTo(Pair temp)
        {
            return this.cost - temp.cost;
        }
    }
    private int ver;
    private Map<Character,List<Edge>> graph = new HashMap<>();
    Graph(int ver){
        this.ver = ver;
    }

    public void add(char src,char dest, int weg)
    {
        graph.computeIfAbsent(src, key -> new ArrayList<>()).add(new Edge(src,dest,weg));
        graph.computeIfAbsent(dest, key -> new ArrayList<>()).add(new Edge(dest,src,weg));
    }

    private void prims(char st)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        Set<Character> vis = new HashSet<>();
        int totalCost = 0;
        pq.add(new Pair(st,0, '-'));
        while(!pq.isEmpty())
        {
            Pair cur = pq.poll();
            if(vis.contains(cur.node))
                continue;
            vis.add(cur.node);
            totalCost += cur.cost;
            System.out.println("Node : "+cur.node+" , Parent : "+cur.parent+" , Cost : "+cur.cost);
            for(Edge adj : graph.get(cur.node))
            {
                if(!vis.contains(adj.dest))
                    pq.add(new Pair(adj.dest, adj.weg, cur.node));
            }
        }
        System.out.println("Total Minimum Cost : "+totalCost);
    }

    public void prims()
    {
        prims('A');
    }
}
