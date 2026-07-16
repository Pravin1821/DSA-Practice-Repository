import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        Graph gp = new Graph(v);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            char src = scan.next().charAt(0);
            char dest = scan.next().charAt(0);
            int weg = scan.nextInt();
            gp.add(src,dest,weg);
        }
        gp.prims();
    }
}