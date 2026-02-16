import java.util.*;
public class MinSizeSubArr{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int target=scan.nextInt();
		System.out.print(MinSize(a,target,n));
	}
	public static int MinSize(int[] a, int t, int n)
	{
		int min = Integer.MAX_VALUE;
		int sum=0,j=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			while(sum>t)
			{
				sum-=a[j];
				j++;
			}
			if(sum==t)
				min=Math.min(min,(i-j+1));
		}
		return (min==Integer.MAX_VALUE) ? 0 : min;
	}
}
