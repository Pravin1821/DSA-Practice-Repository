import java.util.*;
public class Selectionsort{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		selectionsort(a,n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void selectionsort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int ind=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[ind])
					ind=j;
			}
			int temp=a[i];
			a[i]=a[ind];
			a[ind]=temp;
		}
	}
}
		





























