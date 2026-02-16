import java.util.*;
public class TrappingWater{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.print(TrappingRainWater(a,n));
	}
	public static int TrappingRainWater(int[] a,int n)
	{
		int i=0,j=n-1;
		int max = 0;
		while(i<j)
		{
			int area = Math.min(a[i],a[j])*(j-i);
			max = Math.max(max,area);
			if(a[j]>a[i])
				i++;
			else
				j--;
		}
		return max;
	}
}