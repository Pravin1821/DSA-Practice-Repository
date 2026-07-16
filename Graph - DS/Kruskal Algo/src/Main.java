import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        Graph gp = new Graph(v);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int src = scan.nextInt();
            int dest = scan.nextInt();
            int weig = scan.nextInt();
            gp.add(src,dest,weig);
        }
        gp.kruskal();
    }
}