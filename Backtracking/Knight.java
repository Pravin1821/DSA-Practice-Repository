import java.util.*;
public class Knight{
    static int dr;
    static int dc;
    static boolean[][] b = new boolean[8][8];
    static int min=1000;
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int sr=scan.nextInt(), sc=scan.nextInt();
        dr=scan.nextInt()-1;
        dc=scan.nextInt()-1;
       // System.out.print(b[sr][sc]);
      //  System.out.print(sr+" "+sc+" "+dr+" "+dc);
        backtrack(sr-1,sc-1,b,0);
        System.out.print(min);
    }
    public static void backtrack(int r,int c,boolean[][] b,int count)
    {
        
        if(r==dr && c==dc)
        {
            min=Math.min(min,count);
          //  System.out.print(min);
          //  b[r][c]=false;
            return;
        }
        if(c<0 || r<0 || r>=8 || c>=8 || b[r][c] || count>=min)
            return;
        b[r][c]=true;
        backtrack(r+2,c+1,b,count+1);
        backtrack(r+2,c-1,b,count+1);
        backtrack(r-1,c+2,b,count+1);
        backtrack(r+1,c+2,b,count+1);
        backtrack(r+1,c-2,b,count+1);
        backtrack(r-1,c-2,b,count+1);
        backtrack(r-2,c-1,b,count+1);
        backtrack(r-2,c+1,b,count+1);
        b[r][c]=false;
        return;
    }
}