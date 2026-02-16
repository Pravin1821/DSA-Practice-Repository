import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        //starPattern(n,0);
        revStarPattern(n,0);
    }
    public static void starPattern(int r, int c){
        if(r==0)
            return;
        if(c<r)
        {
            System.out.print("* ");
            starPattern(r,c+1);
        }
        else
        {
            System.out.println();
            starPattern(r-1,0);
        }
    }
    public static void revStarPattern(int r, int c){
        if(r==0)
            return;
        if(c<r)
        {
            revStarPattern(r,c+1);
            System.out.print("* ");
        }
        else
        {
            revStarPattern(r-1,0);
            System.out.println();
        }
    }
}
