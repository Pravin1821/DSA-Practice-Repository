import java.util.*;
public class Main{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int prev[]=new int[2*n];
		//System.out.print(prev.length);
		Arrays.fill(prev,n+1);
		for(int i=1;i<=n;i++)
		{
			int cur[]=new int[2*n];
			for(int j=1;j<=(2*n-1);j++)
			{
				
				if((j>=i) && (j<=(2*n)-i))
				{
					System.out.print((prev[j]-1)+" ");
					cur[j]=prev[j]-1;
				}
				else
				{
					System.out.print(prev[j]+" ");
					cur[j]=prev[j];
				}
			}
			prev=cur;
			System.out.println();
		}
		for(int i=n;i>1;i--)
		{
			int cur[]=new int[2*n];
			for(int j=1;j<=(2*n-1);j++)
			{
				
				if((j>=i) && (j<=(2*n)-i))
				{
					System.out.print((prev[j]+1)+" ");
					cur[j]=prev[j]+1;
				}
				else
				{
					System.out.print(prev[j]+" ");
					cur[j]=prev[j];
				}
			}
			prev=cur;
			System.out.println();
		}
	}
}