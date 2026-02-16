import java.util.*;
public class TwoSum{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int t=scan.nextInt();
		int i=0,j=n-1;
		while(i<j)
		{
			if(a[i]+a[j]==t)
			{
				System.out.print("Index 1: "+i+" Index 2: "+j);
				return;
			}
			else if(a[i]+a[j]>t)
				j--;
			else
				i++;
		}
		System.out.print("No two sum");
	}
}