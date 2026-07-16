import java.util.*;
public class MinLen{
	public static int minLen(int[] a,int k)
	{
		int min=Integer.MAX_VALUE;
		int l=0,r=0,sum=0;
		while(r<a.length)
		{
			sum+=a[r];
			while(sum>k)
			{
				sum-=a[l];
				l++;
			}
			if(sum==k)
			{
				min=Math.min(min,r-l+1);
			}
			r++;
		}
		return min==Integer.MAX_VALUE ? 0 : min;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)	
			a[i]=scan.nextInt();
		System.out.println(minLen(a,k));
	}
}