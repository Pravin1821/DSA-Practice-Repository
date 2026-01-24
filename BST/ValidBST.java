import java.util.*;
public class ValidBST{
	public static boolean bst(int[] a,int n)
	{
		if(n==0)	return false;
		int[] min=new int[n];
		int[] max=new int[n];
		min[0]=Integer.MIN_VALUE;
		max[0]=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]==-1)
				continue;
			if(a[i]<=min[i] || a[i]>=max[i])
				return false;
			int left=2*i+1;
			int right=2*i+2;
			if(left<n)
			{
				min[left]=min[i];
				max[left]=a[i];
			}
			if(right<n)
			{
				min[right]=a[i];
				max[right]=max[i];
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.print(bst(a,n));
	}
}