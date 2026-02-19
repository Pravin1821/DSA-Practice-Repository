import java.util.*;
public class ProductArrayExceptItself{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		prodArray(a,n);
	}
	public static void prodArray(int[] a,int n)
	{
		int[] r=new int[n];
		int pre=1,post=1;
		Arrays.fill(r,1);
		for(int i=0;i<n;i++)
		{
			r[i]*=pre;
			pre*=a[i];
		}
		for(int i=n-1;i>=0;i--)
		{
			r[i]*=post;
			post*=a[i];
		}
		for(int i=0;i<n;i++)
			System.out.print(r[i]+" ");
	}
}