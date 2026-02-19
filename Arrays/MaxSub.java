import java.util.*;
public class MaxSub{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k = scan.nextInt();
		System.out.print(maxSubArray(a,k));
	}
	public static int maxSubArray(int[] a,int k)
	{
		if(a.length<k)
			return 0;
		int sum=0, max=0;
		for(int i=0;i<k;i++)
			sum+=a[i];
		max = Math.max(max,sum);
		for(int i=0;i<a.length-k;i++)
		{
			sum-=a[i];
			sum+=a[i+k];
			max=Math.max(max,sum);
		}
		return max;
	}
}

//[2,3,1,2,4,3] k=2 ==> 7
