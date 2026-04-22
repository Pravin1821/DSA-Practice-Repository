import java.util.*;
public class MaxPointsCards{
	public static int MaxPoints(int[] a,int n,int k)
	{
		int lsum=0,rsum=0,max=0;
		for(int i=0;i<=k-1;i++)
			lsum+=a[i];
		int rind=n-1;
		max=lsum;
		for(int i=k-1;i>=0;i--)
		{
			lsum-=a[i];
			rsum+=a[rind];
			max=Math.max(max,lsum+rsum);
			rind--;
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k=scan.nextInt();
		System.out.println(MaxPoints(a,n,k));
	}
}