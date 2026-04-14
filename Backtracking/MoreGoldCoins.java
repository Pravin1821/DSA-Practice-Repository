import java.util.*;
public class MoreGoldCoins{
	static int[][] a;
	static int max,n,m;
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		a=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]!=0)
					backtrack(i,j,0);
			}
		}
		System.out.print(max);
	}
	public static void backtrack(int i,int j,int sum)
	{
		if(i<0 || j<0 || i>=n || j>=m ||a[i][j]==0)
			return;
		sum+=a[i][j];
		int temp = a[i][j];
		a[i][j] = 0;
		max=Math.max(max,sum);
		backtrack(i,j+1,sum);
		backtrack(i+1,j,sum);
		backtrack(i-1,j,sum);
		backtrack(i,j-1,sum);
		a[i][j] = temp;
	}
}