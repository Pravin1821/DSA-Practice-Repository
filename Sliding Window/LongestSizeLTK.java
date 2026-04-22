import java.util.*;
public class LongestSizeLTK{
	public static int SizeLessThenK(int[] a,int n,int k)
	{
		int l=0,r=0,maxlen=0,sum=0;
		while(r<n)
		{
			sum+=a[r];
			if(sum>k)
			{
				sum-=a[l];
				l++;
			}
			if(sum<=k)
				maxlen = Math.max(maxlen,(r-l+1));
			r++;
		}
		return maxlen;
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k=scan.nextInt();
		System.out.println(SizeLessThenK(a,n,k));
	}
}