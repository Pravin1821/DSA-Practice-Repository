import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int n=scan.nextInt();
        Graph graph = new Graph(v);
        for(int i=0;i<n;i++)
        {
            graph.union(scan.nextInt(), scan.nextInt());
        }
        graph.displayP();
//        graph.dfsWithSrc(scan.nextInt());
//        graph.dfsWithOutSrc();
    }
}