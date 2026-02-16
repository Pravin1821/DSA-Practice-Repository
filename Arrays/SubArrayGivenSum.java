import java.util.*;
public class SubArrayGivenSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int t=scan.nextInt();
		SubArrayWithGivenSum(a,t);
	}
	public static void SubArrayWithGivenSum(int[] a,int t)
	{
		int l=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			while(sum>t)
			{
				sum-=a[l];
				l++;
			}
			if(sum==t)
			{
				System.out.print(l+" "+i);
				return;
			}
		}
		System.out.print("No sub array presented");
	}
}