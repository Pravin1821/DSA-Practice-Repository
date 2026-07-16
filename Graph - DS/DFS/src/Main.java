import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        Graph gp = new Graph(v);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
            gp.add(scan.nextInt(),scan.nextInt());
        //gp.dfs(1);
        //System.out.println(gp.hasCycle());
        System.out.println(gp.getConnectedCom());
    }
}