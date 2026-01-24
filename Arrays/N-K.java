import java.util.*;
public class NK;
{
	public static void build(int n,int k){
		if(n>k)
		{
			System.out.print("-1");
			return;
		}
		int a[]=new int[n];
		for(int i=1;i<n;i+=2)
			a[i]=2;
		int g=k-(n/2);
		for(int i=n-1;i>0;i-=2)
		{
			a[i]=1;
			g-=1;
		}
		a[0]=g;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- >0)
		{
			int n=scan.nextInt();
			int k=scan.nextInt();
			build(n,k);
			System.out.println();
		}
	}
}