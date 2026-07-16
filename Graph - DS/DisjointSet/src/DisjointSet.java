public class DisjointSet {
    private int n;
    private int[] parent;
    private int[] rank;
    DisjointSet(int n)
    {
        this.n = n;
        parent = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }
    public boolean union(int u,int v)
    {
        int pu = find(u);
        int pv = find(v);
        if(pu == pv)
            return true;
        //parent[pu] = pv;
        if(rank[pu]<rank[pv]) {
            parent[pu]=pv;
            rank[pv]+=rank[pu];
        }
        else {
            parent[pv]=pu;
            rank[pu]+=rank[pv];
        }
        return false;
    }
    public int find(int node)
    {
        if(parent[node]==node)
                return node;
        return parent[node] = find(parent[node]);
    }
}
