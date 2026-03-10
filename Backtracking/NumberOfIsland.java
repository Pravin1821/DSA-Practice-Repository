import java.util.*;
public class NumberOfIsland{
	static char[][] a;
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		a=new char[][]{
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]=='1')
				{
					count++;
					backtrack(i,j);
				}
			}
		}
		System.out.println(count);
	}
	public static void backtrack(int r,int c)
	{
		if(r<0 || c<0 || r>=a.length || c>=a[0].length || a[r][c]=='0')
			return;
		a[r][c]='0';
		backtrack(r+1,c);
		backtrack(r,c+1);
		backtrack(r-1,c);
		backtrack(r,c-1);
	}
}