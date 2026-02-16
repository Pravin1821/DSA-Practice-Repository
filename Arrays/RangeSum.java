import java.util.*;
public class RangeSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int i=scan.nextInt();
		int j=scan.nextInt();
		if(i<0 || j>=n)
		{
			System.out.print("Not possible");
			return;
		}
		int sum =0;
		for(int k=i;i<j;k++)
			sum+=a[k];
		System.out.print("Range Sum: "+sum);
	}
}