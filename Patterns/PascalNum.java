import java.util.*;
public class PascalNum{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("1 ");
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}