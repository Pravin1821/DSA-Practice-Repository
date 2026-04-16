import java.util.*;
public class WordSearch{
	static char[][] a;
	static boolean[][] b;
	public static boolean backtrack(int i,int j, int ind, String s)
    {
        if(ind == s.length())
            return true;
        if(j<0 || i<0 || i>=a.length || j>=a[0].length || b[i][j] || a[i][j]!=s.charAt(ind))
            return false;
        b[i][j]=true;
        if(backtrack(i,j+1,ind+1,s))
            return true;
        if(backtrack(i-1,j,ind+1,s))
            return true;
        if(backtrack(i,j-1,ind+1,s))
            return true;
        if(backtrack(i+1,j,ind+1,s))
            return true;
        b[i][j]=false;
        return false;
    }
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt(),c=scan.nextInt();
		a=new char[r][c];
		b=new boolean[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=scan.next().charAt(0);
		String s=scan.next();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(backtrack(i,j,0,s))
				{
					System.out.print("True");
					return;
				}
			}
		}
		System.out.print("False");
	}
}